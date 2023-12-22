import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] aList = new int[m];
		int[] bList = new int[m];
		for(int i = m; i > 0; i--) {
			aList[i-1] =sc.nextInt()-1;
			bList[i-1] =sc.nextInt()-1;
		}

		List<Long> fubenList = new ArrayList<Long>();
		long maxFuben = (long) (n*(n-1)/2);
		long fuben = maxFuben;
		fubenList.add(fuben);

		UnionFindTree uTree = new UnionFindTree(n);
		List<Integer> usedNumList = new ArrayList<Integer>();

		for(int i = 0; i < m-1; i++) {
			if(fuben == 0) {
				// 一回0になったらあとはずっと0
				fubenList.add(fuben);
				continue;
			}

			int a = aList[i];
			int b = bList[i];
			if(!usedNumList.contains(a)) {
				usedNumList.add(a);
			}
			if(!usedNumList.contains(b)) {
				usedNumList.add(b);
			}
			uTree.union(a, b);
			fuben = maxFuben - getUnionCount(uTree, usedNumList);
			fubenList.add(fuben);
		}

		Collections.reverse(fubenList);
		fubenList.forEach(f -> System.out.println(f));


	}

	private static long getUnionCount(UnionFindTree uTree, List<Integer> usedNumList) {
		long unionCount = 0;
		for(int i = 0; i < usedNumList.size(); i++) {
			for(int j = i+1; j < usedNumList.size(); j++) {
				if(uTree.same(usedNumList.get(i), usedNumList.get(j))) {
					unionCount++;
				}
			}
		}
		return unionCount;
	}

}

class UnionFindTree {

    private int[] parent;    //親ノード
    private int[] rank;      //高さ or 次数

    /**<h1>コンストラクタ</h1>
     * <p></p>
     * @param size ： ノード数
     */
    public UnionFindTree(int size) {
        parent = new int[size];
        rank = new int[size];

        for (int i = 0; i < size; i++) {
            makeSet(i);
        }
    }

    /**<h1>ノードを作成する</h1>
     * <p>作成されたノードはルートとなる。
     * <br>元のサイズより大きいノードを指定した場合エラー。</p>
     * @param x ： ノード
     */
    public void makeSet(int x) {
        parent[x] = x;
        rank[x] = 0;
    }

    /**<h1>x, y の属している木を結合する</h1>
     * <p>同じ木の場合は何もしない。</p>
     * @param x ： ノード1
     * @param y ： ノード2
     */
    public void union(int x, int y) {
        final int xRoot = find(x);
        final int yRoot = find(y);

        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot;        //x の木に結合
        }
        else if(rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;        //y の木に結合
        }
        else if (xRoot != yRoot) {        //同じ高さで根が違うとき
            parent[yRoot] = xRoot;        //x の木に結合
            rank[xRoot]++;                //x の木の高さを加算
        }
    }

    /**<h1>属している木のルートを返す</h1>
     * <p>検索したノードは経路圧縮が行われる。</p>
     * @param x ： ノード
     * @return<b>int</b> ： ルートのノード
     */
    public int find(int x) {
        if (x != parent[x]) {    //根でないとき
            parent[x] = find(parent[x]);    //直接、根に繋ぐ(経路圧縮)
        }
        return parent[x];
    }

    /**<h1>同じ木に属しているかどうかを返す</h1>
     * <p>同じルートを持っているかで判別する。</p>
     * @param x ： ノード1
     * @param y ： ノード2
     * @return<b>boolean</b> ： true = 同じ木に属している
     */
    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}
