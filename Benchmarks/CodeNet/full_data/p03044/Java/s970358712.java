import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
public class Main{
    static int inf=Integer.MAX_VALUE/2;
    static int n;
    static class p implements Comparable<p>{
        public int num,cost;
        @Override
        public int compareTo(p o)  {
            return this.cost - o.cost;
        }
    }
    static class edge{
        public int to,cost;
    }
    static LinkedList<edge>[] g;
    static int[] dijkstra(int r){
        int[] d=new int[n];
        Arrays.fill(d, inf);
        d[r]=0;
 
        Queue<p> q = new PriorityQueue<p>();
        p a=new p();
        a.num=r;
        a.cost=r;
        q.add(a);
        boolean[] used=new boolean[n];
        Arrays.fill(used, false);
        while(!q.isEmpty()){
            p ed=q.poll();
            int point=ed.num;
            if(used[point]) continue;
            used[point]=true;
            for(Iterator<edge> iter = g[point].iterator(); iter.hasNext(); ){
                edge next = iter.next();
                if(d[next.to]>d[point]+next.cost){
                    d[next.to]=d[point]+next.cost;
                    p aa=new p();
                    aa.num=next.to;
                    aa.cost=d[next.to];
                    q.add(aa);
                }
            }
        }
        return d;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            n=sc.nextInt();
            int[] d=new int[n];
            g=new LinkedList[n];
            for(int i=0;i<n;i++) g[i]=new LinkedList<edge>();
	    
            for(int i=0;i<n-1;i++){
                edge a1=new edge();
                edge a2=new edge();
                int s=sc.nextInt();
                int t=sc.nextInt();
                int c=sc.nextInt();
                a1.to=t - 1;
                a2.to=s - 1;
                a1.cost=c;
                a2.cost=c;
                g[s - 1].add(a1);
                g[t - 1].add(a2);
            }
            d=dijkstra(0);
            int max=0;
            int st=0;
	    for(int i = 0; i < n; i++){
		if(d[i] % 2 == 0){
		    System.out.println("0");
		}
		else{
		    System.out.println("1");
		}
	  
	    }
        }
    }
}
