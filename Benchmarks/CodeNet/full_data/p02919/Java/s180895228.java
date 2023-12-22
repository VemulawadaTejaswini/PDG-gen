import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		long[] pos = new long[N + 1];
		for ( int i = 0 ; i < N ; i++ ) {
			P[i] = sc.nextInt();
			pos[P[i]] = i + 1;
		}
		sc.close();

		long sum = 0;
		TreeSet<Long> tree = new TreeSet<>();
		tree.add(pos[N]);
		for ( int i = N - 1 ; i >= 1 ; i-- ) {
			Long lower = tree.lower(pos[i]);
			Long higher = tree.higher(pos[i]);
			if ( lower == null ) {
				Long higher2 = tree.higher(higher);
				if ( higher2 == null ) {
					sum += pos[i] * ( N - higher + 1) * i;
				} else {
					sum += pos[i] * ( higher2 - higher) * i;
				}
			} else if ( higher == null ) {
				Long lower2 = tree.lower(lower);
				if ( lower2 == null ) {
					sum += lower * (N - pos[i] + 1) * i;
				} else {
					sum += (lower - lower2) * (N - pos[i] + 1) * i;
				}
			} else {
				Long lower2 = tree.lower(lower);
				Long higher2 = tree.higher(higher);
				if ( lower2 == null ) {
					if ( higher2 == null ) {
						sum += lower * (higher - pos[i]) * i;
						sum += (pos[i] - lower) * (N - higher + 1) * i;
					} else {
						sum += lower * (higher - pos[i]) * i;
						sum += (pos[i] - lower) * (higher2 - higher) * i;
					}
				} else {
					if ( higher2 == null ) {
						sum += (lower - lower2) * (higher - pos[i]) * i;
						sum += (pos[i] - lower) * (N - higher + 1) * i;
					} else {
						sum += (lower - lower2) * (higher - pos[i]) * i;
						sum += (pos[i] - lower) * (higher2 - higher) * i;
					}
				}
			}
			tree.add(pos[i]);
		}
		System.out.println(sum);
	}
}
