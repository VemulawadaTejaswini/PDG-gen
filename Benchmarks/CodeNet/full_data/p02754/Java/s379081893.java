import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		long n = kb.nextLong();
		long a = kb.nextLong();
		long b = kb.nextLong();
		long count = n / (a + b);
		long k = 0;
		if (a == 0)
			System.out.println(0);
		else if (0 < a && a <= n) {
			if (a + b >= n)
				System.out.println(a);
			else {
				if (a < n - a - b)
					System.out.println(count * a + a);
				else
					System.out.println(count * a + (n - a - b));
			}
		} else {
			System.out.println(n);
		}
		kb.close();
	}

}
