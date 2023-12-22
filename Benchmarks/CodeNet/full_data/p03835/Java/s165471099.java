import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		int x, y, z;
		int count = 0;

		for (x = 0; x <= k; x++) {
			if (s - x >= 2 * k) {
				for (y = k; y >= 0; y--)
					if (s - x - y >= k) {
						for (z = k; z >= 0; z--) {
							if ((x + y + z) == s)
								count++;
						}
					}
			}
		}
		System.out.println(count);
	}

}
