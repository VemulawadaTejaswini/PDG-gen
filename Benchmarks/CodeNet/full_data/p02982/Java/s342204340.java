
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int[][] list = new int[n][d];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				list[i][j] = sc.nextInt();
			}
		}
		
//		int cnt = 0;
//		for (int i = 0; i < n - 1; i++) {
//			int sum = 0;
//			for (int j = 0; j < d; j++) {
//				int temp = (int) Math.pow(list[i][j] - list[i + 1][j], 2);
//				sum += temp;
//			}
//			int temp2 = (int) Math.sqrt(sum);
//			if (Math.pow(temp2, 2) == sum) {
//				cnt++;
//			}
//			
//		}
		
		// n3 d4
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = 0;
				for (int k = 0; k < d; k++) {
					int temp = (int) Math.pow(list[i][k] - list[j][k], 2);
					sum += temp;
				}
				int temp2 = (int) Math.sqrt(sum);
				if (Math.pow(temp2, 2) == sum) cnt++;
			}
		}
		
		System.out.println(cnt);
				
	}
}