import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = sc.nextLong();
		
		// find the bottle neck of each station
		long bottleNeckOfA = (long) Math.ceil((double)n / (double)a);
		long bottleNeckOfB = (long) Math.ceil((double)n / (double)b);
		long bottleNeckOfC = (long) Math.ceil((double)n / (double)c);
		long bottleNeckOfD = (long) Math.ceil((double)n / (double)d);
		long bottleNeckOfE = (long) Math.ceil((double)n / (double)e);
		
		// find max bottle neck
		long maxBottleNeck = Math.max(bottleNeckOfA, Math.max(bottleNeckOfB,
				Math.max(bottleNeckOfC, Math.max(bottleNeckOfD, bottleNeckOfE))));
		
		// calculate the final ans
		long ans = maxBottleNeck + 4;
		
		System.out.println(ans);
	}
}