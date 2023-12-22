import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String s = sc.nextLine();

			System.out.println(s.replaceAll(",", " "));

		} finally {
			sc.close();
		}
	}
}