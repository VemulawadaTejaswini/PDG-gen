import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		x *= 2;
		for (int i = 1; i < x; i++) {
			if (i * (i + 1) >= x) {
				System.out.println(i);
				return;
			}
		}
	}
}
