import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		int N = in.nextInt();
		Node[] nodes = new Node[N];
		for(int i=0;i<N-1;i++) {
			int a = in.nextInt()-1;
			int b = in.nextInt()-1;
			Node A = nodes[a] != null ? nodes[a] : (nodes[a] = new Node()); 
			Node B = nodes[b] != null ? nodes[b] : (nodes[b] = new Node());
			A.n.add(b);
			B.n.add(a);
		}

		Set<Integer> done = new HashSet<Integer>();
		for(int idx=0;idx<nodes.length; idx++) {
			Node node = nodes[idx];
			done.add(idx);
			for(int i: node.n) {
				boolean b = nodes[i].n.stream().filter(a -> !done.contains(a))
						.flatMap(a -> nodes[a].n.stream())
						.filter(a -> a != i)
						.allMatch(a -> i+a%3==0 || i*a%3==0);
				if(!b) {
					System.out.println(-1);
					return;
				}
			}
		}

		char space = ' ';
		StringBuffer sb = new StringBuffer();
		sb.append(1);
		for(int i=2;i<N+1;i++) {
			sb.append(space);
			sb.append(i);
		}
		System.out.println(sb.toString());
	}

	public static class Node{
		Set<Integer> n = new HashSet<>();
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
 
}