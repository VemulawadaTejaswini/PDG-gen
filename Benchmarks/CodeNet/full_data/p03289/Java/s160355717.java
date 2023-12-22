import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {
			String a = sc.next();
			String[] b = a.split("");

			String c = a.toUpperCase();
			String[] d = c.split("");

			String flag = "WA";

			int countC = 0;
			for (String st : b) {
				if (st.equalsIgnoreCase("C")) {
					countC++;
				}
			}

			int countLower = 0;
			for (int i = 0; i < d.length; i++) {
				if (b[i].equals(d[i])) {
					countLower++;
				}
			}

			if (b[0].equals("A") || b[0].equals("a")) {
				if (b[2].equals("C") || b[-2].equals("C")) {
					if (countC == 1) {
						if (countLower == 2) {
							flag = "AC";
						}
					}
				}
			}
			System.out.println(flag);
		}

	}

}
