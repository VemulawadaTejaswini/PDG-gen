import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x = sc.nextLong();
		long[] a = new long[N];
		LinkedList<Boolean> flag = new LinkedList<>();
		for (int i=0; i<N; i++) {
			a[i] = sc.nextLong();
			flag.add(false);
		}
		long res = 0;
		while (true) {
			for (P p=getMin(a, flag); p.x()<x; p=getMin(a, flag)) {
				res += p.x();
				flag.set(p.y(), true);
			}
			if (satisfied(flag)) break;
			flag.offer(flag.poll());
			res += x;
		}
		System.out.println(res);
		sc.close();
	}
	
	private static P getMin(long[] a, List<Boolean> flag) {
		long min = Long.MAX_VALUE;
		int index = -1;
		for (int i=0; i<a.length; i++) {
			if (flag.get(i)) continue;
			if (a[i]<min) {
				min = a[i];
				index = i;
			}
		}
		return new P(min, index);
	}
	
	private static boolean satisfied(List<Boolean> flag) {
		for (int i=0; i<flag.size(); i++) {
			if (!flag.get(i)) return false;
		}
		return true;
	}

	private static class P {
		private final long v1;
		private final int v2;
		public P(long v1, int v2) {
			this.v1 = v1;
			this.v2 = v2;
		}
		public long x() { return v1; }
		public int y() { return v2; }
	}
}
