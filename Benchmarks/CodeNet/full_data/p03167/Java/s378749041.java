import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
	static int n ;
	static int d ;
	static int MOD = (int) (1e9 +7);
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		//BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		Scanner sc = new Scanner(System.in);
		//PrintWriter out = new PrintWriter("output.txt");
		PrintWriter out = new PrintWriter(System.out);
		st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		char[][] s = new char[H][W];
		for(int i=0;i<H;i++)
			{
				s[i] = br.readLine().toCharArray();
			}
		int[][] dp = new int[H+1][W+1];
		for(int i=H;i>0;i--)
		{
			for(int j=W; j>0;j--)
			{
				if(s[i-1][j-1] == '#')
				{
					dp[i][j] = 0;
					continue;
				}
				
				if(i == H && j == W)
					dp[i][j] = 1;
				else if(i== H)
					dp[i][j] = dp[i][j+1];
				else if(j == W)
					dp[i][j] = dp[i+1][j];
				else
				{
					dp[i][j] = (dp[i+1][j] + dp[i][j+1])%MOD; 
				}
			}
		}
//		for(int i =0;i<H;i++)
//			{
//			for(int j=0;j<W;j++)
//			{
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//			}
//		
		System.out.println(dp[1][1]);
		out.flush();
		out.close();
		
	}
	
	
}