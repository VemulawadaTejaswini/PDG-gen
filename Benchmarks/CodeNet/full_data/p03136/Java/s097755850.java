import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] sides = new int[n];
		int maxp = 0;
		int sum = 0;
		String ans = "Yes";
		for( int i = 0; i < n; i++ ) {
			sides[i] = in.nextInt();
			maxp = Math.max(sides[i], maxp);
			sum += sides[i];
		}
		sum -= maxp;
		if(maxp>=sum) ans = "No";
		System.out.println(ans);
	}
}