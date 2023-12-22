import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		if (Math.abs(a - b) % 2 == 0) {
			System.out.println(Math.abs(a - b) / 2);
		} else {
			System.out.println(Math.min(n - Math.min(a, b), Math.max(a, b) - 1));
		}
		
		sc.close();
	}

}
