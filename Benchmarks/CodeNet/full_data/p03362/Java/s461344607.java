import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no4();
	}

	static void no4() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int i = 3;

			StringBuffer sb = new StringBuffer("2");
			int count = 1;

			while (count < n) {
				int yakusu = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0)
						yakusu++;
				}
				if (yakusu == 2) {
					sb.append(" ");
					sb.append(i);
					count++;
				}
				i++;
				i++;
			}
			System.out.print(sb.toString());
		}
	}

}
