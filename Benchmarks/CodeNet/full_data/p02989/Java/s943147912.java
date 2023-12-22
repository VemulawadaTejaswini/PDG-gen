import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;

		int[] d = new int[n];
		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
		}

		Arrays.sort(d);

//		for (int i = 0; i < d.length; i++) {
//			int j = d[i];
//			System.out.println(j);
//		}

		int div = n / 2;
		int a = d[div - 1];
		int b = d[div];

//		System.out.println(a + " " + b);
		if ( a != b) {
			k = b - a;
		}



		System.out.println(k);

	}

}
