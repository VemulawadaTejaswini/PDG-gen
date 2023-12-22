import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int A = scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}

		long val = printSubsequences(arr, N, A);
		System.out.println(val);
	}

	public static long printSubsequences(int[] arr, int n, int A) {
		int opsize = (int) Math.pow(2, n);
		long mainsum = 0;
		for (int i = 0; i < arr.length; i++) {
			mainsum = mainsum + arr[i];
		}
		long ans = 0;
		for (int counter = 1; counter < opsize; counter++) {
			long sum = 0;
			long count = 0;
			for (int j = 0; j < n; j++) {
				if (BigInteger.valueOf(counter).testBit(j)) {
					sum += arr[j];
					count++;
				}
			}
			long val = sum / count;
			if (val == A) {
				boolean check = val * count == sum;
				if (check) {
					ans++;
				}
			}
		}
		return ans;
	}
}