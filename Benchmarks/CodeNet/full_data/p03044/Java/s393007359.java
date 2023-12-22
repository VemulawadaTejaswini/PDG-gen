import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Rer.init(System.in);
		int N=Rer.nextInt();
		
		wgraph wg=new wgraph(N); 
		
		for(int x=0;x<N-1;x++) {
			int u=Rer.nextInt();
			int v=Rer.nextInt();
			int w=Rer.nextInt();
			wg.add_edge(wg, u-1, v-1, w, x);
		}
		
		int[] colour=new int[N];
		
		for(int y=0;y<N;y++) {
			colour[y]=-1;
		}
		
		wg.BFS(wg, 0, colour);
		
		for(int g=0;g<N;g++) {
			System.out.println(colour[g]);
		}
	}

}

class Ndeg {
	
	int data;
	Ndeg link;
	
	Ndeg(int d,Ndeg l){
		data=d;
		link=l;
	}
}

class qdeg {
	
	protected Ndeg front;
	protected Ndeg rear;
	int size;
	
	qdeg(){
		front=null;
		rear=null;
		size=0;
	}
	
	boolean isEmpty() {
		return rear==null;
	}
	
	void enqueue(int x) {
		Ndeg nptr=new Ndeg(x,null);
		if(rear==null) {
			front=nptr;
		}
		else {
			rear.link=nptr;
		}
		rear=nptr;
		size++;
	}
	
	int dequeue() {
		int n=front.data;
		front=front.link;
		if(front==null) {
			rear=null;
		}
		size--;
		return n; 
	}
	
	int see() {
		int n=front.data;
		return n;
	}
	
}

class edge{
	int src;
	int dest;
	long weight;
	int index;
	
	edge(int d,long w,int i){
		dest=d;
		weight=w;
		index=i;
	}
	
	edge(int s,int d,long w,int i){
		src=s;
		dest=d;
		weight=w;
		index=i;
	}
	
}	

class wgraph{
	int n;
	ArrayList<ArrayList<edge>> adj;
	
	wgraph(int V) {
		n=V;
		adj=new ArrayList<ArrayList<edge>>();
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<edge>());
		}
	}
	
	void add_edge(wgraph wg,int a,int b,int w,int i){
		edge e1=new edge(b,w,i);		// GRAPH IS UNDIRECTED
		edge e2=new edge(a,w,i);
		wg.adj.get(a).add(e1);
		wg.adj.get(b).add(e2);
	}
	
	void BFS(wgraph g,int x,int[] colour){
		/* Breadth First Search */
		/* x is the source vertex */
		
		qdeg q=new qdeg();

		q.enqueue(x);
		colour[x]=0;
		
		while(!q.isEmpty()) {
			
			int v=q.dequeue();
			ArrayList<edge> v_arr=g.adj.get(v);
			
			for(edge w : v_arr) {
				
				if(colour[w.dest]==-1) {
					if(w.weight%2==0) {
						colour[w.dest]=colour[v];
					}
					else {
						if(colour[v]==0) {
							colour[w.dest]=1;
						}
						else {
							colour[w.dest]=0;
						}
					}
					q.enqueue(w.dest);
				}
				
			}	
			
			//degree[v]=ctr;
		}
		
	}

}

/** Class for buffered reading int and double values */
class Rer {
	static BufferedReader reader;
	static StringTokenizer tokenizer;

	/** call this method to initialize reader for InputStream */
	static void init(InputStream input) {
		reader = new BufferedReader(new InputStreamReader(input));
		tokenizer = new StringTokenizer("");
	}

	/** get next word */
	static String next() throws IOException {
		while (!tokenizer.hasMoreTokens()) {
			// TODO add check for eof if necessary
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}
	
	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}
}

