import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final String S = scn.next();
			final String T = scn.next();
			System.out.print(T);
			System.out.println(S);
		}
	}
}
