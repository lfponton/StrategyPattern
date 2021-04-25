import context.GameBoard;
import context.Robot;
import strategy.AggressiveBehavior;

public class Play
{
  public static void main(String[] args)
  {
    GameBoard board = new GameBoard();
    Robot robot = new Robot("Luis", board);
    robot.setBehaviorStrategy(new AggressiveBehavior());
    robot.move();
  }


}
