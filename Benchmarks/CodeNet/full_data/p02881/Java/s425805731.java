import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long i = Math.round(Math.pow(n, 0.5));
		while(n % i != 0) {
			i--;			
		}
		long ii = n/i;
		System.out.println((ii + i - 2));
		sc.close();
	}
}
