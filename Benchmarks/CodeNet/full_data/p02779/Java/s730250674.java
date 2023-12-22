import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		StringBuilder sb = new StringBuilder();

		for (long i = 0; i < n; i++) {
			String input = scan.next();

			if (i >= 1)  {
				String[] str = sb.toString().split(",");
				for (int j = 0; j < str.length; i++) {
					if (str[j].equals(input)) {
						System.out.println("NO");
						scan.close();
						return;
					}
				}
			}
			sb.append(input + ",");
		}

		scan.close();
		System.out.println("YES");
	}
}