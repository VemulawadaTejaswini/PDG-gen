import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] abc = new int[3];
		for (int i = 0; i < abc.length; i++) {
			abc[i] = sc.nextInt();
			if (abc[i] % 2 == 0) {
				return;
			}
		}

		System.out.println(Math.min(Math.min(abc[0] * abc[1], abc[0] * abc[2]), abc[1] * abc[2]));

		sc.close();
	}
}