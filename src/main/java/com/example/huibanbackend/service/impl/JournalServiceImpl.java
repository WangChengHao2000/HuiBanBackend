package com.example.huibanbackend.service.impl;

import com.example.huibanbackend.repository.JournalRepository;
import com.example.huibanbackend.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JournalServiceImpl implements JournalService {

    @Autowired
    private JournalRepository journalRepository;

}
