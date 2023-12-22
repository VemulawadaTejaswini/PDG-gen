import java.io.*;
import java.util.*;
public class Main
{
	final int inf=(int)(1e9+1),dx[]={0,0,-1,1},dy[]={-1,1,0,0};
	int n,m,k,dist[][],min;
	boolean locked[][];
	Point start;
	private void solve()throws IOException
	{
		n=nextInt();
		m=nextInt();
		k=nextInt();
		locked=new boolean[n+1][m+1];
		start=null;
		for(int i=1;i<=n;i++)
		{
			String s=nextLine();
			for(int j=1;j<=m;j++)
			{
				if(s.charAt(j-1)=='S')
					start=new Point(i,j);
				locked[i][j]=s.charAt(j-1)=='#';
			}
		}
		//initialise the core cells
		dist=new int[n+1][m+1];
		for(int i=1;i<=n;i++)
			Arrays.fill(dist[i],inf);
		bfs1();
		//update the rest of the cells
		min=inf;
		bfs2();
		out.println((min+k-1)/k+1);
	}
	void bfs1()
	{
		Queue<Point> queue=new LinkedList<>();
		queue.add(start);
		dist[start.x][start.y]=0;
		while(!queue.isEmpty())
		{
			Point p=queue.remove();
			for(int i=0;i<4;i++)
			{
				int x=p.x+dx[i];
				int y=p.y+dy[i];
				if(x>=1 && x<=n && y>=1 && y<=m && dist[x][y]!=inf && !locked[x][y])
				{
					dist[x][y]=dist[p.x][p.y]+1;
					if(x==1 || x==n || y==1 || y==m)
					{
						System.out.println(1);
						System.exit(0);
					}
					if(dist[x][y]<k)
						queue.add(new Point(x,y));
				}
			}
		}
	}
	void bfs2()
	{
		Queue<Point> queue=new LinkedList<>();
		for(int i=1;i<=n;i++)
			for(int j=1;j<=m;j++)
				if(dist[i][j]!=inf)
				{
					dist[i][j]=0;
					queue.add(new Point(i,j));
				}
		while(!queue.isEmpty())
		{
			Point p=queue.remove();
			for(int i=0;i<4;i++)
			{
				int x=p.x+dx[i];
				int y=p.y+dy[i];
				if(x>=1 && x<=n && y>=1 && y<=m && dist[x][y]>dist[p.x][p.y]+1)
				{
					dist[x][y]=dist[p.x][p.y]+1;
					if(x==1 || x==n || y==1 || y==m)
						min=Math.min(min,dist[x][y]);
					queue.add(new Point(x,y));
				}
			}
		}
	}
	class Point
	{
		int x,y;
		Point(int a,int b)
		{
			x=a;
			y=b;
		}
	}

	 
	///////////////////////////////////////////////////////////

	public void run()throws IOException
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		solve();
		
		br.close();
		out.close();
	}
	public static void main(String args[])throws IOException{
		new Main().run();
	}
	BufferedReader br;
	StringTokenizer st;
	PrintWriter out;
	String nextToken()throws IOException{
		while(st==null || !st.hasMoreTokens())
		st=new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	String nextLine()throws IOException{
		return br.readLine();
	}
	int nextInt()throws IOException{
		return Integer.parseInt(nextToken());
	}
	long nextLong()throws IOException{
		return Long.parseLong(nextToken());
	}
	double nextDouble()throws IOException{
		return Double.parseDouble(nextToken());
	}
}