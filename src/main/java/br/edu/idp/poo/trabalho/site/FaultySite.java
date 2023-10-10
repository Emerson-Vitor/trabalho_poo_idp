package br.edu.idp.poo.trabalho.site;

import br.edu.idp.poo.trabalho.enums.ErrorType;
import br.edu.idp.poo.trabalho.enums.SiteStatus;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class FaultySite implements SiteChecker {
    private ErrorType errorType;

    public FaultySite(ErrorType errorType) {
        this.errorType = errorType;
    }

    @Override
    public SiteStatus checkSite(URL url) {
        try {
            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            
            if (responseCode == 404) {
                return SiteStatus.FAULTY;
            }

        } catch (IOException e) {
            
            return SiteStatus.FAULTY;
        }

        
        return SiteStatus.WORKING;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}
