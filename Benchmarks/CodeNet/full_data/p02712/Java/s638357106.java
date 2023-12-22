import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] sum = new long[n+1];
		sum[1] = 1;
		for (int i = 2; i < n+1; i++) {
			if (i % 3== 0 || i%5 ==0) {
				sum[i] = sum[i-1];
			} else {
				sum[i] = sum[i-1] + i;
			}
		}
		System.out.println(sum[n]);
	}

}
