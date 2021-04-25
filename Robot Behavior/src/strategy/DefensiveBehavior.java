package strategy;

import context.GameBoard;

import java.awt.geom.Point2D;

public class DefensiveBehavior implements Behavior
{
  @Override public int moveCommand(GameBoard board, Point2D robotLocation)
  {
    System.out.println("Defensive");
    return -1;
  }
}
