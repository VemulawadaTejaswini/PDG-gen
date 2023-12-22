import java.util.*;
import java.io.*;

// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

class Main
{
	public static void main(String[] args)
	{
		new Main().run();
	}

	void run(){
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		char[][] m=new char[H][W];
		for(int i=0;i<H;++i){
			m[i]=sc.next().toCharArray();
		}
		int[][][][] d=new int[H][W][H][W];
		for(int i=0;i<H;++i)
			for(int j=0;j<W;++j)
				for(int k=0;k<H;++k)
					for(int l=0;l<W;++l){
						if(i==k&&j==l)continue;
						d[i][j][k][l]=Integer.MAX_VALUE/3;
					}
		for(int i=0;i<H;++i)
			for(int j=0;j<W;++j){
				int[] di={1,-1,0,0};
				int[] dj={0,0,1,-1};
				for(int k=0;k<4;++k){
					int ni=i+di[k];
					int nj=j+dj[k];
					if(ni<0||nj<0||ni>=H||nj>=W)continue;
					if(m[i][j]=='#'||m[ni][nj]=='#')continue;
					d[i][j][ni][nj]=1;
					d[ni][nj][i][j]=1;
				}
			}
			for(int o=0;o<H;++o)
				for(int p=0;p<W;++p)
					for(int i=0;i<H;++i)
						for(int j=0;j<W;++j)
							for(int k=0;k<H;++k)
								for(int l=0;l<W;++l)
									d[i][j][k][l]=Math.min(d[i][j][k][l],d[i][j][o][p]+d[o][p][k][l]);
		int ans=0;
		for(int i=0;i<H;++i)
			for(int j=0;j<W;++j){
				if(m[i][j]=='#')continue;
					for(int k=0;k<H;++k)
						for(int l=0;l<W;++l){
							if(m[k][l]=='#')continue;
							ans=Math.max(ans,d[i][j][k][l]);
						}
				}
		System.out.println(ans);

	}
	
	void tr(Object...o){System.out.println(Arrays.deepToString(o));}
}
// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
	