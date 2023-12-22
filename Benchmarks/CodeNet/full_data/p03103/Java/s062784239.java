import java.util.*;

public class Main {
	static class Shop implements Comparable<Shop> {
		long A;
		int B;

		Shop(long A, int B) {
			this.A = A;
			this.B = B;
		}

		@Override
		public int compareTo(Shop o) {
			if (this.A < o.A) {
				return -1;
			} else if (this.A > o.A) {
				return 1;
			} else
				return 0;
		}
	}

	int N, M;
	long[] A;
	int[] B;
	Queue<Shop> shops;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		A = new long[N];
		B = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = in.nextLong();
			B[i] = in.nextInt();
		}
		in.close();
		this.shops = new PriorityQueue<>(N);
		for (int i = 0; i < N; ++i) {
			this.shops.add(new Shop(A[i], B[i]));
		}
	}

	long calc() {
		long result = 0;
		int remain = M;
		while (remain > 0) {
			Shop shop = this.shops.poll();
			result += Math.min(remain, shop.B) * shop.A;
			remain -= shop.B;
		}
		return result;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		System.out.println(ins.calc());
	}

}
