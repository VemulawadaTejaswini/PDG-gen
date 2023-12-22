import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] colors = new int[100];

		for (int i = 0; i < 3; i++) {
			int color = sc.nextInt();
			colors[color - 1] = 1;
		}

		int sum = 0;

		for (int i = 0; i < colors.length; i++) {
			sum += colors[i];
		}

		System.out.println(sum);

		sc.close();

	}

}
