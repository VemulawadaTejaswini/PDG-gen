import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException{
		KagamiMochi solver = new KagamiMochi();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class KagamiMochi {

		private int n;
		private Set<String> d;
		private Scanner scanner;
		private int output;

		public KagamiMochi() {
			scanner = new Scanner(System.in);
			d = new HashSet<>();
		}
		public void readInput() {
			n = scanner.nextInt();
			for(int i=0; i<n; i++) {
				d.add(scanner.next());
			}
		}
		public void solve() {
			output = d.size();
		}

		public void writeOutput() {
			System.out.println(output);
		}
	}
}
