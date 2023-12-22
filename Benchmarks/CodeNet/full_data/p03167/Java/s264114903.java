import java.awt.Point;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import org.omg.PortableInterceptor.INACTIVE;
public class Main {


public static void D(BufferedReader br)throws Exception
{
	String in = br.readLine();
	StringTokenizer st=new StringTokenizer(in);
	int n=Integer.parseInt(st.nextToken());
	int W=Integer.parseInt(st.nextToken());
	long[][]ks=new long [n+1][W+1];
	long[]items=new long[n+1];
	long[]weights=new long[n+1];
	long sw=0;
	long sv=0;
	for(int i=1;i<n+1;i++)
	{
		in=br.readLine();
		st=new StringTokenizer(in);
		weights[i]=Integer.parseInt(st.nextToken());
		items[i]=Integer.parseInt(st.nextToken());
		sw+=weights[i];
		sv+=items[i];
				
	}
	if(sw<=W)
	{
		System.out.println(sv);
		return;
	}
	
	for(int i=1;i<n+1;i++)
	{
		for(int w=1;w<W+1;w++)
		{
			long not=ks[i-1][w];
			long take=0;
			if(weights[i]<=w)
			{
				take=items[i]+ks[i-1][(int) (w-weights[i])];
			}
			ks[i][w]=Math.max(not, take);
		}
	}
	System.out.println(ks[n][W]);
}

public static void H(BufferedReader br)throws Exception
{
	String in= br.readLine();
	StringTokenizer st=new StringTokenizer(in);
	int r=Integer.parseInt(st.nextToken());
	int c=Integer.parseInt(st.nextToken());
	int[][]grid=new int[r][c];
	for(int i=0;i<r;i++)
	{
		String Line=br.readLine();
		for(int j=0;j<c;j++)
		{
			if(Line.charAt(j)=='.')
			{
				grid[i][j]=0;
			}
			else
			{
				grid[i][j]=-1;
			}
		}
	}
	
	grid[r-1][c-1]=1;
	

	for(int i=r-1;i>=0;i--)
	{		
	
		for(int j=c-1;j>=0;j--)
		{
			if(grid[i][j]!=-1)
			{
				int a=0;
				int b=0;
				if(j+1<c)
				{
					a=grid[i][j+1];
					if(a==-1)
					{
						a=0;
					}
				}
				if(i+1<r)
				{
					b=grid[i+1][j];
					if(b==-1)
						b=0;
				}
				grid[i][j]+=a+b;
			}
		}
	}
	

	System.out.println((int)(grid[0][0]%(Math.pow(10, 9)+7)));
	
}


public static void main(String[]args) throws Exception
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	H(br);

	
}
	
}
