import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flg = false;
		int n = sc.nextInt();
		long k = sc.nextLong();

		long[] a = new long[n];

		for (int i=0; i < n; i++){
			a[i] = sc.nextLong();
		}

		for (int i=0; i < n; i++){
			if (a[i] == k){
				 flg = true;
			}
		}

		if (!flg){
			Arrays.sort(a);

			long sa = a[n-1] - a[0];

			if (sa > a[n-2]){
				flg = true;
			}
		}

		if (flg){
			System.out.println("POSSIBLE");
		}else{
			System.out.println("IMPOSSIBLE");
		}

		sc.close();
	}

}