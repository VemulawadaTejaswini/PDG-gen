import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int count = 0;
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);
	}
}
