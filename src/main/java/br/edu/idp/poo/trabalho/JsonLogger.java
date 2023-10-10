package br.edu.idp.poo.trabalho;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonLogger {
    private String filePath;

    public JsonLogger(String filePath) {
        this.filePath = filePath;
    }

    public void logResults(List<SiteResult> results) {
        try (FileWriter writer = new FileWriter(filePath)) {
            Gson gson = new Gson();
            gson.toJson(results, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
