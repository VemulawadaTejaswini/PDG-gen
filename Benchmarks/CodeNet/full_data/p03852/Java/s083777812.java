import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		boolean ans = false;

		char [] array = {'a', 'i', 'u', 'e', 'o'};
		for(char v : array) {
			if (v == c) {
				ans = true;
				break;
			}
		}

		System.out.println(ans ? "vowel" : "consonant");

	}

}