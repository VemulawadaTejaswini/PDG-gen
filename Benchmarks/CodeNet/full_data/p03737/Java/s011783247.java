import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] s = stdIn.nextLine().split(" ");
		char[] headChars = {s[0].charAt(0), s[1].charAt(0), s[2].charAt(0)};
		String head = new String(headChars);
		System.out.println(head.toUpperCase());

	}

}
