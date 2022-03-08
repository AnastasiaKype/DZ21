import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GamesTest {

  @Test
  public void GameTest() {
        Game Game = new Game(true);

        boolean expected = true;
        boolean actual = Game.isFailed(5);

        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void GameTest0() {
        SpeedyGame SpeedyGame = new SpeedyGame(true, 3);

        boolean expected = true;
        boolean actual = SpeedyGame.isFailed(5);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void GameManagerTest() {

      GameManager gameManager = new GameManager(new Game());
      gameManager.setSpeeds(new int[] {5,0,2,5,3});

      int expected = 1;
      int actual = gameManager.rounds(gameManager.getSpeeds());

        Assertions.assertEquals(expected, actual);

    }


}
