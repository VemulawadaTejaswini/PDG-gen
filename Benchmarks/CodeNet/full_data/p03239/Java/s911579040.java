
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int targetTime = scan.nextInt();
		
		int ans = Integer.MAX_VALUE;
		int[][] costTime = new int[n][2];
		for (int i = 0; i < costTime.length; i++) {
			for (int j = 0; j < 2; j++) {
				costTime[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < costTime.length; i++) {
			if (!(costTime[i][1] <= targetTime)) {
				continue;
			}
			
			if(ans > costTime[i][0]) {
				ans = costTime[i][0];
			}
		}
		
		if (ans == Integer.MAX_VALUE) {
			System.out.println("TLE");
		} else {
			
			System.out.println(ans);
		}
		
	}
}