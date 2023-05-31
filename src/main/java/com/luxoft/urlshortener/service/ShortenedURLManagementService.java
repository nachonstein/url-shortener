package com.luxoft.urlshortener.service;

import com.luxoft.urlshortener.model.ShortenedURL;

import javax.transaction.Transactional;

public interface ShortenedURLManagementService {

    @Transactional
    String createShortURL(ShortenedURL shortenedURL);

    String navigateURL(String code);
}
