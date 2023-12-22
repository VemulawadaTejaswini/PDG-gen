import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Integer.parseInt(sc.next());
		long a = Integer.parseInt(sc.next());
		long b = Integer.parseInt(sc.next());
		System.out.println((long) Math.floor(n / (a + b)) * a + Math.min(n % (a + b), a));
	}
}