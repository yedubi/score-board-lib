package com.sportradar.scoreboard.impl;

import com.sportradar.scoreboard.FootballGameNotStartedException;
import com.sportradar.scoreboard.FootballScoreBoard;
import com.sportradar.scoreboard.model.Game;
import com.sportradar.scoreboard.repository.FootballScoreBoardRepository;

import java.util.Comparator;
import java.util.List;

public abstract class AbstractFootballScoreBoard implements FootballScoreBoard {

    protected final FootballScoreBoardRepository repository;

    public AbstractFootballScoreBoard(FootballScoreBoardRepository repository) {
        this.repository = repository;
    }

    public void updateScore(Game game, int[] score) throws FootballGameNotStartedException {
        if (!repository.contains(game)) {
            throw new FootballGameNotStartedException();
        }


    }

    public Game startGame(String homeTeam, String awayTeam) {
        Game game = new Game(homeTeam, awayTeam);
        repository.add(game);
        return game;
    }

    public void finishGame(Game game) throws FootballGameNotStartedException {
        if (!repository.remove(game)) {
            throw new FootballGameNotStartedException();
        }
    }

    public List<Game> getSummary() {
        List<Game> liveGames = repository.getAll();
        liveGames.sort(getOrderingComparator());
        return liveGames;
    }

    protected abstract Comparator<Game> getOrderingComparator();

}