import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();

		int i = 1;
		Long power = 1L;
		while (i <= c) {
			power = (long) (power * i % (Math.pow(10, 9) + 7));
			// System.out.println(i + "kaime, " + power);
			i++;
		}

		System.out.println(power);
		sc.close();
	}
}