import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] nums = new long[n];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		for(int i=1; i<nums.length; i++) {
			if(nums[i]%nums[0]==0) {
				continue;
			}else {
				System.out.println(1);
				return;
			}
		}
		System.out.println(nums[0]);
	}
}
