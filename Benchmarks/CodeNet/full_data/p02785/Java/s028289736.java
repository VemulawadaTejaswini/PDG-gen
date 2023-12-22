import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] h = new long[n];
		long total = 0;
		for(int i = 0;i < n;i++) {
			h[i] = sc.nextInt();
		}

		if(k >= n) {
			System.out.println(0);
			return;
		}
		Arrays.sort(h);
		for(int i = 0;i < n-k;i++) {
			total += h[i];
		}
		System.out.println(total);
	}

}