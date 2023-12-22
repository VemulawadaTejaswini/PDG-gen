import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(sc.next());
		int num2 = Integer.parseInt(sc.next());

		String answer = "NO";
		if (num1 >= num2 * 2 - 1) {
			answer = "YES";
		}
		System.out.println(answer);
	}
}
