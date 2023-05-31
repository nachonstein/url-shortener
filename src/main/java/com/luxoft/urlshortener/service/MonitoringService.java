package com.luxoft.urlshortener.service;

import java.util.Date;
import java.util.List;

public interface MonitoringService {
    void disableShortenedURL(String code);
    List<String> listUrlFromUser(String email);
    List<String> listUrlBetweenDates(Date beginDate, Date endDate);
}
