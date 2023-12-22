import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String replace = String.valueOf(n);

		replace = replace.replace("1", "x");
		replace = replace.replace("9", "1");
		replace = replace.replace("x", "9");

		System.out.println(replace);

		sc.close();
	}

}
