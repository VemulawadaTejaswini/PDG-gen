import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * ABC157
 */
public class Main {

	public static void main(String[] args) throws Exception {
		Main main = new Main();

		try (Scanner scan = new Scanner(System.in)) {
			main.friendSuggestions(scan);
		}
	}

	private void friendSuggestions(Scanner scan) {
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();

		List<Pair<Integer, Integer>> friends = IntStream.range(0, m)
			.mapToObj(i -> new Pair<>(scan.nextInt() - 1, scan.nextInt() - 1))
			.collect(Collectors.toList());

		List<Pair<Integer, Integer>> blocks = IntStream.range(0, k)
			.mapToObj(i -> new Pair<>(scan.nextInt() - 1, scan.nextInt() - 1))
			.collect(Collectors.toList());

		UnionFindTree maybeFriend = new UnionFindTree(n);
		friends.stream().forEach(i -> maybeFriend.union(i.left, i.right));

		System.out.println(IntStream.range(0, n)
			.mapToLong(i -> IntStream.range(0, n)
				.filter(i0 -> i != i0)
				.filter(i0 -> maybeFriend.find(i) == maybeFriend.find(i0))
				.filter(i0 -> friends.stream().noneMatch(i1 -> i1.left == i && i1.right == i0))
				.filter(i0 -> friends.stream().noneMatch(i1 -> i1.left == i0 && i1.right == i))
				.filter(i0 -> blocks.stream().noneMatch(i1 -> i1.left == i && i1.right == i0))
				.filter(i0 -> blocks.stream().noneMatch(i1 -> i1.left == i0 && i1.right == i))
				.count())
			.mapToObj(String::valueOf)
			.collect(() -> new StringJoiner(" "), StringJoiner::add, StringJoiner::merge)
			.toString());
	}

	@SuppressWarnings("unused")
	private void guessTheNumber(Scanner scan) {
		int n = scan.nextInt();
		int m = scan.nextInt();

		List<Pair<Integer, Integer>> scList = IntStream.range(0, m)
			.mapToObj(i -> new Pair<>(scan.nextInt(), scan.nextInt()))
			.distinct()
			.collect(Collectors.toList());

		// 同じ桁で別の数値が複数存在する場合はアウト
		if (IntStream.rangeClosed(1, n).anyMatch(i -> scList.stream().filter(i2 -> i2.left == i).count() > 1)) {
			System.out.println(-1);
			return;
		}

		HashMap<Integer, Integer> ans = scList.stream()
			.collect(Collectors.toMap(i -> i.left, i -> i.right, (v1, v2) -> v2, HashMap::new));

		// 1桁目エスケープ
		if (ans.isEmpty() || !ans.containsKey(1)) {
			if (n != 1) {
				ans.put(1, 1);
			} else {
				ans.put(1, 0);
			}
		}
		// 0以外の1桁目0チェック
		if (ans.get(1) == 0 && n != 1) {
			System.out.println(-1);
			return;
		}

		// 指定のない桁を0埋め
		ans.putAll(IntStream.rangeClosed(1, n)
			.filter(i -> !ans.containsKey(i))
			.boxed()
			.collect(Collectors.toMap(Function.identity(), i -> 0)));

		IntStream.rangeClosed(1, n)
			.map(ans::get)
			.forEachOrdered(System.out::print);
		System.out.println();
	}

	@SuppressWarnings("unused")
	private void bingo(Scanner scan) {
		int[][] a = IntStream.range(0, 3)
			.mapToObj(i -> IntStream.range(0, 3).map(i2 -> scan.nextInt()).toArray())
			.toArray(int[][]::new);
		int n = scan.nextInt();
		int[] b = IntStream.range(0, n).map(i -> scan.nextInt()).toArray();
		List<Pair<Integer, Integer>> hit = new ArrayList<>();

		for (int i : b) {
			for (int i2 = 0; i2 < a.length; i2++) {
				for (int i3 = 0; i3 < a[i2].length; i3++) {
					if (i == a[i2][i3]) {
						hit.add(new Pair<Integer, Integer>(i2, i3));
					}
				}
			}
		}

		// 横
		if (IntStream.range(0, 3).anyMatch(i -> hit.stream().filter(i2 -> i2.left == i).count() == 3)) {
			System.out.println("Yes");
			return;
		}
		// 縦
		if (IntStream.range(0, 3).anyMatch(i -> hit.stream().filter(i2 -> i2.right == i).count() == 3)) {
			System.out.println("Yes");
			return;
		}
		// 斜め (0, 0) -> (2, 2)
		if (hit.stream().filter(i -> i.left == i.right).count() == 3) {
			System.out.println("Yes");
			return;
		}
		// 斜め (0, 2) -> (2, 0)
		if (hit.stream().filter(i -> i.left == 2 - i.right).count() == 3) {
			System.out.println("Yes");
			return;
		}

		System.out.println("No");
	}

	@SuppressWarnings("unused")
	private void duplexPrinting(Scanner scan) {
		int n = scan.nextInt();

		System.out.println(n / 2 + n % 2);
	}


	@SuppressWarnings("unused")
	private static class Pair<T1, T2> {

		private T1 left;
		private T2 right;

		public Pair(T1 left, T2 right) {
			this.left = left;
			this.right = right;
		}

		public T1 left() {
			return left;
		}

		public T2 right() {
			return right;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((left == null) ? 0 : left.hashCode());
			result = prime * result + ((right == null) ? 0 : right.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair<?,?> other = (Pair<?,?>) obj;
			if (left == null) {
				if (other.left != null)
					return false;
			} else if (!left.equals(other.left))
				return false;
			if (right == null) {
				if (other.right != null)
					return false;
			} else if (!right.equals(other.right))
				return false;
			return true;
		}

	}

	@SuppressWarnings("unused")
	private static class UnionFindTree {

		private List<Integer> parents;

		public static UnionFindTree initialize(int n) {
			return new UnionFindTree(n);
		}

		public UnionFindTree(int n) {
			parents = IntStream.range(0, n).boxed().collect(Collectors.toCollection(() -> new ArrayList<>()));
		}

		public int find(int index) {
			if (index == parents.get(index)) {
				return index;
			}
			// 自分の親の親は自分の親とできるため経路圧縮
			parents.set(index, find(parents.get(index)));
			return parents.get(index);
		}

		public void union(int x, int y) {
			int xParent = find(x);
			int yParent = find(y);
			parents.set(yParent, xParent);
		}

		/**
		 * 指定したindexと同じ親の要素を抽出
		 * @param index インデックス
		 * @return 同じ親の要素
		 */
		public List<Integer> searchByParent(int index) {
			int parentOfIndex = find(index);
			return IntStream.range(0, parents.size())
				.filter(i -> find(i) == parentOfIndex)
				.boxed()
				.collect(Collectors.toList());
		}

		public long size() {
			return parents.stream().map(i -> find(i)).distinct().count();
		}
	}

}
