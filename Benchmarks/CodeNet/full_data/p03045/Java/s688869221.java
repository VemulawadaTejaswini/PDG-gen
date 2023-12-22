import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		DSU set = new DSU(n);
		
		for(int i = 0; i < m; i++) {
			set.union(sc.nextInt() - 1, sc.nextInt() - 1);
			sc.nextInt();
		}
		
		System.out.println(set.getSets());
	}
	
	public static class DSU {
		
		public int sets;
		public int[] parent, rank, setSize;
		
		public DSU(int size) {
			this.parent = new int[size];
			this.rank = new int[size];
			this.setSize = new int[size];
			
			this.sets = size;
			
			for(int i = 0; i < this.parent.length; i++) {
				this.parent[i] = i;
				setSize[i] = 1;
			}
		}
		
		public int findSet(int i) {
			return parent[i] == i ? i : (parent[i] = findSet(parent[i]));
		}
		
		public boolean isSameSet(int i, int j) {
			return findSet(i) == findSet(j);
		}
		
		public void union(int i, int j) {
			int x = findSet(i);
			int y = findSet(j);
			
			if(x == y)
				return;
			
			if(rank[x] > rank[y]) {
				parent[y] = x;
				setSize[x] += setSize[y];
			}
			else {
				parent[x] = y;
				
				if(rank[x] == rank[y])
					rank[y]++;
				
				setSize[y] += setSize[x];
			}
			
			sets--;
		}
		
		public int getSets() {
			return this.sets;
		}
		
		public int sizeOfSet(int i) {
			return this.setSize[this.findSet(i)];
		}
		
	}
}
