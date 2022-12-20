package com.sportradar.scoreboard;

import java.util.Objects;
import java.util.stream.IntStream;

public class Game {

    private final String homeTeam;
    private final String awayTeam;
    private int[] score;
    private final Long timestamp;


    public Game(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.score = new int[]{0, 0};
        this.timestamp = System.nanoTime();
    }

    public int[] getScore() {
        return score;
    }

    public Integer getTotalScore() {
        return IntStream.of(score).sum();
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void updateScore(int[] score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return homeTeam.equals(game.homeTeam)
                && awayTeam.equals(game.awayTeam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeTeam, awayTeam);
    }

}
