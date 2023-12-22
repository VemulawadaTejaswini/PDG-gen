import java.util.Scanner;

public class Main {
	static int MOD = 998244353;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int[] A = new int[N + 1];
		for (int i = 0; i < N; i++) {
			A[i + 1] = sc.nextInt();
		}
		sc.close();

		int[][] dpa = new int[2][];
		dpa[0] = new int[S + 1];
		dpa[1] = new int[S + 1];
		int[][] dpl = new int[2][];
		dpl[0] = new int[S + 1];
		dpl[1] = new int[S + 1];
		dpl[0][0] = 0;
		dpa[0][0] = 0;
		for ( int r = 1 ; r <= N ; r++ ) {
			int curr = r % 2;
			int lastr = (r - 1) % 2;
			dpl[curr][0] = dpl[lastr][0] + 1;
			dpa[curr][0] = (dpl[curr][0] + dpa[lastr][0]) % MOD;
			for ( int s = 1 ; s <= S ; s++ ) {
				dpl[curr][s] = (s - A[r] >= 0) ? dpl[lastr][s - A[r]] : 0;
				if (s == A[r]) {
					dpl[curr][s]++;
				}
				dpl[curr][s] = (dpl[curr][s] + dpl[lastr][s]) % MOD;

				dpa[curr][s] = (dpl[curr][s] + dpa[lastr][s]) % MOD;
			}
		}
		System.out.println(dpa[N % 2][S]);
	}
}
