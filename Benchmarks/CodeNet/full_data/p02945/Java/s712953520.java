import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int wa = a + b;
		int sa = a - b;
		int seki = a * b;

		if (wa > sa) {
			if (wa > seki) {
				System.out.println(wa);
				return;
			} else if (sa > seki) {
				System.out.println(sa);
				return;
			} else {
				System.out.println(seki);
			}
		}
	}
}

