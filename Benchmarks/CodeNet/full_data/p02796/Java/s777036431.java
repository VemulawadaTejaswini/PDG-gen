import java.util.Arrays;
import java.util.Scanner;
 //区間スケジューリング
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int n = scanner.nextInt();
 
		int robots[][] = new int[n][2];
 
		int x, l;
		for (int i = 0; i < n; i++) {
			x = scanner.nextInt();
			l = scanner.nextInt();
			robots[i][0] = x - l;
			robots[i][1] = x + l;
		}
		//X+Lが小さい順に並べる
		for(int i = 0;i<n-1;i++) {
			for(int j = i+1;j<n;j++) {
				if(robots[i][1]>robots[j][1]) {
					int temp_a = robots[i][1];
					robots[i][1] = robots[j][1];
					robots[j][1] = temp_a;
					int temp_b = robots[i][0];
					robots[i][0] = robots[j][0];
					robots[j][0] = temp_b;
					
					}
			}
		}
		
        //ロボットの腕が既に残すと決めたロボットの腕と重ならなければロボットを残す。
		int filled = Integer.MIN_VALUE;
		int count = 0;
 
		for (int i = 0;i<n;i++) {
			if (filled <= robots[i][0]) {
				count++;
				filled = robots[i][1];
			}
		}
		System.out.println(count);
	}
}

	


