import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*String a = s.next();
		String b = s.next();
		*/
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int x = s.nextInt();
		int count = 0;
		int amount = 0;

		for (int i = 0; i < a + 1; i++) {
			for (int j = 0; j < b + 1; j++) {
				for (int k = 0; k < c + 1; k++) {
					amount = 500 * i + 100 * j + 50 * k;
					if (x == amount) {
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}
}