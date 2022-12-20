package com.sportradar.scoreboard.repository.impl;

import com.sportradar.scoreboard.Game;
import com.sportradar.scoreboard.repository.FootballScoreBoardRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryScoreBoardRepository implements FootballScoreBoardRepository {

    private final List<Game> gameStoreList;

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
