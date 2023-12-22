import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();

			int M = scan.nextInt();
			int []a = new int[M];
			int []b = new int[M];

			for(int i = 0;i<M;i++) {
				a[i] = scan.nextInt()-1;
				b[i] = scan.nextInt()-1;
			}

			int count = 0;

			for(int k = 0;k<M;k++) {
				UnionfindTree T = new UnionfindTree(N);
				Set<Integer>set = new TreeSet<Integer>();
				for(int i = 0;i<M;i++) {
					if(i==k)continue;
					T.union(a[i], b[i]);
				}
				for(int i = 0;i<N;i++) {
					set.add(T.find(i));
				}

				if(set.size()>1)count++;
			}

			System.out.println(count);




		}


	}

	//unionfind は分割できない以下重要なこと。
/* 頂点は必ず0から
 * 繋げていく処理だけを考えるとき，繋げたものだけを考えれば良いので，連結かどうかの判定は簡単
 *
 * 辺を壊した後にグラフが連結がどうかは，遠くまで見ないと連結かどうかの判定が難しい．
 *
 * 上記の「難しい」というのは，グラフ上を遠くまで探索して連結かどうかを愚直に調べることのできるのは
 * DFS，BFS なので，制約が大きいと計算量的に判定が難しい，という意味．
 *
 * 以上 3 つを考えると意味が分かると思います．繋がっているかどうかの判定は，
 * ここまで見てきた通り，Union-Find 木を使えば簡単にできます
 * （DFS，BFS，ワーシャルフロイド法などでも繋がっているかの判定はできるが，制約が大きくなると計算量的に使えない）．
 * このポイントは，例えば「無向グラフが与えられてその辺を壊し
 * ，連結かどうかの判定」を行うという典型的な問題に対して適用することができます．
 */



//グループを作る、そしてそのグループについてどうなのかという問題に使えるUNIONFIND木
static class UnionfindTree{
	int [] parent;//配列番号＝頂点番号、値＝その点の親の頂点
	int [] rank;//その頂点を根とするグラフの深さの値、独立した頂点をランク１とする


	public UnionfindTree(int size){//size=グループ分けしたい頂点の数の合計
		this.parent = new int[size];
		this.rank = new int[size];
		for(int i = 0;i<size;i++) {
			parent[i] = i;
			rank[i] = 0; //集合の高さ
		}
	}

	public void union(int x, int y) {//計算量　O(logN)パス圧縮してるのでO(1/A(n,n))と相当小さくなる
		int xRoot = find(x);
		int yRoot = find(y);

		//xが属する木の方が大きい場合
		if (rank[xRoot] > rank[yRoot]) {
			parent[yRoot] = xRoot; //yの親をxに更新

		} else if(rank[xRoot] < rank[yRoot]) {
			parent[xRoot] = yRoot;

		} else if (xRoot != yRoot){//高さ一緒であるが、同じ値(グループ)ではない、同じ値(グループ)は無視していい
			parent[yRoot] = xRoot;
			rank[xRoot]++; //同じ高さの木がルートの子として着くから大きさ++;
		}
	}

	//引数の属する木のルートのidを返す
	public int find(int i) {//計算の工夫パス圧縮、これによりこのメソッドの計算量は  O(logN)  になる。(非自明)
		if (i != parent[i]) {//指定された頂点が根(親)なら無視してそのまま値を返せばいい
			parent[i] = find(parent[i]);//そうでないならその頂点がもつ親の値までいきそこでその値をもらいに行く
		}//それと同時に、指定された頂点のもつ値をそこで保存しておくことで、パス圧縮が行われ計算量が短縮される。
		return parent[i];
	}

	//同じ木に属しているか
	public boolean same(int x, int y) {//計算量O(logN)
		return find(x) == find(y);
	}
}


}
