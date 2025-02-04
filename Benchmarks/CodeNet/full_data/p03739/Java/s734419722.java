import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] nums = new long[n];
		for(int i = 0; i < n; i++){
			nums[i] = sc.nextInt();
		}
		long result = 0;
		long sum = 0;
		// + - + -
		for(int i = 0; i < n; i++){
			if(i % 2 == 0 && sum + nums[i] <= 0){
				result += Math.abs(1 - (sum + nums[i]));
				sum = 1;
			}
			else if(i % 2 == 1 && sum + nums[i] >= 0){
				result += Math.abs(-1 - (sum + nums[i]));
				sum = -1;
			}
			else{
				sum += nums[i];
			}
		}
		
		int result2 = 0;
		sum = 0;
		// - + - +
		for(int i = 0; i < n; i++){
			if(i % 2 == 1 && sum + nums[i] <= 0){
				result2 += Math.abs(1 - (sum + nums[i]));
				sum = 1;
			}
			else if(i % 2 == 0 && sum + nums[i] >= 0){
				result2 += Math.abs(-1 - (sum + nums[i]));
				sum = -1;
			}
			else{
				sum += nums[i];
			}
		}
		
		System.out.println(Math.min(result, result2));
		
		sc.close();
	}
}