import java.util.*;

public class Playground2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		long a = 1;
		for (long i = 1; i <= n; i++) {
			a = a * i % 1000000007;
		}
		System.out.println(a);
	}
	
}