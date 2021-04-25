package context;

import strategy.AggressiveBehavior;
import strategy.Behavior;

import java.awt.*;

public class Robot
{
  private String name;
  private GameBoard board;
  private Behavior behaviorStrategy;

  public Robot(String name, GameBoard board)
  {
    this.name = name;
    this.board = board;
  }

  public Behavior getBehaviorStrategy()
  {
    return behaviorStrategy;
  }

  public void setBehaviorStrategy(Behavior behaviorStrategy)
  {
    this.behaviorStrategy = behaviorStrategy;
  }

  public void move()
  {
    behaviorStrategy.moveCommand(board, new Point(2,3));
  }
}
