package com.sportradar.scoreboard;

import java.util.Objects;

public class Game {

    private final String homeTeam;
    private final String awayTeam;
    private int[] score;

    public Game(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.score = new int[]{0, 0};
    }

    public int[] getScore() {
        return score;
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
