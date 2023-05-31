package com.luxoft.urlshortener.repository;

import com.luxoft.urlshortener.model.Projections;
import com.luxoft.urlshortener.model.ShortenedURL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ShortenedURLRepository extends JpaRepository<ShortenedURL, Long> {
    Optional<Projections.FullURL> findByShortenedCodeAndActive(String code, boolean active);

    List<ShortenedURL> findByEmail(String user);
    List<ShortenedURL> findByCreationBetween(Date begin, Date end);
}