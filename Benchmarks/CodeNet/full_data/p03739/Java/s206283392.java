import java.util.*;

// ABC 6-C
// http://abc006.contest.atcoder.jp/tasks/abc006_3
 
public class Main {
	
	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		
		long answer = 0;
		if (nums[0] == 0) {
			answer = solve(nums, 0, 0);
		} else {
			answer = solve(nums, nums[0], 1);
		}
		
		System.out.println(answer);
		
//		
//		long sum = 0;
//		long answer = 0;
//		
//		for (int i = 0; i < n; i++) {
//			int a = in.nextInt();
//			
//			if (sum < 0 && sum + a < 0) {
//				answer += 1 + Math.abs(sum + a);
//				sum = 1;
//			} else if (sum > 0 && sum + a > 0) {
//				answer += 1 + sum + a;
//				sum = -1;
//			} else if (sum + a == 0) {
//				answer++;
//				if (sum < 0) {
//					sum = 1;
//				} else {
//					sum = -1;
//				}
//			} else { 
//				sum += a;
//			}
//		}
		
//		System.out.println(answer);
	}
	
	public static long solve(int[] nums, long sum, int index) {
		if (index == nums.length) {
			return 0;
		}
		if (sum < 0 && sum + nums[index] < 0) {
			return 1 + Math.abs(sum + nums[index]) + solve(nums, 1, index + 1);
		} else if (sum > 0 && sum + nums[index] > 0) {
			return 1 + sum + nums[index] + solve(nums, -1, index + 1);
		} else if (sum + nums[index] == 0 || sum == 0) {
			return 1 + Math.min(solve(nums, 1, index + 1), solve(nums, -1, index + 1));
		} else {
			return solve(nums, sum + nums[index], index + 1);
		}
	}
}