import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());

		int num = n;
		if (n == 100) {
			if (d == 0)
				num = n + 1;
			if (d == 1)
				num = n * 100 + 100;
			if (d == 2)
				num = n * 10000 + 10000;
		} else {
			if (d == 1)
				num = n * 100;
			if (d == 2)
				num = n * 10000;
		}
		System.out.println(num);
		sc.close();
	}
}
