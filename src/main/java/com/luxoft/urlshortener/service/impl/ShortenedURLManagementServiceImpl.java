package com.luxoft.urlshortener.service.impl;

import com.luxoft.urlshortener.model.Projections;
import com.luxoft.urlshortener.model.ShortenedURL;
import com.luxoft.urlshortener.repository.ShortenedURLRepository;
import com.luxoft.urlshortener.service.ShortenedURLManagementService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class ShortenedURLManagementServiceImpl implements ShortenedURLManagementService {
    @Autowired
    private ShortenedURLRepository shortenedURLRepository;

    @Override
    @Transactional
    public String createShortURL(ShortenedURL shortenedURL) {

        if (!StringUtils.hasText(shortenedURL.getShortenedCode())) {
            shortenedURL.setShortenedCode(RandomStringUtils.randomAlphabetic(7));
        }

        ShortenedURL savedShortenedURL = shortenedURLRepository.save(shortenedURL);

        return savedShortenedURL.getShortenedCode();
    }

    @Override
    @Transactional
    public String navigateURL(String code) {
        Optional<Projections.FullURL> target = shortenedURLRepository.findByShortenedCodeAndActive(code, true);

        return target.isPresent() ? target.get().getTarget() : "404.html";
    }
}
