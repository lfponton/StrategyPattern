package strategy;

import context.GameBoard;

import java.awt.geom.Point2D;

class NeutralBehavior implements Behavior
{
  @Override public int moveCommand(GameBoard board, Point2D robotLocation)
  {
    System.out.println("Neutral");
    return 0;
  }
}
