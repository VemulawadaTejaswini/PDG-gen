import java.util.*;

// UVa 11504

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int x = 1;
		for (int i = 1; i <= n; i++) {
			x = x * i % 1000000007;
		}
		System.out.println(x);
	}
}