package io.github.ollistudio.figures.line;

import io.github.ollistudio.figures.circle.Circle;
import io.github.ollistudio.figures.dot.Dot;
import io.github.ollistudio.util.calculation.Square;

public class Line {
	public int yintercept;
	public int slope;
	public void getLine(Dot dot1, Dot dot2)
	{
		int dot1x,dot1y,dot2x,dot2y;
		dot1x = dot1.x;
		dot1y = dot1.y;
		dot2x = dot2.x;
		dot2y = dot2.y;
		this.slope = (dot1x-dot2x)/(dot1y-dot2y);
		this.yintercept = dot1y - this.slope * dot1x;
	}
	public void getLine(Circle circle1, Circle circle2)
	{
		int circle1_x = circle1.cx*-2;
		int circle2_x = circle2.cx*-2;
		int circle1_y = circle1.cy*-2;
		int circle2_y = circle2.cy*-2;
		int circle1_n = Square.square(circle1.cx) + Square.square(circle1.cy);
		int circle2_n = Square.square(circle2.cx) + Square.square(circle2.cy);
		int linex = circle1_x-circle2_x;
		int liney = circle1_y-circle2_y;
		int linen = circle1_n-circle2_n;
		this.slope = -1 * linex / liney;
		this.yintercept = -1 * linen / liney;
	}
}
