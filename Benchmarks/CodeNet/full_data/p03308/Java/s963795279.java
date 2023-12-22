import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MaximumDifference solver = new MaximumDifference();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class MaximumDifference {

		private int n;
		private ArrayList<Integer> a;
		private int output;

		private Scanner scanner;

		public MaximumDifference() {
			scanner = new Scanner(System.in);
		}

		public void readInput() {
			a = new ArrayList<Integer>();
			n = scanner.nextInt();
			for(int i=0; i<n; i++) {
				a.add(scanner.nextInt());
			}
		}

		public void solve() {
			Collections.sort(a);
			output = a.get(a.size()-1) - a.get(0);
		}

		public void writeOutput() {
			System.out.println(output);
		}
	}
}
