package io.github.ollistudio.figures.dot;

import io.github.ollistudio.figures.circle.Circle;
import io.github.ollistudio.figures.line.Line;
import io.github.ollistudio.util.calculation.Square;

public class Dot {
	public int x;
	public int y;
	public boolean isOn(Line line)
	{
		if(this.y == this.x * line.slope + line.yintercept)
			return true;
		return false;
	}
	public boolean isOn(Circle circle)
	{
		if(Square.square(this.x-circle.cx)+Square.square(this.y-circle.cy) == Square.square(circle.r))
			return true;
		return false;
	}
}
