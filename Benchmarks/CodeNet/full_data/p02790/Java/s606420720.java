import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int min = Math.min(a, b);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < min; i++) {
			sb.append(min);
		}

		System.out.println(sb.toString());

		sc.close();
	}

}
