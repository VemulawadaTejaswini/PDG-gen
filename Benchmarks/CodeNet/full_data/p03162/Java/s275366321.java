
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum[] = new int[3];
		int nums[] = new int[3];
		for (int i = 0; i < n; i++) {
			nums[0] = sc.nextInt();
			nums[1] = sc.nextInt();
			nums[2] = sc.nextInt();
			if( i == 0) {
				sum[0] = nums[0];
				sum[1] = nums[1];
				sum[2] = nums[2];
			}
			else {
				int[] newSum = new int[3];
				for(int j = 0; j < 3; j++) {
					for(int t = 0; t < 3; t++) {
						if(j != t)
							newSum[j] = Math.max(newSum[j], nums[j]+sum[t]);
					}
				}
				sum = new int[3];
				sum = newSum.clone();
				newSum = new int[3];
			}
		}
		System.out.println(Math.max(sum[0], Math.max(sum[1], sum[2])));
	}
}
