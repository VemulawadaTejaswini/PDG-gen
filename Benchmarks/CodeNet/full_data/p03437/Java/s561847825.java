import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		long y = sc.nextInt();
		long a = 1;
		long z;
		boolean e = false;
		for (int i = 1; i <= 18; i++)
			a = a * 10;
		if (x != y) {
			int i = (int)(y / x);
			for (; x*i <= a; i++) {
				z = x * i;
				if ((z % y) != 0) {
					System.out.println(z);
					e = true;
					break;
				}
			}
		}
		if (!e)
			System.out.println("-1");
	}
}