import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
	static int[] A = new int[N];
	static int[] B = new int[N];
	static Pair[] D = new Pair[N];
	static class Pair{
		public int first;
		public int second;
		public Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}
	static class TheComparatorPair implements Comparator<Object> {
		public int compare(Object a0, Object b0) {
			Pair a = (Pair)a0;
			Pair b = (Pair)b0;

			if(a.first + a.second > b.first + b.second) {
				return 1;
			} else if(a.first + a.second < b.first + b.second) {
				return -1;
			} else {
				return 0;
			}
//			if(Math.abs(a.first - a.second) > Math.abs(b.first - b.second)) {
//				return 1;
//			} else if(Math.abs(a.first - a.second) < Math.abs(b.first - b.second)) {
//				return -1;
//			} else {
//				return 0;
//			}
		}
	}
	public static void main(String[] args) {
//		List<Pair<Integer, Integer>> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
			B[i] = Integer.parseInt(sc.next());
//			list.add(new Pair<Integer, Integer>(A[i], B[i]));
//			D[i] = A[i] - B[i];
			D[i] = new Pair(A[i], B[i]);
		}
//		list.stream().sorted(Comparator.comparingInt(i, ))
		TheComparatorPair c = new TheComparatorPair();
		long ans = 0;
		Arrays.sort(D, c);
		for (int i = 0; i < N; i++) {
			if (i%2 == 0) {
				ans += D[i].first;

			} else {
				ans -= D[i].second;
			}
		}
		System.out.println(ans);
	}
}