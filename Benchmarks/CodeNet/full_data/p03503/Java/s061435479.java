import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] f = new int[n][10];
		int[][] p = new int[n][11];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 10; j++) {
				f[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 11; j++) {
				p[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		boolean flag = false;
		for (int i = 0; i < 1 << 10; i++) {
			int sum = 0;
			boolean flag2 = false;
			for (int j = 0; j < n; j++) {
				int count = 0;
				for (int k = 0; k < 10; k++) {
					if ((i & 1 << k) == 1 && f[n][9 - k] == 1) {
						count++;
					}
				}
				if (!flag2) {
					sum = p[n][count];
					flag2 = true;
				} else {
					sum += p[n][count];
				}
			}
			if (!flag) {
				max = sum;
				flag = true;
			} else {
				max = Math.max(max, sum);
			}
		}
		System.out.println(max);
	}
}