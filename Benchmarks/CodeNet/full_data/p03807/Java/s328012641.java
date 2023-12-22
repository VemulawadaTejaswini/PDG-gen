import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Addition solver = new Addition();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class Addition {
		private int n;
		private int a[];

		private Scanner scanner;
		private String output;

		public Addition() {
			scanner = new Scanner(System.in);
		}

		public void readInput() {
			n = Integer.parseInt(scanner.next());
			a = new int[n];
			for(int i=0; i<n; i++) {
				a[i] = Integer.parseInt(scanner.next());
			}
			return;
		}

		public void solve() {
			int count=0;
			for(int i=0; i<n; i++) {
				if(a[i]%2 == 1) {
					count++;
				}
			}
			if(count%2==0) {
				output = "YES";
			} else {
				output ="NO";
			}
			return;

		}

		public void writeOutput() {
			System.out.println(output);
		}

	}
}