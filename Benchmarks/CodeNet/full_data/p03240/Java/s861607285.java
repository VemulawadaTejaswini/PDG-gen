import java.util.Scanner;

public class Main
{

	public static class coor
	{
		private int x;
		private int y;
		private int h;
		
		public coor(int x, int y, int h)
		{
			this.x = x;
			this.y = y;
			this.h = h;
		}
		
			
		
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		coor[] data = new coor[N];
		
		for(int i = 0; i < N; i++)
			data[i] = new coor(in.nextInt(), in.nextInt(), in.nextInt());

		int guess_x, guess_y = 0, guess_h = 0;
		coor begin = null;
		for(coor begin_test : data)
			if(begin_test.h != 0)
			{
				begin = begin_test;
				break;
			}
						
		flag: for(guess_x = 0; guess_x <= 100; guess_x++)
		{
			for(guess_y = 0; guess_y <= 100; guess_y++)
			{
				guess_h = begin.h + Math.abs(guess_x - begin.x) + Math.abs(guess_y - begin.y);
				int i;
				for(i = 0; i < N; i++)
				{
					int abs_x = Math.abs(guess_x - data[i].x);
					int abs_y = Math.abs(guess_y - data[i].y);
					if(data[i].h != Math.max(0, (guess_h - abs_x - abs_y)))
						break;	
				}
				if(i == N)
					break flag;
			}			
		}
		System.out.println(guess_x + " " + guess_y + " " + guess_h);
	}
}