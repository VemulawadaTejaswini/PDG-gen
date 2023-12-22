import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=getInt();

		ArrayList<ArrayList<Edge>>edges=new ArrayList<>();
		for(int i=0;i<n;++i)edges.add(new ArrayList<>());
		for(int i=0;i<n-1;++i){
			int a=getInt()-1,b=getInt()-1,c=getInt();
			edges.get(a).add(new Edge(a,b,c));
			edges.get(b).add(new Edge(b,a,c));
		}
		int q=getInt(),k=getInt()-1;
		int[]dist=new int[n];
		{
			PriorityQueue<Edge>p=new PriorityQueue<>(edges.get(k));
			Arrays.fill(dist,Integer.MAX_VALUE);
			dist[k]=0;

			int filled=1;
			while(filled!=n){
				Edge poll=p.poll();
				if(dist[poll.t]==Integer.MAX_VALUE) {
					dist[poll.t]=dist[poll.f]+poll.c;
					p.addAll(edges.get(poll.t));
					++filled;
				}
			}
		}
		for(int i=0;i<q;++i)
			System.out.println(dist[getInt()-1]+dist[getInt()-1]);
	}
	static class Edge implements Comparable<Edge>{
		int f,t,c;
		public Edge(int from,int to,int cost){f=from;t=to;c=cost;}
		@Override
		public String toString(){return "("+f+","+t+")="+c;}
		@Override
		public int compareTo(Edge o){
			return c-o.c;
		}
		@Override
		public int hashCode(){
			final int prime=31;
			int result=prime+c;
			result=prime*result+f;
			result=prime*result+t;
			return result;
		}
		@Override
		public boolean equals(Object obj){
			if(this==obj) return true;
			if(obj==null||getClass()!=obj.getClass()) return false;
			Edge other=(Edge)obj;
			if(c!=other.c||f!=other.f||t!=other.t) return false;
			return true;
		}

	}
}