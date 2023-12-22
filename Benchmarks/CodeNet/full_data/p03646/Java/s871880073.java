import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 50;
		long k = sc.nextLong();
		long loop = k / N;
		long mod = k % N;
		long[] arr = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i + loop;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			if (i < mod) {
				arr[i] += N - mod + 1;
			} else {
				arr[i] -= mod;
			}
			if (i != 0) {
				sb.append(" ");
			}
			sb.append(arr[i]);
		}
		System.out.println(N);
		System.out.println(sb);
	}
}
