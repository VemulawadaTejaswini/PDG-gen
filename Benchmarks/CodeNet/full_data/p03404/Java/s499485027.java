import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean[][] grid = new boolean[100][50];
		
		for(int x = 0; x < 100; x++)
			for(int y = 20; y < 50; y++)
				grid[x][y] = true;
		a--;
		b--;
		
		for(int x = 0; x < 100 && b > 0; x+=2)
			for(int y = 0; y < 20 && b > 0; y+=2)
			{
				grid[x][y] = true;
				b--;
			}
		
		for(int x = 0; x < 100 && a > 0; x+=2)
			for(int y = 31; y < 50 && a > 0; y+=2)
			{
				grid[x][y] = false;
				a--;
			}
		
		StringBuilder sb = new StringBuilder();
		for(int y = 0; y < 50; y++)
		{
			for(int x = 0; x < 100; x++)
			{
				sb.append(grid[x][y]?'#':'.');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

}
