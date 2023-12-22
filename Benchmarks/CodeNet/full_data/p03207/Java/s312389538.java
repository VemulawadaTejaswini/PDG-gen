import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] price = new int[n];
		int maxp = 0;
		int sum = 0;
		for( int i = 0; i < n; i++ ) {
			price[i] = in.nextInt();
			maxp = Math.max(price[i], maxp);
			sum += price[i];
		}
		System.out.println(sum-maxp+(maxp/2));
	}
}