import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = 0;
		if (b != 100) {
			if (b >= 10) {
				x = a * 100 + b;
			} else if (b < 10) {
				x = a * 10 + b;
			}
		} else {
			x = a * 1000 + b;
		}
		for (int i = 0; i * i < x; i++) {
			if (i * i == x) {
				System.out.println("Yes");
			}
		}
		System.out.println("No");
		sc.close();

	}

}
