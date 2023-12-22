import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(a);
		int max = a[n - 1];
		int median1 = 0;
		int median2 = 0;
		int ans2 = 0;
		if(max % 2 == 0) {
			median1 = max / 2;
			int min = 1000000;
			for(int i = 0; i < n - 1; i++) {
				if(min > median1 - a[i]) {
					min = (median1 - a[i]) * (median1 - a[i]);
					ans2 = a[i];
				}
			}
		}else {
			median1 = max / 2 ;
			median2 = max / 2 + 1;
//			System.out.println(median1);
//			System.out.println(median2);
			int min = 1000000;
			for(int i = 0; i < n - 1; i++) {
				int min1 = (median1 - a[i]) * (median1 - a[i]);
				int min2 = (median2 - a[i]) * (median2 - a[i]);
				int k;
				if(min1 > min2) {
					k = min2;
				}else {
					k = min1;
				}
//				System.out.println(min1);
//				System.out.println(min2);
				if(k < min) {
					min = k;
					ans2 = a[i];
				}
			}
		}

		System.out.println(max + " " + ans2);

	}
	public static int comb(int n, int k) {
		int ans = factrial(n) / (factrial(n - k) * factrial(k));
		return ans;
	}
	public static int factrial(int n) {
		if(n <= 1) {
			return n;
		}else {
			return n * factrial(n - 1);
		}
	}
}