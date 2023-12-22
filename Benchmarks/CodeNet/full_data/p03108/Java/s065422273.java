import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * ケツからたどればよさそう（ケツは情報量が少ないので）
		 * ケツからだと情報が把握できる
		 * いま連結かどうかを何度も判定するので、高速なアルゴリズムが必要
		 * UnionFndで共通祖先を連結か何かに応用できないか？
		 */
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[][] data=new int[M][2];
		long[] res=new long[M+1];
		long fumando=((long)N)*((long)N-1)/2L;
		res[0]=fumando;
		for(int i=M-1; i>=0; i--) {
			data[i][0]=sc.nextInt();
			data[i][1]=sc.nextInt();
		}
		UnionFindTree UFT=new UnionFindTree(N);
		for(int i=0; i<M; i++) {
			int AR=UFT.find(data[i][0]);
			int BR=UFT.find(data[i][1]);
			long a=(long)UFT.size(AR);
			long b=(long)UFT.size(BR);
			//pl(AR+" "+BR+" "+a+" "+b);
			UFT.union(data[i][0], data[i][1]);
			if(AR!=BR) {
				res[i+1]=res[i]-a*b;
			}
			else {
				res[i+1]=res[i];
			}
		}
		for(int i=M-1; i>=0; i--) {
			System.out.println(res[i]);
		}
	}
	public static class UnionFindTree {
		int nodeNum;	//頂点数
		int [] parent;	//親の頂点の値
		int [] height;	//高さ（祖先からの距離）
		int [] treeSize;	//共通祖先を持つ頂点集合の数（クラスタ内の頂点の数）

		public UnionFindTree(int nodeNum) {
			this.nodeNum = nodeNum;
			parent = new int[nodeNum+1];
			height = new int[nodeNum+1];
			treeSize = new int[nodeNum+1];
			for (int i = 1; i <= nodeNum; i++) {
				parent[i] = i;
				height[i] = 0;
				treeSize[i] = 1;
			}
		}
		int find(int x) {
			if (parent[x] == x) {
				return x;
			} else {
				return parent[x] = find(parent[x]);
			}
		}
		void union(int x, int y) {
			int rootX = find(x);
			int rootY = find(y);
			if (rootX == rootY) {
				return;
			}
			if (height[rootX] < height[rootY]) {
				parent[rootX] = rootY;
				treeSize[rootY] += treeSize[rootX];
			} else {
				if (height[rootX] == height[rootY]) {
					height[rootX]++;
				}
				parent[rootY] = rootX;
				treeSize[rootX] += treeSize[rootY];
			}
		}
		int size(int vertex) {
			return treeSize[vertex];
		}
	}
}
