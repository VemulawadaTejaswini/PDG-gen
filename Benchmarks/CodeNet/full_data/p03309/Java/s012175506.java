import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int sum = 0;
		int[] a = new int[n];

		for ( int i = 0 ; i < n ; i++ ) {
			a[i] = sc1.nextInt();
			sum += a[i] - ( i + 1 );
		}

		int ans1 = sum/n;
		int ans2 = sum/n + 1;
		int ans3 = sum/n - 1;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for ( int i = 0 ; i < n ; i++ ) {;
			sum1 += Math.abs(a[i] - (ans1 + i + 1 ));
			sum2 += Math.abs(a[i] - (ans2 + i + 1 ));
			sum3 += Math.abs(a[i] - (ans3 + i + 1 ));
		}

		//System.out.println(sum1);
		//System.out.println(sum2);
		//System.out.println(sum3);

		int[] b = new int[3];
		b[0] = sum1;
		b[1] = sum2;
		b[2] = sum3;

		Arrays.sort(b);

		System.out.println(b[0]);

		sc1.close();

	}

}