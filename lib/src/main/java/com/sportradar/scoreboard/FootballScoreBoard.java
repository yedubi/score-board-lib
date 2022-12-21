package com.sportradar.scoreboard;

import com.sportradar.scoreboard.model.Game;

import java.util.List;

public interface FootballScoreBoard {

    Game startGame(String homeTeam, String awayTeam);

    void finishGame(Game game) throws FootballGameNotStartedException;

    void updateScore(Game game, int[] scores) throws FootballGameNotStartedException;

    List<Game> getSummary();

}