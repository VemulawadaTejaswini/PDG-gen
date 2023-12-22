import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String S = scan.next();

		System.out.println(S.equals("AAA") || S.equals("BBB")?"No":"Yes");
		scan.close();

	}

}
