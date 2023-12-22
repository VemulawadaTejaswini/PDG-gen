import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
	public static void main(String[] args) {

		int N = MyScanner.nextInt();
		int Q = MyScanner.nextInt();
		Node[] ns = new Node[N];
		for(int i=0; i<N; i++) ns[i] = new Node();

		for(int i = 0; i < N-1; i++) {
			int a=MyScanner.nextInt()-1;
			int b=MyScanner.nextInt()-1;
			if(a<b) ns[a].c.add(ns[b]);
			else ns[b].c.add(ns[a]);
		}

		for(int i=0; i<Q;i++) ns[MyScanner.nextInt()-1].v+=MyScanner.nextInt();
		ns[0].ope(0);

		for(int i=0;i<N;i++) {
			if(ns[i].t) {
				if(i != 0) System.out.print(" ");
			System.out.print(ns[i].v);
			}
		}
	}

	public static class MyScanner{
		static Scanner sc = new Scanner(System.in);
		static String nextLine() {return sc.nextLine();}
		static String next() {return sc.next();}
		static int nextInt() {return Integer.valueOf(sc.next());}
	}

	public static class Node{
		Set<Node> c = new HashSet<>();
		boolean t;
		long v = 0; 
		void ope(long i) {t=true;v+=i;for(Node n:c)n.ope(v);}
	}
}