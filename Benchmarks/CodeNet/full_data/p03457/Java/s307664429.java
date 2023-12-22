import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Traveling solver = new Traveling();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class Traveling {

		private int n;
		private int t[];
		private int x[];
		private int y[];
		private Scanner scanner;
		private String output;

		public Traveling() {
			scanner = new Scanner(System.in);
		}

		public void readInput() {
			n = Integer.parseInt(scanner.next());

			t = new int[n];
			x = new int[n];
			y = new int[n];

			for(int i=0; i<n; i++) {
				t[i] = Integer.parseInt(scanner.next());
				x[i] = Integer.parseInt(scanner.next());
				y[i] = Integer.parseInt(scanner.next());
			}

			return ;
		}

		public void solve() {
			for(int i=0; i<n; i++) {
				if(t[i] < (x[i]+y[i]) || (t[i]%2 != (x[i]+y[i])%2)) {
					output = "No";
					return;
				}
			}
			output = "Yes";
		}
		public void writeOutput() {
			System.out.println(output);
			return ;
		}
	}
}