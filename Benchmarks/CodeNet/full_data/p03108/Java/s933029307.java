import java.util.*;

class UnionFind{
	//親の番号を格納する配列
	//自分が根のときは、-(自身の木のサイズ)を格納して置くと、結合時に小さい方を大きい方に繋ぐことができる。
	private int[] parent;
	
	//constructor
	//親の初期値を存在しない-1とすることで全てバラバラになる。
	UnionFind(int N){
		parent = new int[N];
		Arrays.fill(parent, -1);
	}
	
	//xの属する木の根を返す
	int root(int x) {
		if(parent[x]<0)return x;
		return parent[x]=root(parent[x]);//"point"：parent[x]を根に更新した上で、返す
	}
	
	//属する木の頂点数を調べる。parent[]における根の要素が-(超点数)になっている。
	int size(int x) {
		return - parent[root(x)];//−をかけるのを忘れない
	}
	
	//２数x,yの根を結合する
	boolean unite(int x, int y) {
		int rx = root(x);
		int ry = root(y);
		if(rx == ry) return false;
		//属する木が大きい方をxにする。
		if(size(rx)<size(ry)) {
			int tmp = rx;
			rx = ry;
			ry = tmp;
		}
		//yの根をxの根にする
		parent[rx] += parent[ry]; 
		parent[ry] = rx;
		return true;
	}
	
	//２数x,yが同一木に属するならtrue
	boolean same(int x, int y) {
		return root(x)==root(y);
	}
	
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int v[][] = new int[M][2];
		for(int i=0;i<M;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			A--;
			B--;
			v[i][0]=A;
			v[i][1]=B;
		}
		sc.close();
		
		//不便さを格納する配列
		long inc[] = new long[M+1];//工夫して１つ大きく出している。
		
		//iを後ろから処理して、橋を繋いでいく。
		
		//最初は不便さがNC2
		long ans = (long)N*(N-1)/2;
		inc[M] = ans;
		
		UnionFind uf = new UnionFind(N);
		for(int i=M-1;i>=0;i--) {
			int A = v[i][0];
			int B = v[i][1];
			//if(uf.same(A,B))continue;
			long tmpA = uf.size(A);
			long tmpB = uf.size(B);
			long tmp = 0;
			if(uf.unite(A, B)) {
				tmp = tmpA * tmpB;
			}
			inc[i] = inc[i+1] - tmp;
		}
		
		long tmp = inc[0];
		for(int i=0;i<M;i++) {
			inc[i]-=tmp;
		}
		
		StringBuilder sb =  new StringBuilder();
		for(int i=1;i<M+1;i++) {
			sb.append(inc[i]+"\n");
		}
		System.out.println(sb.toString());
	}
}