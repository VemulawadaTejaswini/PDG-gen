import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int []B = new int[N];
		for(int i = 0; i < N; i++) {
			B[i] = scan.nextInt() - i - 1;
		}
		scan.close();
		if(N == 1) {
			System.out.println(0);
			System.exit(0);
		}
		Arrays.sort(B);
		long sum = 0;
		long min = 10000000000000000L;
		int k[] = {B[0] - 1,B[N/2], B[N/2 + 1],B[N - 1] + 1};
		for(int i = 0; i < 4; i++) {
			sum = 0;
			for(int j = 0; j < N; j++) {
				sum += abs(k[i], B[j]);
			}
			if(min > sum) {
				min = sum;
			}
		}
		System.out.println(min);

	}
	static int abs(int a, int b) {
		if(a > b) {
			return a - b;
		}else {
			return b - a;
		}
	}
}