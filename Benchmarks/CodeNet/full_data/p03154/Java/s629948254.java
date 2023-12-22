import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		long h = Long.parseLong(s.next());
		long w = Long.parseLong(s.next());
		long k = Long.parseLong(s.next());

		Tree wTree = new Tree(h, null, null);

		List<Boolean> operations = new ArrayList<Boolean>();
		operations.add(true);
		long total = setChild(wTree, h - 1, w, 1, k, 0, operations);

		Tree hTree = new Tree(w, null, null);
		operations = new ArrayList<Boolean>();
		operations.add(false);
		total = total + setChild(hTree, h, w - 1, 1, k, 0, operations);

		System.out.println(total % 1000000007);
	}

	// オペレーション
	// True  横
	// False 縦
	private static long setChild(Tree tree, long h, long w, long i, long k, long total, List<Boolean> operations) {

		if (i >= k) {
			long buf = total + calcPaperCount(operations) * tree.data;
			if (buf > 1000000007) {
				buf = buf - 1000000007;
			}
			return buf;
		}

		List<Boolean> operationsIn = new ArrayList<Boolean>(operations);
		long j = i + 1;

		tree.w = new Tree(tree.data * h, null, null);
		operationsIn.add(true);
		total = setChild(tree.w, h - 1, w, j, k, total, operationsIn);

		tree.h = new Tree(tree.data * w, null, null);
		operationsIn.remove(operationsIn.size() - 1);
		operationsIn.add(false);
		total = setChild(tree.h, h, w - 1, j, k, total, operationsIn);

		return total;

	}

	private static long calcPaperCount(List<Boolean> operations) {

		long w = 0;
		long h = 0;
		long count = 0;

		for (boolean b : operations) {

			if (b) {
				w = w + 1;
				if (h == 0) {
					if (count == 0) {
						count = 2;
					} else {
						count = count + (count + 1);
					}
				} else {
					count = count + (count * (h + 1));
				}

			} else {
				h = h + 1;
				if (w == 0) {
					if (count == 0) {
						count = 2;
					} else {
						count = count + (count + 1);
					}
				} else {
					count = count + (count * (w + 1));
				}
			}

		}

		return count;

	}

	// 階乗計算
	private int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}

class Tree {

	public long data;
	public Tree w;
	public Tree h;

	public Tree(long data, Tree w, Tree h) {
		this.data = data;
		this.w = w;
		this.h = h;
	}
}
