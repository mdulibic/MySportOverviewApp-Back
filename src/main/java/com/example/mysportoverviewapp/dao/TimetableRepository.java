package com.example.mysportoverviewapp.dao;

import com.example.mysportoverviewapp.domain.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimetableRepository extends JpaRepository<Timetable, Long> {
}
