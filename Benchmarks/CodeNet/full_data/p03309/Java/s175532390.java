import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int sum1 = 0;
		int[] a = new int[n];
		int[] b = new int[n];

		for ( int i = 0 ; i < n ; i++ ) {
			a[i] = sc1.nextInt();
			b[i] = a[i] - ( i + 1 );
		}

		Arrays.sort(b);

		int b1 = 0;

		if (n != 0 && n % 2 != 0) {
			b1 = Math.round((b[n/2] + b[n/2 - 1])/2);
		}
		else {
			b1 = b[n/2];
		}

		for ( int i = 0 ; i < n ; i++ ) {
			sum1 += Math.abs(a[i] - (b1 + i + 1));
		}

		System.out.println(sum1);

		sc1.close();

	}

}