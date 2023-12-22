
import java.util.Arrays;
import java.util.Scanner;
 //区間スケジューリング
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
 
		robots robots[] = new robots[n];
 
		int x, l;
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			l = sc.nextInt();
			robots[i].right = x - l;
			robots[i].left = x + l;
		}
		//X+Lが小さい順に並べる
		Arrays.parallelSort(robots, (a, b) -> a.left - b.left);
		/*
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
		*/
		
        //ロボットの腕が既に残すと決めたロボットの腕と重ならなければロボットを残す。
		int filled = Integer.MIN_VALUE;
		int count = 0;
 
		for (int i = 0;i<n;i++) {
			if (filled <= robots[i].right) {
				count++;
				filled = robots[i].left;
			}
		}
		System.out.println(count);
	}
	class robots {
		int right = 0;
		int left = 0;
	}
}

	