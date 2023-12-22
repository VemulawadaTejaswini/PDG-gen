import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		int row = 0;
		int clm = 0;
		outer:
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (sc.next().equals("snuke")) {
					row = i;
					clm = j;
					break outer;
				}
			}
		}

		System.out.println("" + (char)('A' + clm) + (row + 1));

		sc.close();
	}
}

