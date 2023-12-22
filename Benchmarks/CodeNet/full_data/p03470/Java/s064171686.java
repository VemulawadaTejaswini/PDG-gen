import java.util.*;

// ABC 54-D
// https://beta.atcoder.jp/contests/abc054/tasks/abc054_d

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = in.nextInt();
		}
		
		Arrays.sort(nums);
		int answer = 1;
		int pre = nums[0];
		for (int i = 1; i < N; i++) {
			if (pre < nums[i]) {
				answer++;
				pre = nums[i];
			}
			
		}
		System.out.println(answer);
	}
}