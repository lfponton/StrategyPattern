package strategy;

import context.GameBoard;

import java.awt.geom.Point2D;

public class AggressiveBehavior implements Behavior
{
  @Override public int moveCommand(GameBoard board, Point2D robotLocation)
  {
    System.out.println("Aggressive");
    return 1;
  }
}
