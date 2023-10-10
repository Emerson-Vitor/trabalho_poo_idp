package br.edu.idp.poo.trabalho.site;

import br.edu.idp.poo.trabalho.enums.SiteStatus;

import java.net.URL;

public interface SiteChecker {
    SiteStatus checkSite(URL url);
}
