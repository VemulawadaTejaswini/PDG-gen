import java.util.Scanner;

public class Main 
{
	static boolean[][] grid;
	static int h,w;
	static boolean[][] visited;
	static long[][] islandbw = new long[160000][2];
	static int curisland = 0;
	
	static void findIsland(int x, int y, boolean state, int island)
	{
		if(x<0||y<0||x>=w||y>=h)return;
		if(visited[x][y])return;
		if(grid[x][y] == state)
		{
			visited[x][y] = true;
//			System.out.println(x + " " + y + ": island " + island);
			if(grid[x][y])
				islandbw[island][0]++;
			else islandbw[island][1]++;
			
			//expand
			findIsland(x-1,y,!state,island);
			findIsland(x+1,y,!state,island);
			findIsland(x,y-1,!state,island);
			findIsland(x,y+1,!state,island);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		grid = new boolean[w][h];
		visited = new boolean[w][h];
		
		for(int y = 0; y < h; y++)
		{
			String s = sc.next();
			for(int x = 0; x < w; x++)
			{
				grid[x][y] = s.charAt(x)=='#';
			}
		}
		
		for(int y = 0; y < h; y++)
		{
			for(int x = 0; x < w; x++)
			{
				if(!visited[x][y])
				{
					findIsland(x,y,grid[x][y],curisland);
					curisland++;
				}
			}
		}
		
		long an = 0;
		for(int i = 0; i < curisland; i++)
		{
			an += (islandbw[i][0] * islandbw[i][1]);
		}
		
		System.out.println(an);

	}

}
