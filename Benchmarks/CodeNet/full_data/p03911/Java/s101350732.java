import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] firstLine = br.readLine().split(" ", 2);
		int n = Integer.parseInt(firstLine[0]);
		int m = Integer.parseInt(firstLine[1]);
		UnionFindTree uft = new UnionFindTree(n, m);
		for (int i = 1; i <= n; i++) {
			String[] line = br.readLine().split(" ");
			int k = Integer.parseInt(line[0]);
			for (int j = 1; j <= k; j++) {
				uft.add(i, Integer.parseInt(line[j]));
			}
		}
		int target = uft.find(0);
		for (int i = 1; i <= n; i++) {
			if (target != uft.find(i - 1)) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
	
	static class UnionFindTree {
		int persons;
		int lang;
		int[] parent;
		public UnionFindTree(int persons, int lang) {
			this.persons = persons;
			this.lang = lang;
			parent = new int[persons + lang];
			for (int i = 0; i < persons + lang; i++) {
				parent[i] = i;
			}
		}
		
		public int find(int x) {
			if (parent[x] == x) {
				return x;
			}
			parent[x] = find(parent[x]);
			return parent[x];
		}
		
		public void add(int p, int l) {
			parent[find(p - 1)] = find(persons + l - 1);
		}
	}
}
