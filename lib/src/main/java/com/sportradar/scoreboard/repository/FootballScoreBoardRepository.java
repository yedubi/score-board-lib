package com.sportradar.scoreboard.repository;


import com.sportradar.scoreboard.model.Game;

import java.util.List;

/**
 * Interface for the accessing and manipulating {@code Game} data in score board repository.
 *
 * @author Yevhenii Dubinin
 */

public interface FootballScoreBoardRepository {

    /**
     * Add new football game in repository.
     *
     * @param game Game with updated score.
     * @return {@code boolean}
     */
    boolean add(Game game);

    /**
     * Update football game score in repository.
     *
     * @param game Game with updated score.
     * @return {@code boolean}
     */
    boolean update(Game game);

    /**
     * Remove football from repository.
     *
     * @param game Game which should be removed.
     * @return {@code boolean}
     */
    boolean remove(Game game);

    /**
     * Returns the list of currently ongoing matches.
     *
     * @return A list of {@code Game}
     */
    List<Game> getAll();

}
