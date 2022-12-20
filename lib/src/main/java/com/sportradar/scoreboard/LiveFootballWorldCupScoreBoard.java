package com.sportradar.scoreboard;

import java.util.ArrayList;

public class LiveFootballWorldCupScoreBoard {

    private ArrayList<Game> repository;

    public LiveFootballWorldCupScoreBoard() {
        repository = new ArrayList<>();
    }

    public ArrayList<Game> getSummary() {
        return repository;
    }

    public Game startGame(String homeTeam, String awayTeam) {
        Game game = new Game(homeTeam, awayTeam);
        repository.add(game);
        return game;
    }

    public void updateScore(Game game, int[] score) {
        if (repository.contains(game)) {
            game.updateScore(score);
        }
    }

    public void finishGame(Game game) {
        if (repository.contains(game)) {
            repository.remove(game);
        }
    }

}
