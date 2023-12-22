import java.util.Scanner;

/*
 * AtCoder Beginner Contest 101 A
 */
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String[] sArray = s.split("");


		int result = 0;
		for (String str : sArray) {
			if (str.equals("+")) {
				result++;
			} else {
				result--;
			}
		}

		System.out.println(result);

	}

}