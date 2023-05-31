package com.luxoft.urlshortener.service.impl;

import com.luxoft.urlshortener.service.MonitoringService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MonitoringServiceImpl implements MonitoringService {
    @Override
    public void disableShortenedURL(String code) {

    }

    @Override
    public List<String> listUrlFromUser(String email) {
        return null;
    }

    @Override
    public List<String> listUrlBetweenDates(Date beginDate, Date endDate) {
        return null;
    }
}
