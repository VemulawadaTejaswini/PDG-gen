import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] X = new int[N];
		int[] remainder = new int[M];
		int[] db = new int[M];
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i=0;i<N;i++) {
			X[i] = sc.nextInt();
			remainder[X[i]%M]++;
			if (set.contains(X[i])) {
				db[X[i]%M]++;
				set.remove(X[i]);
			} else { // set.!contains(X[i])
				set.add(X[i]);
			}
		}
		int ans = 0;
		for (int i=0;i<M/2+1;i++) {
			if (i==(M-i)%M) {
				ans += remainder[i]/2;
				remainder[i]-=remainder[i];
			} else {
				int tmp = Math.min(remainder[i], remainder[(M-i)%M]);
				ans += tmp;
				remainder[i] -= tmp;
				remainder[(M-i)%M] -= tmp;
			}
		}
		for (int i=0;i<M;i++) {
			int tmp = Math.min(remainder[i]/2, db[i]);
			ans += tmp;
			remainder[i] -= tmp*2;
		}
		System.out.println(ans);
		// System.out.println(Arrays.toString(remainder));
		// System.out.println(Arrays.toString(db));
	}
}