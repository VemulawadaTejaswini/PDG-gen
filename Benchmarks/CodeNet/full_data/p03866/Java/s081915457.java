import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;




public class Main {
	   static int N=1010;
	   static int n;
	   static Double []x=new Double[N];
	   static Double []y=new Double[N];
	   static Double []r=new Double[N];
	   static Double []dist=new Double[N];
	   static Double [][]map1=new Double[N][N];
	   static int[] vis=new int[N];
	   
       public static void main(String[] args) {
       Scanner input=new Scanner( System.in);
       x[1]=input.nextDouble();
       y[1]=input.nextDouble();
       r[1]=(double) 0;
       x[2]=input.nextDouble();
       y[2]=input.nextDouble();
       r[2]=(double) 0;
       n=input.nextInt();
       n+=2;
       for(int i=3;i<=n;i++)
       {
    	   x[i]=input.nextDouble();
    	   y[i]=input.nextDouble();
    	   r[i]=input.nextDouble();
       }
       for(int i=1;i<=n;i++)
       {
    	   for(int j=1;j<=n;j++)
    	   {
    		   map1[i][j]=Math.sqrt((x[j]-x[i])*(x[j]-x[i])+(y[j]-y[i])*(y[j]-y[i]));
    		   map1[i][j]-=(r[i]+r[j]);
    		   if(map1[i][j]<0)
    		   {
    			   map1[i][j]=(double) 0;
    		   }
    	   }
       }
       spfa(1);
       System.out.printf("%.10f",dist[2]);
          
	}
	private static void spfa(int st) {
		// TODO 自动生成的方法存根
		for(int i=1;i<=n;i++)
		{
			vis[i]=0;
			dist[i]=1e18;
		}
		Queue<Integer> q=new PriorityQueue<Integer>();
		dist[st]=(double) 0;
		vis[st]=1;
		q.offer(st);
		while(!q.isEmpty())
		{
			int u=q.poll();
			vis[u]=0;
			for(int i=1;i<=n;i++)
			{
				if(dist[i]>dist[u]+map1[u][i])
				{
					dist[i]=dist[u]+map1[u][i];
					if(vis[i]==0)
					{
						vis[i]=1;
						q.offer(i);
					}
				}
			}
		}
		
		
	}
}
