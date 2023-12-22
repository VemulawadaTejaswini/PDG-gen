import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		long n = kb.nextInt();
		long a = kb.nextInt();
		long b = kb.nextInt();
		if (a == 0)
			System.out.println(0);
		else if (0 < a && a <= n) {
			if (a + b >= n)
				System.out.println(a);
			else
				System.out.println(n-b);
		} else {
			System.out.println(n);
		}
		kb.close();
	}

}
