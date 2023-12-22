import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] h = new long[n];
		for(int i = 0 ; i < n ; i++) {
			h[i] = sc.nextLong();
		}
		Arrays.sort(h);
		long sum = 0;
		for(int i = n ; i >= 0 ; i-- , k--) {
			if(k >= 0)
				continue;
			sum += h[i];
		}
		System.out.println(sum);

	}


}

