package strategy;

import context.GameBoard;

import java.awt.geom.Point2D;

public interface Behavior
{
  int moveCommand(GameBoard board, Point2D robotLocation);
}
