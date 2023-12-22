import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		KagamiMochi solver = new KagamiMochi();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class KagamiMochi {

		private int n;
		private int[] d;

		private Scanner scanner;
		private int output;

		public KagamiMochi() {
			scanner = new Scanner(System.in);
		}
		public void readInput() {
			n = scanner.nextInt();
			d = new int[n];
			for(int i=0; i<n; i++) {
				d[i] = scanner.nextInt();
			}
		}
		public void solve() {
			Arrays.sort(d);
			int t=0;
			for(int i :d) {
				if(t == i) {
					continue;
				}
				t = i;
				output++;

			}
		}

		public void writeOutput() {
			System.out.println(output);
		}
	}

}
