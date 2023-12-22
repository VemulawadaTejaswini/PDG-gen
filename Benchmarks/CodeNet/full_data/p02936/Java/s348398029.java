import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static List<Integer>[] children;
	private static long[] count;
	private static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();

		children = new List[N];
		count = new long[N];
		visited = new boolean[N];
		for (int i=0; i<N; i++) {
			children[i] = new ArrayList<Integer>();
			count[i] = 0;
		}
		
		for (int i=0; i<N - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			children[a].add(b);
			children[b].add(a);
		}
		
		for (int i=0; i<Q; i++) {
			count[sc.nextInt()-1] += sc.nextInt();
		}
		
		count(0, 0);
		
		StringBuilder sb = new StringBuilder();
		sb.append(count[0]);
		for (int i=1; i<N; i++) {
			sb.append(" " + count[i]);
		}
		System.out.println(sb);
	}
	
	static void count(int nodeIdx, long cnt) {
		count[nodeIdx] += cnt;
		visited[nodeIdx] = true;
		for (Integer c : children[nodeIdx]) {
			if (!visited[c]) {
				count(c, count[nodeIdx]);
			}
		}
	}
}