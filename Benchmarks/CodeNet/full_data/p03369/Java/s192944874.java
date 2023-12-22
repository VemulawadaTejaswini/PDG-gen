import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int topping = 0;
		for (char c : S.toCharArray()) {
			if (c == 'o') {
				topping += 100;
			}
		}
		System.out.println(700 + topping);
	}
}