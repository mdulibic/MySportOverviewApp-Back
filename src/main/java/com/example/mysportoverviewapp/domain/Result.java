package com.example.mysportoverviewapp.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name="result")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String team1;

    private String team2;

    private Integer team1Goals;

    private Integer team2Goals;

    private Integer leagueRound;
}
