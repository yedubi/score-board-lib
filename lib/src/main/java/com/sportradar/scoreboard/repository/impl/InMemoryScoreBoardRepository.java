package com.sportradar.scoreboard.repository.impl;

import com.sportradar.scoreboard.model.Game;
import com.sportradar.scoreboard.repository.FootballScoreBoardRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * InMemoryScoreBoardRepository is the implementation class of FootballScoreBoardRepository.
 * The {@code FootballScoreBoardRepository} interface provides methods for access to the
 * {@code Game} objects stored in repository.
 *
 * @author Yevhenii Dubinin
 * @see Game
 */

public class InMemoryScoreBoardRepository implements FootballScoreBoardRepository {

    private final List<Game> gameStoreList;

    /**
     * Constructor of InMemoryScoreBoardRepository which is the implementation class
     * of FootballScoreBoardRepository.
     */
    public InMemoryScoreBoardRepository() {
        gameStoreList = new ArrayList<>();
    }

    @Override
    public boolean add(Game game) {
        return gameStoreList.add(game);
    }

    @Override
    public boolean update(Game game) {
        return gameStoreList.contains(game);
    }

    @Override
    public boolean remove(Game game) {
        return gameStoreList.remove(game);
    }

    @Override
    public List<Game> getAll() {
        return gameStoreList;
    }

}
