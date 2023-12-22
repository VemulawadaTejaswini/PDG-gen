import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.lang.Math;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.*;

class lcs
{
	String ai,bi;
	void input()
	{
		Scanner inp = new Scanner(System.in);
		this.ai=inp.nextLine();
		this.bi=inp.nextLine();
	}
	int lcs()
	{
		char[] a = this.ai.toCharArray();
		char[] b = this.bi.toCharArray();
		int[][] dp=new int[this.ai.length()+1][this.bi.length()+1];
		for(int i=0;i<=this.ai.length();i++)
		{
			for(int j=0;j<=this.bi.length();j++)
			{
				if(j==0||i==0)
					dp[i][j]=0;
				else if(a[i-1]==b[j-1])
					dp[i][j]=dp[i-1][j-1]+1;
				else
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
		return dp[this.ai.length()][this.bi.length()];
	}	
}

class tree
{
	int n,e;
	Vector[] v = new Vector[100009];
	int[] visited =  new int[100009];
	void init()
	{
		for(int i=0;i<100009;i++)
		{
			v[i] = new Vector();
			visited[i]=0;
		}
	}
	void inputn()
	{
		Scanner inp = new Scanner(System.in);
		this.n = inp.nextInt();
		this.e = inp.nextInt();
	}
	void inputt()
	{
		Scanner inp = new Scanner(System.in);
		int a,b;
		for(int i=0;i<this.e;i++)
		{
			a=inp.nextInt();
			b=inp.nextInt();
			v[a].add(b);
			v[b].add(a);
		}
	}
	void dfs(int k)
	{
		System.out.println(k);
		visited[k]=1;
		for(int i=0;i<v[k].size();i++)
		{
			if(visited[(int)v[k].get(i)]==0)
			{
				dfs((int)v[k].get(i));
			}
		}
	}
	void solve()
	{
		init();
		inputn();
		inputt();
		dfs(1);
	}
}
class main
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		int n,w;
		n=inp.nextInt();
		w=inp.nextInt();
		int[] wgh = new int[n];
		int[] val = new int[n];
		int[][] dp = new int[100009][101];
		for(int i=0;i<n;i++)
		{
			wgh[i]=inp.nextInt();
			val[i]=inp.nextInt();
		}
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<100009;j++)
			{
				dp[j][i]=-1;
			}
		}
		dp[val[0]][1]=wgh[0];
		for(int i=2;i<=n;i++)
		{
			for(int j=0;j<100009;j++)
			{
				if(j>=val[i-1]&&dp[j-val[i-1]][i-1]!=-1&&dp[j][i-1]!=-1)
				{
					dp[j][i]=Math.min(dp[j-val[i-1]][i-1]+wgh[i-1],dp[j][i-1]);
				}
				else if(j>=val[i-1]&&dp[j-val[i-1]][i-1]!=-1)
				{
					dp[j][i]=dp[j-val[i-1]][i-1]+wgh[i-1];
				}
				else if(dp[j][i-1]!=-1)
				{
					dp[j][i]=dp[j][i-1];
				}
				else if(j==val[i-1])
				{
					dp[j][i]=wgh[i-1];
				}
			}
		}
		int ans=-1;
		for(int i=100008;i>=0;i--)
		{
			if(dp[i][n]!=-1&&dp[i][n]<=w)
			{
				ans=i;
				break;
			}
		}
		System.out.println(ans);
	}
}