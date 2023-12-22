import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

		String[] ArrayA = new String[a];

		for(int i = 0; i < ArrayA.length; i++) {
			String b = sc.next();
			char[] c = b.toCharArray();
			Arrays.sort(c);
			ArrayA[i] = String.valueOf(c);
		}

		int count = 0;

		for (int i = 0; i < ArrayA.length; i++) {
			for (int j = 0; j < ArrayA.length; j++) {

				if (i != j) {
					if (ArrayA[i].equals(ArrayA[j])) {
						count++;
					}
				}

			}
		}

		System.out.println(countChar(count));

	}

	private static int countChar(int a) {

		if (a == 0) {
			return 0;
		}

		return a / 2;
	}


}
