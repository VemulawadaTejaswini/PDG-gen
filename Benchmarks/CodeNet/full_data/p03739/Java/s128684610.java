import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();

		long[] A = new long[N];

		for (int i = 0; i < N; i++) {
			long ai = sc.nextLong();
			A[i] = ai;
		}
		long cnt = 0;
		if(A[0] ==0) {
			A[0] = 1;
			long cntA = countOps(A);
			A[0] = -1;
			long cntB = countOps(A);
			cnt = Math.min(cntA, cntB);
		}else {
			cnt = countOps(A);
		}
		System.out.println(cnt);
		sc.close();
	}

	private long countOps(long[] A) {
		long[] arr = A.clone();
		long sum = arr[0];
		long cnt = 0;
		for (int i = 1; i < arr.length; i++) {
			if (sum > 0) {
				if (sum + arr[i] >= 0) {
					cnt += sum + arr[i] + 1;
					arr[i] = -sum - 1;
					sum = -1;
				} else {
					sum = sum + arr[i];
				}
			} else {// sum <0
				if (sum + arr[i] <= 0) {
					cnt += (sum + arr[i]) * -1 + 1;
					arr[i] = -sum + 1;
					sum = 1;
				} else {
					sum = sum + arr[i];
				}
			}
		}
		return cnt;
	}

}
