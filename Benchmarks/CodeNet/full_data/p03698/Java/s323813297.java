
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			char tmp = ' ';
			for (char c : arr) {
				if (tmp == c) {
					System.out.println("no");
					return;
				}
				tmp = c;
			}
			System.out.println("yes");
		}
	}
}