import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long x = scan.nextLong();
		long[]a = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextLong();
		}
		scan.close();
		Arrays.sort(a);
		long sum = 0;
		if(a[0] > x) {
			System.out.println(0);
			System.exit(0);
		}
		for(int i = 0; i < N; i++) {
			sum += a[i];
			if(sum > x) {
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println(N);
	}
}