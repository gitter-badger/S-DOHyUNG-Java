package io.github.ollistudio.figures.circle;

import io.github.ollistudio.figures.dot.Dot;
import io.github.ollistudio.util.calculation.Square;

public class Circle {
	public int cx;
	public int cy;
	public int r;
	public void getCircle(Circle circle1, Circle circle2, Dot dot)
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
		
	}
	public void getCircle(Dot dot1, Dot dot2, Dot dot3)
	{
		
	}
}
