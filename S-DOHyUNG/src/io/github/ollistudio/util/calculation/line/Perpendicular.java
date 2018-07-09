package io.github.ollistudio.util.calculation.line;

import io.github.ollistudio.figures.line.Line;

public class Perpendicular {
	public boolean isPerpendicular(Line line1, Line line2)
	{
		if(line1.slope * line2.slope == -1)
			return true;
		return false;
	}
	public Line setPerpendicular(Line line)
	{
		Line returnline = new Line();
		returnline.slope = -1 / line.slope;
		return returnline;
	}
}
