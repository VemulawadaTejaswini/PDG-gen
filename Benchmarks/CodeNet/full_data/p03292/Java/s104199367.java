import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for (int i = 0; i < 3; ++i)
			a[i] = sc.nextInt();
		sc.close();
		int ans = 1000, tmp = 0;
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				if (i != j) {
					tmp = Math.abs(a[i] - a[j]);
					for (int k = 0; k < 3; ++k) {
						int tmp2 = 0;
						if (i != k && j != k) {
							tmp2 = Math.abs(a[i] - a[k]);
							ans = Math.min(ans, tmp + tmp2);
							tmp2 = Math.abs(a[j] - a[k]);
							ans = Math.min(ans, tmp + tmp2);
						}
					}
				}
			}
		}
		System.out.println(ans);
	}

}
