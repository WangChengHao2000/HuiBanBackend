package com.example.huibanbackend.service.impl;

import com.example.huibanbackend.repository.ConferenceRepository;
import com.example.huibanbackend.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConferenceServiceImpl implements ConferenceService {

    @Autowired
    private ConferenceRepository conferenceRepository;

}
