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
			int a = sc.nextInt();
			int b = sc.nextInt();
			children[a-1].add(b-1);
			if (a != 1) {
				children[b-1].add(a-1);
			}
		}
		
		for (int i=0; i<Q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			count[p-1] += x;
		}
		
		count(0, 0);
		
		System.out.print(count[0]);
		for (int i=1; i<N; i++) {
			System.out.print(" " + count[i]);
		}
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