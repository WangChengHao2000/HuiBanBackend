package com.example.huibanbackend.repository;

import com.example.huibanbackend.entity.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
