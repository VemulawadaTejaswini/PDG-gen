import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			String s = sc.next();
			String a[] = new String[4];

			for (int i = 0; i < 4; i++) {
				a[i] = s.substring(i, i + 1);
			}
			
			Arrays.sort(a);
			if (a[0].equals(a[1]) && a[2].equals(a[3]) && !(a[1].equals(a[2]))) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

	}

}