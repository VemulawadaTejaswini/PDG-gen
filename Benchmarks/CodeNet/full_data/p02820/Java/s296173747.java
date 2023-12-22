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

		int rNum = 0;
		int sNum = 0;
		int pNum = 0;

		char[] own = new char[5];

		for (int i = 0; i < k; i++) {
			char com = t.charAt(i);
			if (com == 'r') {
				pNum++;
				own[i] = 'p';
			} else if (com == 's') {
				rNum++;
				own[i] = 'r';
			} else {
				sNum++;
				own[i] = 's';
			}
		}
		for (int i = k; i < n; i++) {
			char com = t.charAt(i);
			char kBefore = own[i % k];
			if (com == 'r') {
				if (kBefore == 'p') {
					own[i % k] = 'r';
					continue;
				}
				pNum++;
				own[i % k] = 'p';
			} else if (com == 's') {
				if (kBefore == 'r') {
					own[i % k] = 's';
					continue;
				}
				rNum++;
				own[i % k] = 'r';
			} else {
				if (kBefore == 's') {
					own[i % k] = 'p';
					continue;
				}
				sNum++;
				own[i % k] = 's';
			}
		}
		long score = rNum * r + sNum * s + pNum * p;
		System.out.println(score);
	}

}