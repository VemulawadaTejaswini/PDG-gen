import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();

		String answer;

		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			answer = "vowel";
			break;
		default:
			answer = "consonant";
			break;
		}

		System.out.println(answer);
	}

}
