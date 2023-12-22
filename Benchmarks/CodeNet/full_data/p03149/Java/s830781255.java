import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = new String[4];
		for (int i = 0; i < 4; i++) {
			num[i] = sc.next();
		}
		Arrays.sort(num);

		if ("1974".equals(num)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}