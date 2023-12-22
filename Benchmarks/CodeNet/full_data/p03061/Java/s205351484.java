import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long a[] = new long[n + 1];

		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		long ans = 1;
		int cd = 0;
Arrays.sort(a);
		for (long i = a[n]; i >=1; i--) {
			for (int j = 1; j <= n; j++) {
				if (a[j] % i != 0) {
					cd++;
					//System.out.println("cd" + i + " " + cd);
				}
			}
			//System.out.println("sd#"+cd);


				if (cd <=1) {
					ans = i ;
					break;
				}
			cd = 0;
		}
		System.out.println(ans);
	}
}