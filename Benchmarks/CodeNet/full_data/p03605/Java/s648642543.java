import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();

		if (n.indexOf("9") != -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}