import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		if (str == "AAA" || str == "BBB") {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

}
