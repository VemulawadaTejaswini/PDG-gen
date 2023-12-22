import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		for (int i = x; i >= 1; i--) {
			for (int j = 1; j < 32; j++) {
				for (int j2 = 2; j2 < 10; j2++) {
					int a = (int) Math.pow(j, j2);
					if (a == i) {
						System.out.println(i);
						return;
					}
				}
			}
		}
	}
}
