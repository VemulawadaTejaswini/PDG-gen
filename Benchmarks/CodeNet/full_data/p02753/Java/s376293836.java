

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String S = scan.next();

		String anser = "No";

		if(S.contains("A") && S.contains("B")) {
			anser = "Yes";
		}
		System.out.println(anser);
	}

}
