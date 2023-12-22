import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = (String) sc.nextLine();
		if (N.contains("7")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}