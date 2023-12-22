import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		// AKIHABARA
		if (s.matches("A?KIHA?BA?RA?")) {
			System.out.println("YES");

		} else {
			System.out.println("NO");
		}
	}
}
