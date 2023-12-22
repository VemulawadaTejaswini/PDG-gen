import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();
		int n = sc.nextInt();

		int rowCount = 0;
		int direct = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			for (int j = 0; j < a; j++) {
				sb.append(i + 1);
				rowCount++;
				if (rowCount == w) {
					if (direct == 1) {
						System.out.println(sb.reverse().toString());
						direct = 0;
					} else {
						System.out.println(sb.toString());
						direct = 1;
					}
					rowCount = 0;
					sb.setLength(0);
				}
			}
		}
		sc.close();
	}
}