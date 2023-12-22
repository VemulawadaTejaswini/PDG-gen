import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		for(int i = 0; i < n; i ++) {
			a[i] = sc.nextLong();
		}
		sc.close();
		long max = 0;
		for(int i = 0; i <= k; i ++) {
			long sum = 0;
			for(int j = 0; j < n; j ++) {
				sum += i ^ a[j];
			}
			if(max < sum) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}
