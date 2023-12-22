import java.io.*;
import java.util.*;

public class Main {

	static int n;
	static long [][]dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		char [][] g = new char [h][w];
		for (int i=0;i<h;i++)
		{
			String s = br.readLine();
			for(int j=0;j<s.length();j++)
			{
				g[i][j]=s.charAt(j);
			}
		}
		dp=new long [h][w];
		for(int i=0;i<h;i++)
		{
			Arrays.fill(dp[i], -1);
		}
		long ans = path(g,h-1,w-1);
		ans = ans%(7+1000000000L);
		System.out.println(ans);
		
	}
//	public static void path(char [] [] g, int h,int w)
//	{
//		if(w==h&&h==0)
//			n++;
//		else
//		{
//			if(h-1>-1)
//			{
//				if(g[h-1][w]=='.')
//					if(dp[h-1][w]==-1)
//					{
//						dp[h-1][w]=0;	
//						path(g,h-1,w);		
//					}
//					
//			}
//			if(w-1>-1)
//			{
//				if(g[h][w-1]=='.')
//					if(dp[h][w-1]==-1)
//					{
//						dp[h][w-1]=0;
//						path(g,h,w-1);
//					}
//			}
//		}
//	}
	public static long path(char [] [] g , int h, int w)
	{
		if(h==0&&w==0)
			return 1;
		else
		{
			long s1=0;
			long s2=0;
			if(h-1>-1)
				if(g[h-1][w]=='.')
					if(dp[h-1][w]==-1)
					{
						s1=path(g, h-1, w)%(7+1000000000L);
						dp[h-1][w]=s1;
					}
					else
						s1=dp[h-1][w];
			if(w-1>-1)
					if(g[h][w-1]=='.')
						if(dp[h][w-1]==-1)
						{
							s2=path(g,h,w-1)%(7+1000000000L);
							dp[h][w-1]=s2;
						}
						else
							s2=dp[h][w-1];
			return (s1+s2)%(7+1000000000L);
		}
		
	}
}
