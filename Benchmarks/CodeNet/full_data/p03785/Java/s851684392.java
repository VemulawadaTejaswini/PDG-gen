import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		AirportBus solver = new AirportBus();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}


	static class AirportBus {

		private int n;
		private int c;
		private int k;
		private int t[];

		private Scanner scanner;
		private int output;

		public AirportBus() {
			scanner = new Scanner(System.in);
			output=1;
		}

		public void readInput() {
			n = Integer.parseInt(scanner.next());
			c = Integer.parseInt(scanner.next());
			k = Integer.parseInt(scanner.next());

			t = new int[n];

			for(int i=0; i<n; i++) {
				t[i] = Integer.parseInt(scanner.next());
			}

			Arrays.sort(t);

		}

		public void solve() {
			int temp = 0;
			for(int i=0; i<n; i++) {
				if(t[i]-t[temp]>k || (i-temp)>=c) {
					output++;
					temp = i;
				}
			}
		}

		public void writeOutput() {
			System.out.println(output);
		}
	}

}
