import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//input
		String[] S = {sc.next(), sc.next(), sc.next()};

		String iniA = S[0];

		int i = 0;
		if (iniA.startsWith("a")) {
			i = 0;
		}
		else if (iniA.startsWith("b")) {
			i = 1;
		}
		else {
			i = 2;
		}

		S[0] = S[0].substring(1, S[0].length());

		int flag = 0;

		loop: while (flag == 0) {
			if (S[i].length() != 1) {
			S[i] = S[i].substring(1, S[i].length());
				if (S[i].startsWith("a")) {
					i = 0;
				}
				else if (S[i].startsWith("b")) {
					i = 1;
				}
				else {
					i = 2;
				}
			}
			else {
				flag = i;
				break loop;
			}
		}

		if (i == 0) {
			System.out.println("A");
		}
		else if (i == 1) {
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}

	}
}

