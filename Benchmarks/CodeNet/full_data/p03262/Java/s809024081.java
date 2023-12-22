import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		int D = Integer.MAX_VALUE;
		if(x<nums[0]) {
			D = Math.abs(nums[0]-x);
		}else if(x>=nums[0] && x<=nums[n-1]) {
			for(int i=0; i<n; i++) {
				D = Math.min(D, Math.abs(nums[i]-x));
			}
		}else {
			D = Math.abs(nums[n-1]-x);
		}
		System.out.println(D);
	}
}
