package com.example.huibanbackend.repository;

import com.example.huibanbackend.entity.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal, Long> {
}
