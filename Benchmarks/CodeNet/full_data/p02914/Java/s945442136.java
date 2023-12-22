
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
		}
		long ans = 0;
		int[] cnt = new int[60];
		for (int shift = 0; shift < 60; ++shift) {
			for (int i = 0; i < N; ++i) {
				if (((1L << shift) & A[i]) > 0)
					++cnt[shift];
			}
			if (cnt[shift] % 2 == 1) {
				ans += 1L << shift;
				for (int i = 0; i < N; ++i) {
					if ((A[i] & (1L << shift)) > 0)
						A[i] -= 1L << shift;
				}
				cnt[shift] = 0;
			}
		}
		Arrays.sort(A);
		ArrayDeque<Long> dq = new ArrayDeque<>();
		for (int i = 0; i < A.length; ++i) {
			if (A[i] == 0)
				continue;
			dq.addFirst(A[i]);
		}
		HashSet<Long> set = new HashSet<Long>();
		set.add(0L);
		for (int shift = 59; shift >= 0; --shift) {
			if (cnt[shift] == 0)
				continue;
			boolean upd = false;
			for (long u : set)
				upd |= (u & (1L << shift)) > 0;
			while (!dq.isEmpty() && (dq.peekFirst() & (1L << shift)) > 0) {
				long v = dq.pollFirst();
				ArrayList<Long> add = new ArrayList<>();
				for (long u : set) {
					add.add(u ^ v);
					upd |= ((u ^ v) & (1L << shift)) > 0;
				}
				for (long u : add)
					set.add(u);
			}
			if (upd) {
				ans += 2 * (1L << shift);
				HashSet<Long> nset = new HashSet<>();
				for (long u : set) {
					if ((u & (1L << shift)) > 0)
						nset.add(u - (1L << shift));
				}
				set = nset;
			}
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
