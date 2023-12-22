import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	String s = String.valueOf(n);
	char c1 = s.charAt(0);
	char c2 = s.charAt(2);
	if (c1 == c2) {
		System.out.println("Yes");
	} else {
		System.out.println("No");
	}
}
}
