import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		int ans = 0;
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		
		for(int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j < n - 1; j++) {
				ans += lowerBound(nums, nums[i] + nums[j]) - j;
			}
		}
		
		
		System.out.println(ans);

	}
	public static int lowerBound(int[] A, int a) {
		int high = A.length - 1;
		int low = 0;
		while(high - low > 1) {
			int mid = (high + low) / 2;
			if(A[mid] >= a) {
				high = mid;
			} else {
				low = mid;
			}
		}
		return high;
	}

	

}