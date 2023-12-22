import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] nums = new int[num];
		int sum = 0;
		double divisor = 0, dividend = 1;
		for(int i = 0; i < num; i++){
			nums[i] = sc.nextInt();
			dividend *= nums[i];
		}
		for(int i : nums){
			divisor += dividend / i;
		}
		double ans = dividend / divisor;

		System.out.println(ans);
	}
}


