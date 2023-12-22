import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] num = new int[3];
		Arrays.fill(num, -1);
		
		boolean flag = false;
		
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt() - 1;
			int c = sc.nextInt();
			if (num[s] > 0 && num[s] != c || c == 0 && s < n - 1) {
				flag = true;
				break;
			} else {
				num[s] = c;
			}
		}
		for (int i = 1; i < num.length; i++) {
			if (num[i] < 0) {
				num[i] = 0;
			}
		}
		if (num[0] < 0) {
			num[0] = 1;
		}
		if (flag) {
			System.out.println(-1);
		} else {
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]);
			}
			System.out.println();
		}
	}
}
