import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		solve(s);
		s.close();
	}

	public static void solve(Scanner s) {
		int H = s.nextInt();
		int W = s.nextInt();
		int count = 0;

		for (int i = 0; i < H; i++) {
			String S = s.next();
			String[] SArray = S.split("");

			for (int j = 0; j < SArray.length; j++) {
				if (SArray[j].equals("#")) {
					count++;
				}
			}
		}

		if (count == H + W - 1) {
			System.out.println("Possible");
		} else {
			System.out.println("Impossible");
		}
	}
}