import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int c = in.nextInt();
		int[] b = new int[m];
		int ret = 0;
		for (int i = 0; i < m; i++) {
			b[i] = in.nextInt();
		}
		for (int j = 0; j < n; j++) {
			int sum = 0;
			for (int i = 0; i < m; i++) {
				int a = in.nextInt();
				sum += a * b[i];
			}
			if (sum + c > 0) {
				ret++;
			}
		}
		System.out.println(ret);
	}

}
