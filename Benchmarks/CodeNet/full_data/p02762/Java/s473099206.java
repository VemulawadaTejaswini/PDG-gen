import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt(),M=sc.nextInt(),K=sc.nextInt();
		int[] counts = new int[N+1];
		UnionFindTree tree = new UnionFindTree(N+1);
		for(int i=0;i<M;i++) {
			int A =sc.nextInt(),B=sc.nextInt();
			counts[A]++;
			counts[B]++;
			tree.union(A, B);
		}
		for(int i=0;i<K;i++) {
			int C =sc.nextInt(),D=sc.nextInt();
			if(tree.same(C,D)) {
				counts[C]++;
				counts[D]++;
			}
		}
		for(int i=1;i<N+1;i++) {
			int ans = tree.getSize(i)-counts[i]-1;
			System.out.print(ans+" ");
		}
	}

}



class UnionFindTree {
	int[] parent;
	int[] height;
	int[] size;
	
	UnionFindTree(int size) {
		this.parent = new int[size];
		this.height = new int[size];
		this.size = new int[size];
		
		for (int i = 0; i < size; i++) {
			makeSet(i);
		}
	}
	
	void makeSet(int i) {
		parent[i] = i;
		height[i] = 0;
		size[i] = 1;
	}
	
	int find(int x) {
		if (x != parent[x]) {
			parent[x] = find(parent[x]);
		}
		return parent[x];
	}
	
	void union(int x, int y) {

		int rootX = find(x);
		int rootY = find(y);
		
		if (rootX == rootY) { //既に結合済み
			return;
		}
		
		if (height[rootX] > height[rootY]) {
			parent[rootY] = rootX;
			size[rootX] += size[rootY];
			
		} else if (height[rootX] < height[rootY]) {
			parent[rootX] = rootY;
			size[rootY] += size[rootX];
			
		} else {
			parent[rootY] = rootX;
			size[rootX] += size[rootY];
			height[rootX]++;
		}
	}
	int getSize(int x) {
		int rootX = find(x);
		return size[rootX];
	}
	
	public boolean same(int x, int y) {
		return find(x) == find(y);
	}
	
}
	