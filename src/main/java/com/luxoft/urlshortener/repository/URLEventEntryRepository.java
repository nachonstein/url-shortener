package com.luxoft.urlshortener.repository;

import com.luxoft.urlshortener.model.URLEventEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface URLEventEntryRepository extends JpaRepository<URLEventEntry, Long> {


}