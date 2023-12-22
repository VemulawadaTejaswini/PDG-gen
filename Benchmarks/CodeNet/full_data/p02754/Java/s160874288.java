import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();
		long unit = n / (a + b);
		long remain = 0;
		if (n % (a + b) > a) {
			remain = a;
		} else {
			remain = n % (a + b);
		}

		long answer = unit * a + remain;

		print(answer);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
