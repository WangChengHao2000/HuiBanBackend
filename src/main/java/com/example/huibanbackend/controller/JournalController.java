package com.example.huibanbackend.controller;

import com.example.huibanbackend.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/journal")
public class JournalController {

    @Autowired
    private JournalService journalService;

}
