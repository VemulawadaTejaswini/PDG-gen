
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		boolean bool = true;

		loop: for (int i = 0; i < 1000; i++) {
			int k1 = new Double(i * 0.08).intValue();
			int k2 = new Double(i * 0.1).intValue();

			int k3 = new Double(i * 0.09).intValue();

			for (int j = k1; k1 < k3; j++) {

				if (new Double(j * 0.08).intValue() == a && new Double(j * 0.1).intValue() == b) {
					bool = false;
					System.out.println(j);
					break loop;
				}
			}

		}
		if (bool) {
			System.out.println("-1");
		}

		sc.close();
	}

}
