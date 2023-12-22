import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] prefix = new int[n];
		int[] postfix = new int[n];
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++) {
			int w = sc.nextInt();
			nums[i] = w;
		}
		
		prefix[0] = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			prefix[i] = nums[i] + prefix[i-1];
		}

		postfix[n-1] = nums[n-1];
		
		for (int i = n - 2; i >= 0; i--) {
			postfix[i] = postfix[i+1] + nums[i];
		}

		int res = Integer.MAX_VALUE;
		
		for (int i = 1; i < n; i++) {
			res = Math.min(res, Math.abs(postfix[i] - prefix[i-1]));
		}
		
		System.out.println(res);
	}

}