package com.example.mysportoverviewapp.domain;

import com.example.mysportoverviewapp.rest.comment.CommentDto;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String message;

    @CreationTimestamp
    private Timestamp timestamp;

    @ManyToOne
    @JoinColumn(name = "league_round_id", nullable = false)
    @JsonBackReference
    private LeagueRound leagueRound;

    public Comment() {

    }

    public Comment(CommentDto dto, LeagueRound round) {
        this.leagueRound = round;
        this.name = dto.getName();
        this.message = dto.getMessage();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
