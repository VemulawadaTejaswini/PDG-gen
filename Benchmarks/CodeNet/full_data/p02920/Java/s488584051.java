import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int SN = (int) Math.pow(2, N);
		long[] S = new long[SN];
		for (int i = 0; i < SN; i++) {
			S[i] = scn.nextLong();
		}
		Arrays.sort(S);
		PriorityQueue<Long> ex = new PriorityQueue<Long>(new MyComp());
		PriorityQueue<Long> noko = new PriorityQueue<Long>(new MyComp());
		PriorityQueue<Long> buf = new PriorityQueue<Long>(new MyComp());
		PriorityQueue<Long> noko_buf = new PriorityQueue<Long>(new MyComp());

		boolean can = true;
		buf.add(S[SN - 1]);
		for (int i = 0; i < SN - 1; i++) {
			noko_buf.add(S[i]);
		}
		for (int i = 0; i < N; i++) {

			ex = buf;
			noko = noko_buf;
			buf = new PriorityQueue<Long>(new MyComp());
			noko_buf = new PriorityQueue<Long>(new MyComp());
			while (!ex.isEmpty()) {
				long p = ex.poll();
				buf.add(p);
				while (!noko.isEmpty()) {
					long np = noko.poll();
					if (p > np) {
						buf.add(np);
						break;
					} else {
						noko_buf.add(np);
					}
				}

			}
			while (!noko.isEmpty()) {
				long np = noko.poll();
				noko_buf.add(np);
			}
		}
		int ans = 0;
		while (!buf.isEmpty()) {
			buf.poll();
			ans++;
		}

		System.out.println(ans == SN ? "Yes" : "No");

	}

}

class MyComp implements Comparator<Long> {
	public int compare(Long o1, Long o2) {
		if ((long) o1 > (long) o2)
			return -1;
		if ((long) o1 < (long) o2)
			return 1;
		return 0;
	}

}
