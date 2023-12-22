import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long max = Long.MIN_VALUE;
		Long[] nums = new Long[n];
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextLong();
		}
		
		for(int i=0; i<=k; i++) {
			long sum = 0;
			for(int j=0; j<n; j++) {
				sum += i^nums[j];
			}
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}
}
