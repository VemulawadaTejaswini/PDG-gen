import java.util.Scanner;

class UnionFindTree {
	int[] par;
	int[] rank;
	int[] peers; //仲間の数
	int[] dis; //根からの距離

	public UnionFindTree(int n){
		par = new int[n];
		rank = new int[n];
		peers = new int[n];

		for(int i=0;i<n;i++){
			par[i] = i;
			peers[i] = 1;
		}
	}

	//木の根を求める
	int find(int x){
		if(par[x] == x){
			return x;
		}
		else{
			return par[x] = find(par[x]);
		}
	}

	//xとyの属する集合を併合
	void unite(int x, int y){
		int px = find(x);
		int py = find(y);

		if(px == py){
			return;
		}
		else if(rank[px] < rank[py]){
			peers[py] += peers[px];
			par[px] = py;

		}
		else{
			peers[px] += peers[py];
			par[py] = px;
			if(rank[px]==rank[py]){
				rank[px]++;
			}
		}

	}


	//xとyが同じ集合に属するか
	boolean isEquivalent(int x, int y){
		return find(x) == find(y);
	}

	//xの仲間の数を求める
	int peersnum(int x){
		return peers[find(x)];
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		UnionFindTree uf = new UnionFindTree(N);

		for(int i = 0 ; i < M ; i++){
			int X = sc.nextInt()-1;
			int Y = sc.nextInt()-1;
			int Z = sc.nextInt();

			uf.unite(X,Y);
		}
		int count = 0;
		for(int i = 0 ; i < N ; i++){
			if(uf.find(i) == i){
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}