import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		char[] list = s.toCharArray();

		Arrays.sort(list);

		if (list[0] == list[1] && list[2] == list[3] && list[0] != list[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}