# Live Football World Cup Score Board library
A Java library which provide implementation of the Live Football World Cup Score Board with in-memory datastore

Provide results ordered by their total score then by the most recently started match.

## Usage
```java
    FootballScoreBoardRepository repository = new InMemoryScoreBoardRepository();
    LiveFootballWorldCupScoreBoard scoreBoard = new LiveFootballWorldCupScoreBoard(repository);
    Game game = scoreBoard.startGame(homeTeamName, awayTeamName);
    int[] newScore = {1, 2};
    scoreBoard.updateScore(game, newScore);
    scoreBoard.getSummary();
    scoreBoard.finishGame();
```

## Exception handling
On user side should be handled checked exception if try to update or finish not started game
```java
FootballGameNotStartedException.class
```

## Build
```java
gradle build
```

## API Documentation
To generate API documentation run command
```java
gradle javadoc
```
Documentation will be available in **lib/build/doc**

