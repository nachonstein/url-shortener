package com.luxoft.urlshortener;

import com.luxoft.urlshortener.model.ShortenedURL;
import com.luxoft.urlshortener.service.ShortenedURLManagementService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Level;

@Log
@Component
public class MainApplicationRunner implements ApplicationRunner {


    @Autowired
    private ShortenedURLManagementService shortenedURLManagementService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.log(Level.INFO, "Application running..........");

        ShortenedURL shortUrlWithCode = new ShortenedURL("ignacio.nietojorge@dxc.com", "https://google.com", "aaaaa");

        String codeCreated = shortenedURLManagementService.createShortURL(shortUrlWithCode);
        log.log(Level.INFO, "Created code {0} for url: {1}", new Object[]{codeCreated, shortUrlWithCode.getTarget()});

        ShortenedURL shortUrlWithoutCode = new ShortenedURL("ignacio.nietojorge@dxc.com", "https://yahoo.com");
        codeCreated =shortenedURLManagementService.createShortURL(shortUrlWithoutCode);
        log.log(Level.INFO, "Created code {0} for url: {1}", new Object[]{codeCreated, shortUrlWithoutCode.getTarget()});




        String targetUrl = shortenedURLManagementService.navigateURL(codeCreated);
        log.log(Level.INFO, "Code {0} redirecting to {1} ......", new Object[]{codeCreated, targetUrl});





        log.log(Level.INFO,"Application stopping.........");
    }
}
