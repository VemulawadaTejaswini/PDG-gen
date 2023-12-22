import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main 
{
	static class Tile
	{
		int x;
		int y;
		public Tile(int x0, int y0)
		{
			x=x0;
			y=y0;
		}
	}
	static boolean[][] vis;
	static long[][] scr;
	static int h,w;
	static boolean bound(int x, int y)
	{
		if(x<0 || x>=w)return false;
		if(y<0 || y>=h)return false;
		return true;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		
		vis = new boolean[w][h];
		scr = new long[w][h];
		
		LinkedList<Tile> q = new LinkedList<>();
		Vector<Tile> qq = new Vector<Tile>();
		long bl = 0;
		
		for(int y = 0; y < h; y++)
		{
			String s = sc.next();
			for(int x = 0; x < w; x++)
			{
				if(s.charAt(x) == '#')
				{
					vis[x][y] = true;
					q.add(new Tile(x,y));
					bl++;
					scr[x][y] = 0;
				}
				else scr[x][y] = 99999999;
			}
		}
		long max = 0;
		while(!q.isEmpty())
		{
			Tile t = q.pop();
			int x = t.x;
			int y = t.y;
			if(bound(x-1,y) && !vis[x-1][y])
			{
				vis[x-1][y]=true;
				scr[x-1][y]=scr[x][y]+1;
				q.add(new Tile(x-1,y));
			}
			if(bound(x+1,y) && !vis[x+1][y])
			{
				vis[x+1][y]=true;
				scr[x+1][y]=scr[x][y]+1;
				q.add(new Tile(x+1,y));
			}
			if(bound(x,y+1) && !vis[x][y+1])
			{
				vis[x][y+1]=true;
				scr[x][y+1]=scr[x][y]+1;
				q.add(new Tile(x,y+1));
			}
			if(bound(x,y-1) && !vis[x][y-1])
			{
				vis[x][y-1]=true;
				scr[x][y-1]=scr[x][y]+1;
				q.add(new Tile(x,y-1));
			}
			max = Math.max(max, scr[x][y]);
		}
		System.out.println(max);
	}

}
