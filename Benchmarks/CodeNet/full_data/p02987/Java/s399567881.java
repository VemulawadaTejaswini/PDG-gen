import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		char[] list = new char[4];
		int cntkind = 0;
		int checkidx = 0;
		int checkflg = 0;
		list = s.toCharArray();



		for (int i = 1; i < list.length; i++) {
			if (list[0] == list[i]) {
				cntkind++;
				checkidx = i;
			}
		}

		if (cntkind == 1) {
			if (checkidx == 1) {
				if (list[2] == list[3]) {
					checkflg = 1;
				}
			} else if (checkidx == 2) {
				if (list[1] == list[3]) {
					checkflg = 1;
				}
			} else if (checkidx == 3) {
				if (list[1] == list[2]) {
					checkflg = 1;
				}
			}
		}

		if (checkflg == 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}
}