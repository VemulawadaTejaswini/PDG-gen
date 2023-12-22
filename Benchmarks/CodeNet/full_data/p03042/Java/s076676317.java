import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder(scan.next());
		int p = Integer.parseInt(str.substring(0, 2));
		int s = Integer.parseInt(str.substring(2, 4));

		if (p == 0 && s < 13) {
			if (s == 0)
				System.out.println("NA");
			else
				System.out.println("YYMM");
			return;
		}
		if (s == 0 && p < 13) {
			if (p == 0)
				System.out.println("NA");
			else
				System.out.println("MMYY");
			return;
		}
		if (s == 0 || p == 0) {
			System.out.println("NA");
			return;
		}

		if (p > 12) {
			if (s > 12)
				System.out.println("NA");
			else
				System.out.println("YYMM");
		} else {
			if (s > 12)
				System.out.println("MMYY");
			else
				System.out.println("AMBIGUOUS");
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

}
