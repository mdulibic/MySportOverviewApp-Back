package com.example.mysportoverviewapp.dao;

import com.example.mysportoverviewapp.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
