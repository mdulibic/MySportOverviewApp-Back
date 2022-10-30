package com.example.mysportoverviewapp.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name="comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String message;

    @CreationTimestamp
    private Timestamp timestamp;

    @ManyToOne
    @JoinColumn(name="league_round_id", nullable=false)
    @JsonBackReference
    private LeagueRound leagueRound;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public LeagueRound getLeagueRound() {
        return leagueRound;
    }

    public void setLeagueRound(LeagueRound leagueRound) {
        this.leagueRound = leagueRound;
    }
}
