package com.sportradar.scoreboard;

import com.sportradar.scoreboard.repository.FootballScoreBoardRepository;

import java.util.Comparator;
import java.util.List;

public class LiveFootballWorldCupScoreBoard {

    private final FootballScoreBoardRepository repository;

    public LiveFootballWorldCupScoreBoard(FootballScoreBoardRepository scoreBoardRepository) {
        this.repository = scoreBoardRepository;
    }

    public List<Game> getSummary() {
        repository.getAll().sort(Comparator
                .comparing(Game::getTotalScore)
                .thenComparing(Game::getTimestamp)
                .reversed());
        return repository.getAll();
    }

    public Game startGame(String homeTeam, String awayTeam) {
        Game game = new Game(homeTeam, awayTeam);
        repository.add(game);
        return game;
    }

    public void updateScore(Game game, int[] score) throws FootballGameNotStartedException {
        if (!repository.update(game)) {
            throw new FootballGameNotStartedException();
        }
        game.updateScore(score);
    }

    public void finishGame(Game game) throws FootballGameNotStartedException {
        if (!repository.remove(game)) {
            throw new FootballGameNotStartedException();
        }
    }

}
