import java.util.Arrays;
import java.util.Scanner;

class Main {
	static int x;
	static int minI;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] abc = new int[3];
		for (int i = 0; i < abc.length; i++) {
			abc[i] = sc.nextInt();

			if (abc[i] % 2 == 0) {
				System.out.println("0");
				return;
			}
		}

		Arrays.sort(abc);

		System.out.println(abc[0] * abc[1]);

		sc.close();
	}

}
