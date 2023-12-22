import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("Christmas");

		for (int i = sc.nextInt(); i < 25; i++) {
			sb.append(" Eve");
		}

		System.out.println(sb);

		sc.close();
	}
}

