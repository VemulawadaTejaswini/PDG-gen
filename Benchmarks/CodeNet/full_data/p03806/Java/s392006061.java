import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		Scanner cin = new Scanner(System.in);
		ArrayList<String> inLines = new ArrayList<String>();
		for (; cin.hasNext();) {
			inLines.add(cin.nextLine());
		}
		Solver solver = new Solver();
		solver.solve(inLines);
	}
}

class Solver {

	class Chemical {
		int a;
		int b;
		int c;
		Chemical next;

		Chemical(String str) {
			String[] strArr = str.split(" ");
			a = Integer.parseInt(strArr[0]);
			b = Integer.parseInt(strArr[1]);
			c = Integer.parseInt(strArr[2]);
			next = null;
		}

		void addNext(Chemical ch) {
			if (next == null)
				next = ch;
			else if (ch.c < next.c) {
				ch.next = next;
				next = ch;
			} else
				next.addNext(ch);
		}

		void checkSum(int aSum, int bSum, int cSum) {
			if (MinCost < (cSum + c))
				return;
			int aCurr = aSum + a;
			int bCurr = bSum + b;
			if (aCurr * Mb == bCurr * Ma) {
				MinCost = cSum + c;
				Found = true;
			} else if (next != null) {
				next.checkSum(aSum + a, bSum + b, cSum + c);
			}

			if (next != null) {
				next.checkSum(aSum, bSum, cSum);
			}

		}
	}

	int N;
	int Ma;
	int Mb;
	int MinCost;
	boolean Found;

	public void solve(ArrayList<String> inLines) {
		String[] strArr = inLines.get(0).split(" ");
		N = Integer.parseInt(strArr[0]);
		Ma = Integer.parseInt(strArr[1]);
		Mb = Integer.parseInt(strArr[2]);

		Chemical chemical = null;
		for (int i = 0; i < N; i++) {
			Chemical ch = new Chemical(inLines.get(i + 1));
			// System.out.println(" " + ch.a + " " + ch.b + " " + ch.c);
			if (chemical == null)
				chemical = ch;
			else if (chemical.c < ch.c)
				chemical.addNext(ch);
			else {
				ch.addNext(chemical);
				chemical = ch;
			}
		}

		// System.out.println();
		// for (Chemical ch = chemical; ch != null; ch = ch.next) {
		// System.out.println(" " + ch.a + " " + ch.b + " " + ch.c);
		// }

		MinCost = Integer.MAX_VALUE;
		Found = false;
		chemical.checkSum(0, 0, 0);
		if (Found)
			System.out.println(MinCost);
		else
			System.out.println(-1);

	}
}
