import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String c = sc.next();
		String ans = "";

		if (c=="a" ||c=="i" ||c=="u" ||c=="e" ||c=="o" ) {
			ans = "vowel";
		} else {
			ans = "consonant";
		}

		System.out.println( ans );
	}
}