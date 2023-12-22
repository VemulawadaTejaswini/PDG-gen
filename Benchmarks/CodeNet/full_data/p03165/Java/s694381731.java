import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;


public class Main{

	static int[][] grid;
	static char[][] trace;
	static String s;
	static String t;
	static PrintWriter pw= new PrintWriter(System.out);
	public static void trace(int i, int j)
	{
		if(i==0 || j==0)
		{
			return;
		}
		if(trace[i][j]=='D')
		{
			trace(i-1,j-1);
			pw.print(s.charAt(i-1));
		}
		else if(trace[i][j]=='U')
		{
			trace(i-1,j);
		}
		else if(trace[i][j]=='L')
		{
			trace(i,j-1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		s= br.readLine();
		t=br.readLine();
		grid= new int[s.length()+1][t.length()+1];
		trace=new char[s.length()+1][t.length()+1];
		for (int i = 1; i < grid.length; i++) {
			for (int j = 1; j < grid[i].length; j++) {
				if(s.charAt(i-1)==t.charAt(j-1))
				{
					grid[i][j]=grid[i-1][j-1]+1;
					trace[i][j]='D';
				}
				else if(grid[i-1][j]>=grid[i][j-1])
				{
					grid[i][j]=grid[i-1][j];
					trace[i][j]='U';
				}
				else
				{
					grid[i][j]=grid[i][j-1];
					trace[i][j]='L';
				}
			}
		}
		
		trace(s.length(),t.length());
		
		pw.close();
	}
}
