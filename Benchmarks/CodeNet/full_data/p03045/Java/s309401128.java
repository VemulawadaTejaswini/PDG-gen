import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 2);
		int n = Integer.parseInt(first[0]);
		int m = Integer.parseInt(first[1]);
		UnionFindTree uft = new UnionFindTree(n);
		for (int i = 0; i < m; i++) {
			String[] line = br.readLine().split(" ", 3);
			uft.union(Integer.parseInt(line[0]) - 1, Integer.parseInt(line[1]) - 1);
		}
		HashSet<Integer> set = new HashSet<>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (!uft.isExist(i)) {
				count++;
				continue;
			}
			boolean flag = false;
			for (int x : set) {
				if (uft.same(i, x)) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				set.add(i);
			}
		}
		System.out.println(set.size() + count);
	}
	
	static class UnionFindTree {
		int[] parents;
		int[] exists;
		
		public UnionFindTree(int size) {
			parents = new int[size];
			exists = new int[size];
			for (int i = 0; i < size; i++) {
				parents[i] = i;
			}
		}
		
		public boolean isExist(int x) {
			return exists[x] != 0;
		}
		
		public int find(int x) {
			if (parents[x] == x) {
				return x;
			}
			int y = find(parents[x]);
			parents[x] = y;
			return y;
		}
		
		public boolean same(int x, int y) {
			return find(x) == find(y);
		}
		
		public void union(int x, int y) {
			exists[x]++;
			exists[y]++;
			if (same(x, y)) {
				return;
			}
			parents[find(x)] = find(y);
		}
	}
}
