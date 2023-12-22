import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main{
	/*static int count=0;
	static char[][] grid;
	static int[][] memo;
	public static void solve(int i, int j)
	{
		System.out.println(i + " " + j);
		if(i==grid.length-1 && j==grid[i].length-1)
		{
			count++;
			System.out.println("Destination reached. Count is " + count);return;
		}
		if(i ==grid.length || j==grid[i].length || grid[i][j]=='#')
		{
			System.out.println("invalid road. Go back");
			return;
		}
		
		System.out.println("Going down from " + i + "," + j);
		solve(i +1, j);
		System.out.println("Going right from " + i + "," + j);
		solve(i, j+1);

	}*/ 
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw =new PrintWriter(System.out);
		StringTokenizer st= new StringTokenizer(br.readLine());
		int H=Integer.parseInt(st.nextToken());
		int W=Integer.parseInt(st.nextToken());
		char[][] grid= new char[H][W];
		long[][] solution= new long[H][W];
		for (int i = 0; i < grid.length; i++) {
			String s=br.readLine();
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j]=s.charAt(j);
			}
		}
		for (int i = solution.length-1; i > -1; i--) {
			for (int j = solution[i].length-1; j > -1; j--) {
				if(grid[i][j]=='#')
				{
					solution[i][j]=0;
				}
				else if(i+1>=solution.length && j+1>=solution[i].length)
				{
					solution[i][j]=1;
				}
				else if(i+1>=solution.length)
				{
					solution[i][j]=solution[i][j+1];
				}
				else if(j+1>=solution[i].length)
				{
					solution[i][j]=solution[i+1][j];
				}
				else
				{
					solution[i][j]=solution[i][j+1]+solution[i+1][j];
				}
					
					
			}
		}
		pw.print(solution[0][0]%(1000000000+7));
		pw.close();
	}
}
