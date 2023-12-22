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
		int[][] S = new int[M][2];
		for(int i = 0 ; i < M ; i++){
			S[i][0] = sc.nextInt()-1;
			S[i][1] = sc.nextInt() -1;
		}
		sc.close();

		int[] ans = new int[M];
		ans[M-1] = N*(N-1)/2;

		for(int i = M-2 ; i >=0  ; i--){
			if(uf.find(S[i+1][0]) != uf.find(S[i+1][1])){
				ans[i] = Math.max(ans[i+1] - (uf.peersnum(S[i+1][0]) * uf.peersnum(S[i+1][1])),0);
				uf.unite(S[i+1][0],S[i+1][1]);
			}
			else{
				ans[i] = ans[i+1];
			}
		}

		for(int i = 0 ; i < M ; i++){
			System.out.println(ans[i]);
		}
	}
}