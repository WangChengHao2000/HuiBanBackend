package com.example.huibanbackend.controller;

import com.example.huibanbackend.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/conference")
public class ConferenceController {

    @Autowired
    private ConferenceService conferenceService;

}
