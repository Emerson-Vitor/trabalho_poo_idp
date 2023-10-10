package br.edu.idp.poo.trabalho;

import br.edu.idp.poo.trabalho.enums.ErrorType;
import br.edu.idp.poo.trabalho.enums.SiteStatus;
import br.edu.idp.poo.trabalho.site.SiteChecker;
import br.edu.idp.poo.trabalho.site.WorkingSite;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class TrabalhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoApplication.class, args);


		if (args.length != 2) {
			System.out.println("Por favor, forneça o caminho do arquivo de texto e do arquivo de log como argumentos.");
			System.exit(1);
		}


		String filePath = args[0];
		String logFilePath = args[1];


		List<URL> urlList = new ArrayList<>();


		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {

				URL url = new URL(line);
				urlList.add(url);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


		startSiteVerification(urlList, logFilePath);
	}

	private static void startSiteVerification(List<URL> urlList, String logFilePath) {
		List<SiteResult> results = new ArrayList<>();
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		try {

			for (URL url : urlList) {
				executorService.submit(() -> {

					SiteChecker siteChecker = new WorkingSite();
					SiteStatus status = siteChecker.checkSite(url);


					if (status == SiteStatus.WORKING) {
						results.add(new SiteResult(url.toString(), SiteStatus.WORKING, null));
					} else if (status == SiteStatus.FAULTY) {
						results.add(new SiteResult(url.toString(), SiteStatus.FAULTY, ErrorType.TIMEOUT));
					}
				});
			}
		} finally {

			executorService.shutdown();
			try {
				executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}


			JsonLogger jsonLogger = new JsonLogger(logFilePath);
			jsonLogger.logResults(results);
		}
	}
}