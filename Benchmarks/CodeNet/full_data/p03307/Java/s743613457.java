import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = Long.parseLong(in.nextLine());
		solve(n);
	}
	
	public static void solve( long n ) {
		if ( n%2 == 0 ) {
			System.out.println(n);
		} else {
			System.out.println(n*2);
		}
	}
}