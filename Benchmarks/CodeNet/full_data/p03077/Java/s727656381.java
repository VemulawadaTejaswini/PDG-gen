
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long c = Long.parseLong(sc.next());
		long d = Long.parseLong(sc.next());
		long e = Long.parseLong(sc.next());
		sc.close();
		
		long m = Math.min(a, b);
		m = Math.min(m, c);
		m = Math.min(m, d);
		m = Math.min(m, e);
		
		System.out.println((n-1)/m + 1 + 4);

	}

}
