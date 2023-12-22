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

		int[][] S = new int[M][2];
		for(int i = 0 ; i < M ; i++){
			S[i][0] = sc.nextInt();
			S[i][1] = sc.nextInt();
		}
		sc.close();

		int count = 0;
		for(int i = 0 ; i < M ; i++){
			UnionFindTree uf = new UnionFindTree(N);

			for(int j = 0 ; j < i ; j++){
				uf.unite(S[j][0]-1, S[j][1]-1);
			}
			for(int k = i+1 ; k < M ; k++){
				uf.unite(S[k][0]-1, S[k][1]-1);
			}

			int edge = uf.find(0);
			for(int l = 1 ; l < N ; l++){
				if(edge != uf.find(l)){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}

}