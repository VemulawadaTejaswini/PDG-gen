import java.util.*;

// ABC 27-C
// http://abc027.contest.atcoder.jp/tasks/abc027_c
 
public class Main {
	
	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int t = in.nextInt();
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		
		boolean isSwitchOn = false;
		long switchOnFrom = 0;
		long switchGoesOffAt = 0;
		long answer = 0;
		
		for (int i = 0; i < n; i++) {
			if (switchGoesOffAt < nums[i]) {
				isSwitchOn = false;
				answer += switchGoesOffAt - switchOnFrom;
			}
			if (isSwitchOn) {
				switchGoesOffAt = nums[i] + t;
			} else {
				switchOnFrom = nums[i];
				switchGoesOffAt = nums[i] + t;
				isSwitchOn = true;
			}
		}
		
		if (isSwitchOn) {
			answer += switchGoesOffAt - switchOnFrom;
		}
		
		System.out.println(answer);
	}
}