import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int subAnswer[] = new int[3];
		String answer = "";

		for (int i = 0; i < 3; i++) {
			subAnswer[i] = Integer.valueOf(N.substring(i, i+1) + N.substring(i, i+1) + N.substring(i, i+1));
			if (subAnswer[i] < Integer.valueOf(N)) subAnswer[i] = 2000;
		}

		Arrays.sort(subAnswer);

		if (Integer.valueOf(N) == 999) {
			System.out.println(1111);
		} else {
			System.out.println(subAnswer[0]);
		}

	}
}
