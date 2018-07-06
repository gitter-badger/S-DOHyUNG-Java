package io.github.ollistudio.util.calculation;

public class Square {
	public static int square(int num)
	{
		return num*num;
	}
	public static int multisquare(int num,int times)
	{
		int returnnum = 1;
		int i;
		for(i=0;i<times;i++)
		{
			returnnum*= num;
		}
		return returnnum;
	}
}
