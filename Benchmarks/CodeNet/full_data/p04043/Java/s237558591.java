import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArray = new String[3];

		strArray = str.split(" ");
		Arrays.sort(strArray);

		if ("557".equals(String.join("", strArray))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
