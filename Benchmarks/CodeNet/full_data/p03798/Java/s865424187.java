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

	public void solve(ArrayList<String> inLines) {
		int N = Integer.parseInt(inLines.get(0));
		String str = inLines.get(1);

		char[] animals = new char[N];
		animals[0] = 'S';
		animals[1] = 'S';
		for (int i = 1; i < N - 1; i++) {
			if (animals[i] == 'S') {
				if (str.charAt(i) == 'o') {
					animals[i + 1] = animals[i - 1];
				} else {
					animals[i + 1] = animals[i - 1] == 'S' ? 'W' : 'S';
				}
			}
			if (animals[i] == 'W') {
				if (str.charAt(i) == 'x') {
					animals[i + 1] = animals[i - 1];
				} else {
					animals[i + 1] = animals[i - 1] == 'S' ? 'W' : 'S';
				}
			}
		}

		if (animals[N - 1] == 'S') {
			if (str.charAt(N - 1) == 'o' && animals[N - 2] != animals[0]) {
				System.out.println(-1);
				return;
			}
			if (str.charAt(N - 1) == 'x' && animals[N - 2] == animals[0]) {
				System.out.println(-1);
				return;
			}
		}
		if (animals[N - 1] == 'W') {
			if (str.charAt(N - 1) == 'o' && animals[N - 2] == animals[0]) {
				System.out.println(-1);
				return;
			}
			if (str.charAt(N - 1) == 'x' && animals[N - 2] != animals[0]) {
				System.out.println(-1);
				return;
			}
		}

		System.out.println(animals);
	}
}
