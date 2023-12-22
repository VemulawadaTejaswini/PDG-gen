import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();

		if (3 * k < s) {
			System.out.println("");
			System.exit(0);
		}

		int r = 0;
		for (int x = 0; x <= k; x++) {
			for (int y = 0; y <= s - x && y <= k; y++) {
				for (int z = 0; z <= s - x - y && z <= k; z++) {
					if (x + y + z == s) {
						r++;					}
				}
			}
		}

		System.out.println(r);

	}

}
