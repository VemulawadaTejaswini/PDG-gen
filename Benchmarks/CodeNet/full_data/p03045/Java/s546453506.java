
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
	
		int[] parent = new int[n];
		for (int i=0;i<n;i++) {
			parent[i]=i;
		}
		
		for (int i=0;i<m;i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			sc.nextInt();
			union(parent,x,y);
		}
		
		HashSet<Integer> set = new HashSet<>();
		
		for (int i=0;i<n;i++) {
			set.add(find(parent, i));
		}
		System.out.println(set.size());
	}

	
	static int find(int[] parent, int x) {
		if(parent[x] == x) {
			return x;
		} else {
			parent[x] = find(parent, parent[x]);
			return parent[x];
		}
	}

	static void union(int[] parent, int x, int y) {
		int xRoot = find(parent, x);
		int yRoot = find(parent, y);
		parent[xRoot]=yRoot;
	}
}
