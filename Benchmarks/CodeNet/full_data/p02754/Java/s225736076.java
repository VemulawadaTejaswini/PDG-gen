import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long a = in.nextLong();
		long b = in.nextLong();
		long count = n / (a+b) * a;
		long m = n % (a+b);
		long other = Math.min(m, a);
		System.out.print(count + other);
	}
}
