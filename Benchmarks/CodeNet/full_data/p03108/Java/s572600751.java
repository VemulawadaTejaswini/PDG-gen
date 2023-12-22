
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		//				new Main().solveA();
		//		new Main().solveA2();
		//		new Main().solveB();
		//		new Main().solveC();
		//		new Main().solveC2();
		new Main().solveD();
	}

	/*
	 * なんでこんな複雑なソースを書いたのだろう？
	 */
	private void solveA() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numA = 0;
			int numB = 0;
			int numC = 0;
			numA = scanner.nextInt();
			numB = scanner.nextInt();
			numC = scanner.nextInt();

			int wk = numB;
			int res = 0;
			while (wk >= numA && res < numC) {
				wk -= numA;
				res++;
			}

			System.out.println(res);

		}
	}

	/*
	 * こちらでもAC
	 */
	private void solveA2() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numA = scanner.nextInt();
			int numB = scanner.nextInt();
			int numC = scanner.nextInt();

			int res = 0;
			if (numB / numA > numC) {
				res = numC;
			} else {
				res = numB / numA;
			}

			System.out.println(res);

		}
	}

	private void solveB() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numA = scanner.nextInt();
			int numB = scanner.nextInt();
			int numK = scanner.nextInt();

			List<Integer> wk = new ArrayList<Integer>();
			//その値が何番目の値か
			int cnt = 0;
			/*
			 * 何番目に大きいか？なので、
			 * 大きいほうから探していく。
			 * 小さいほうからだと探しづらいので。
			 * そして、AまたはBを割り切れる数なので、AまたはBより大きくなることはない。
			 * なので、AまたはBのうち、大きいほうが最大値
			 */
			for (int i = Math.max(numA, numB); i >= 1; i--) {
				if (numA % i == 0 && numB % i == 0) {
					cnt++;
				}
				/*
				 * 割り切れる
				 */
				if (cnt == numK) {
					System.out.println(i);
					return;
				}
			}

		}
	}

	/*
	 * これはTLEになる解法
	 */
	private void solveC() {

		try (Scanner scanner = new Scanner(System.in)) {
			char[] wkS;
			wkS = scanner.next().toCharArray();

			List<Character> wk = new ArrayList<Character>();
			for (char c : wkS) {
				wk.add(c);
			}

			System.out.println(getList(wk));

		}
	}

	private int getList(List<Character> wk) {

		if (wk.size() < 2) {
			return 0;
		}

		int res = 0;
		int i1 = 0;
		int i2 = 1;
		/*
		 * 0-1の組み合わせがある初期位置を見つける
		 */
		for (int i = 1; i < wk.size(); i++) {
			if (wk.get(i) != wk.get(i - 1)) {
				i1 = i - 1;
				i2 = i;
				break;
			}
			if (i == wk.size() - 1) {
				return 0;
			}
		}
		/*
		 * 消せる限りリストからremoveする
		 */
		while (i2 < wk.size()) {

			char c1 = wk.get(i1);
			char c2 = wk.get(i2);
			if (c1 != c2) {
				wk.remove(i2);
				wk.remove(i1);
				res += 2;
			} else {
				i1 = i2;
				i2 = i2 + 1;
			}
		}
		return getList(wk) + res;
	}

	private void solveC2() {

		try (Scanner scanner = new Scanner(System.in)) {
			char[] wkS;
			wkS = scanner.next().toCharArray();

			int cnt0 = 0;
			int cnt1 = 0;
			for (char c : wkS) {
				if (c == '0') {
					cnt0++;
				} else if (c == '1') {
					cnt1++;
				}
			}

			System.out.println(Math.min(cnt0, cnt1) * 2);

		}
	}

	/*
	 * Union Find(Disjoint Set)
	 */
	private void solveD() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numN = scanner.nextInt();
			int numM = scanner.nextInt();

			int[][] wk = IntStream.range(0, numM).collect(() -> new int[numM][2],
					(t, i) -> {
						t[i][0] = scanner.nextInt() - 1;
						t[i][1] = scanner.nextInt() - 1;
					}, (t, u) -> {
						Stream.concat(Arrays.stream(t), Arrays.stream(u));
					});
			long maxFuben = (long) (numN * (numN - 1)) / 2;

			/*
			 *
			 * 切り離す処理はつなぐ処理に出来る。
			 *回答の配列はMの長さ
			 */
			long[] res = new long[numM];
			res[numM - 1] = maxFuben;

			UnionFind unionFind = new UnionFind(numN);

			/*
			 * 最後が繋がったら点数に入らず
			 * なのでj>=1
			 * そして、全て繋がっているところから、全てを切り離していく作業を行う
			 * -> 最大の不便さの状態から、端をつなげることによって不便ではなくしていく作業
			 */
			for (int j = wk.length - 1; j >= 1; j--) {

				//繋がっていなかった箇所が繋がった[
				int a = wk[j][0];
				int b = wk[j][1];
				if (unionFind.getRoot(a) != unionFind.getRoot(b)) {
					res[j - 1] = res[j] - (unionFind.getSize(a) * unionFind.getSize(b));
					unionFind.connect(a, b);
				} else {
					//最初から繋がっているので変化無し
					res[j - 1] = res[j];
				}

			}

			for (int j = 0; j < res.length; j++) {
				System.out.println(res[j]);
			}

		}
	}

	private static class UnionFind {
		/*
		 * 親の番号
		 * 親の場合は -(その集合のサイズ)
		 * にしておくと、その集合がどれくらいの子を持っているのかがわかる
		 *
		 */
		private int[] parentNo;

		/*
		 * 作るときはparentの値を全て-1にしておく
		 */
		public UnionFind(int size) {
			parentNo = new int[size];
			Arrays.fill(parentNo, -1);
		}

		private int getRoot(int a) {
			if (parentNo[a] < 0) {
				//親が-ということは自分が親
				return a;
			} else {
				/*
				 * 超重要
				 * 次の探索のために、親を付け替えておく
				 */
				return parentNo[a] = getRoot(parentNo[a]);
			}
		}

		/*
		 * 自分のいるグループの頂点数を調べる
		 */
		private int getSize(int a) {
			//親を取ってきたい
			int parent = getRoot(a);
			/*
			 * 親のサイズを調べる
			 * ×-1をしていないのは、
			 */
			return parentNo[parent];
		}

		/*
		 * AとBをくっつける
		 */
		private boolean connect(int a, int b) {
			//AとBを直接つなぐのではなく、root(a)にroot(b)をくっつける
			int wkA = getRoot(a);
			int wkB = getRoot(b);
			if (wkA == wkB) {
				//既にくっついています
				return false;
			}
			/*
			 * 大きい方(a)に小さい方(b)をくっつけたい
			 * 大小が逆だったらひっくり返す
			 */
			if (getSize(wkA) < getSize(wkB)) {
				int tmp = wkA;
				wkA = wkB;
				wkB = tmp;
			}
			//Aのサイズ更新
			parentNo[wkA] = parentNo[wkA] + parentNo[wkB];
			//Bの親をAに変更
			parentNo[wkB] = wkA;

			return true;

		}

	}
}