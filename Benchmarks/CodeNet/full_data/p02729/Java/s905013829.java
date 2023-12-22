import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int total = 0;

		for (int i = 1; i < n; i++) {
			total += i;
		}
		if (m != 1) {
			System.out.println(total + m);
		} else {
			System.out.println(total);
		}
	}

}
