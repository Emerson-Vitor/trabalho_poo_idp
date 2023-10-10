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
            // Simula uma verificação de site com falha
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            // Adicione mais lógica específica para determinar o tipo de erro, se necessário
            if (responseCode == 404) {
                return SiteStatus.FAULTY;
            }

        } catch (IOException e) {
            // Se houver uma exceção durante a conexão, considere como falha
            return SiteStatus.FAULTY;
        }

        // Se a resposta não for 404 ou não houver exceção, considere como funcionando
        return SiteStatus.WORKING;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}
