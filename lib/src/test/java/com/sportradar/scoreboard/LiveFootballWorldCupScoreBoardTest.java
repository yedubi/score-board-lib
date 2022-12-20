/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.sportradar.scoreboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LiveFootballWorldCupScoreBoardTest {

    @Test
    public void emptyScoreBordTest() {
        LiveFootballWorldCupScoreBoard scoreBoard = new LiveFootballWorldCupScoreBoard();
        assertTrue(scoreBoard.getSummary().isEmpty());
    }

    @Test
    public void startNewGameTest() {
        LiveFootballWorldCupScoreBoard scoreBoard = new LiveFootballWorldCupScoreBoard();
        Game game = scoreBoard.startGame("Mexico", "Canada");
        assertTrue(scoreBoard.getSummary().contains(game));
    }

    @Test
    public void initialScoreTest() {
        LiveFootballWorldCupScoreBoard scoreBoard = new LiveFootballWorldCupScoreBoard();
        Game game = scoreBoard.startGame("Mexico", "Canada");
        int[] initialScore = {0, 0};
        assertArrayEquals(initialScore, game.getScore());
    }

    @Test
    public void updateGameScoreTest() {
        LiveFootballWorldCupScoreBoard scoreBoard = new LiveFootballWorldCupScoreBoard();
        Game game = scoreBoard.startGame("Mexico", "Canada");
        int[] newScore = {1, 2};
        scoreBoard.updateScore(game, newScore);
        assertArrayEquals(scoreBoard.getSummary().get(0).getScore(), newScore);
    }


}
