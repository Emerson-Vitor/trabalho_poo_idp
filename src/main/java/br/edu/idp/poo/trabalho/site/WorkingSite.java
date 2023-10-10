package br.edu.idp.poo.trabalho.site;


import br.edu.idp.poo.trabalho.enums.SiteStatus;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class WorkingSite implements SiteChecker {
    @Override
    public SiteStatus checkSite(URL url) {
        try {

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();


            if (responseCode == 200) {
                return SiteStatus.WORKING;
            }

        } catch (IOException e) {

            return SiteStatus.FAULTY;
        }


        return SiteStatus.FAULTY;
    }
}