import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] nums = new int[n];
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
			if(nums[i]%2==0) {
				while(nums[i]%2==0) {
					nums[i] = nums[i]/2;
					count++;
				}
			}else {
				continue;
			}
		}
		System.out.println(count);
	}
}
