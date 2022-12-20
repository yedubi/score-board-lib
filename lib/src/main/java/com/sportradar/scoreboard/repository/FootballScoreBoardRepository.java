package com.sportradar.scoreboard.repository;


import com.sportradar.scoreboard.Game;

import java.util.List;


public interface FootballScoreBoardRepository {

    boolean add(Game game);

    boolean update(Game game);

    boolean remove(Game game);

    List<Game> getAll();

}
