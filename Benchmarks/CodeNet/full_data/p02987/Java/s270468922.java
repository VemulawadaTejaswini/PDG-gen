import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] sArray = new String[4];

		sArray = S.split("");
		Arrays.sort(sArray);

		if (sArray[0].equals(sArray[1]) && sArray[2].equals(sArray[3]) && !sArray[1].equals(sArray[2])) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
