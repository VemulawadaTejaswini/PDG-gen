import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		new Main(new Scanner(System.in), System.out, System.err).exec();
	}
	public final Scanner sc;
	public final PrintStream out, err;
	public Main(final Scanner sc, final PrintStream out, final PrintStream err) {
		this.sc = sc;this.out = out;this.err = err;
	}
	static private final long pair(int a, int b) {return (((long)a) << 32) + b;}
	static private final int upper(long v) {return (int)(v >> 32);}
	static private final int lower(long v) {return (int)(v & 0xFFFFFFFF);}

	//-----------------------------------------

	static private final long load(int end, int length) {
		return pair(end, length);
	}
	static private final int end(long load) {
		return upper(load);
	}
	static private final int length(long load) {
		return lower(load);
	}
	static private final long score(int count, int last) {
		return pair(count, last);
	}
	static private final int count(long score) {
		return upper(score);
	}
	static private final int last(long score) {
		return lower(score);
	}

	//------------------------------------------

	public void exec() throws Exception{
		final int N = sc.nextInt();
		final long K = sc.nextLong();
		final long[] A = new long[N];
		final long[] F = new long[N];

		final long[] score = new long[N];

		long TOTAL_A = 0;
		for(int i=0;i<N;i++) {
			final long a_i = sc.nextLong();
			A[i] = a_i;
			TOTAL_A += a_i;
		}
		for(int i=0;i<N;i++) {
			F[i] = sc.nextLong();
		}

		if(N==1) {
			// 1つしかないならそのまま計算
			out.println(Math.max(0, A[0]-K)*F[0]);
			return;
		}
		if(TOTAL_A <= K) {
			// 修行で0になるなら、0．
			out.println(0);
			return;
		}

		Arrays.sort(A);
		Arrays.sort(F);

		PriorityQueue<Long> queue = new PriorityQueue<>(N, new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return o2.compareTo(o1);
			}
		});

		// これ以降は要素が2以上である。

		for(int i=0;i<N;i++) {
			queue.add(score(A, F, i, N));
		}

		long k = K;
		Long max = queue.poll();
		while(k>0) {
			Long next = queue.poll();
			final long maxValue = value(max.longValue());
			final int maxIndex = index(max.longValue());
			final long nextValue = value(next.longValue());

			final long diff = maxValue - nextValue;
			final long need = diff/F[maxIndex]+1; // 必要修行回数。
			final long count = Math.min(k, need);
			A[maxIndex]-=count;
			k-=count;
			final long newScore = score(A, F, maxIndex, N);
			queue.add(newScore);
			max = next;
		}
		out.println(value(max.longValue()));

	}
	static private final long score(long[] A, long[] F, int i, int N) {
		return ((A[i]*F[N-1-i])<<20) + i;
	}
	static private final int index(long score) {
		return (int)(score & 0xFFFFFL);
	}
	static private final long value(long score) {
		return score >> 20;
	}
}
