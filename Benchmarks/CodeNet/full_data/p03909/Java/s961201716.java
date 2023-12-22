import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int h = sc.nextInt(), w = sc.nextInt();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (sc.next().equals("snuke")) {
					String c = (char) (j + 'A') + "";
					String r = String.valueOf(i + 1);
					System.out.println(c + r);
					return;
				}
			}
		}
	}
}