import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		String N = sc.next();
		String answer = null;
		switch (N) {
		case "A":
			answer = "T";
			break;
		case "T":
			answer = "A";
			break;
		case "C":
			answer = "C";
			break;
		case "G":
			answer = "C";
			break;
		}

		System.out.println(answer);

	}
}
