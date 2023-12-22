import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		String t = sc.next();

		String own = "";

		int rNum = 0;
		int sNum = 0;
		int pNum = 0;

		for (int i = 0; i < k; i++) {
			char com = t.charAt(i);
			if (com == 'r') {
				pNum++;
				own = own + "p";
			} else if (com == 's') {
				rNum++;
				own = own + "r";
			} else {
				sNum++;
				own = own + "s";
			}
		}
		for (int i = k; i < n; i++) {
			char com = t.charAt(i);
			char kBefore = own.charAt(i - k);

			if (com == 'r') {
				if (kBefore == 'p') {
					own = own + "r";
					continue;
				}
				pNum++;
				own = own + "p";
			} else if (com == 's') {
				if (kBefore == 'r') {
					own = own + "s";
					continue;
				}
				rNum++;
				own = own + "r";
			} else {
				if (kBefore == 's') {
					own = own + "p";
					continue;
				}
				sNum++;
				own = own + "s";
			}
		}

		long score = rNum * r + sNum * s + pNum * p;
		System.out.println(score);
	}

}