package br.edu.idp.poo.trabalho;

import br.edu.idp.poo.trabalho.enums.ErrorType;
import br.edu.idp.poo.trabalho.enums.SiteStatus;

public class SiteResult {
    private String url;
    private SiteStatus status;
    private ErrorType errorType;

    public SiteResult(String url, SiteStatus status, ErrorType errorType) {
        this.url = url;
        this.status = status;
        this.errorType = errorType;
    }

    public String getUrl() {
        return url;
    }

    public SiteStatus getStatus() {
        return status;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}
