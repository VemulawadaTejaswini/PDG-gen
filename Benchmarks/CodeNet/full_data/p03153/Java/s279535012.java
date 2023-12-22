import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();
		Map<Integer,Integer> cityMap = new HashMap<Integer,Integer>();
		Map<int[], Long> wayMap = new HashMap<int[], Long>();

		for(int i = 0; i < n; i++) {
			cityMap.put(i, sc.nextInt());
		}

		List<Entry<Integer,Integer>> cityList = new ArrayList<Entry<Integer,Integer>>(cityMap.entrySet());

		long amt = 0;
		for (int i = 0; i < n; i++) {
			// これ
			Entry<Integer, Integer> iE = cityList.get(i);
			long minCost = -1;
			int[] minWay = new int[2];
			for (int j = 0; j < n; j++) {
				if(i==j) {
					// 左右の変わり目
					if(minCost > 0) {
						wayMap.put(minWay, minCost);
					}
					minCost = -1;
					minWay = new int[2];
					continue;
				}
				// こっち
				Entry<Integer, Integer> jE = cityList.get(j);
				if(iE.getValue() < jE.getValue()) {
					continue;
				}
				long cost = Math.abs(i-j) * d + iE.getValue() + jE.getValue();

				if(minCost < 0 || cost < minCost) {
					minWay[0] = i;
					minWay[1] = j;
					minCost = cost;
				}
			}
			if(minCost > 0) {
				wayMap.put(minWay, minCost);
			}
		}

		List<Entry<int[], Long>> wayListAsc = new ArrayList<Entry<int[], Long>>(wayMap.entrySet());
		Collections.sort(wayListAsc, new Comparator<Entry<int[], Long>>() {
			public int compare(Entry<int[], Long> obj1, Entry<int[], Long> obj2) {
					return obj1.getValue().compareTo(obj2.getValue());
			}
		});

		// 経路探索用の木
		UnionFindTree ufTree = new UnionFindTree(n);
		for(Entry<int[], Long> e : wayListAsc) {
			int[] key = e.getKey();
			if(!ufTree.same(key[0], key[1])) {
				ufTree.union(key[0], key[1]);
				amt += e.getValue();
			}
		}

		System.out.println(amt);

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
