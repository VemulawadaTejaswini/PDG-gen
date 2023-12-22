import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		int N = in.nextInt();
		int Q = in.nextInt();
		Node[] ns = new Node[N];
		for(int i=0; i<N; i++) ns[i] = new Node();

		for(int i = 0; i < N-1; i++) {
			int a=in.nextInt()-1;
			int b=in.nextInt()-1;
			if(a<b) ns[a].c.add(ns[b]); else ns[b].c.add(ns[a]);
		}

		for(int i=0; i<Q;i++) ns[in.nextInt()-1].v+=in.nextInt();
		ns[0].ope(0);

	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < N; i++) {
	      sb.append(ns[i].v).append(' ');
	    }
	    System.out.println(sb.toString());
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
	}

	public static class Node{
		Set<Node> c = new HashSet<>();
		long v = 0; 
		void ope(long i) {v+=i;for(Node n:c)n.ope(v);}
	}
}