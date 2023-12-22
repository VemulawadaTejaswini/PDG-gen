import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		if (str.charAt(2) == str.charAt(3) && str.charAt(4) == str.charAt(5))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
