import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Together solver = new Together();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class Together {

		private int n;
		private int a[];
		private Scanner scanner;
		private int output;
		public Together() {
			scanner = new Scanner(System.in);
		}

		public void readInput() {
			n = Integer.parseInt(scanner.next());
			a = new int[100002];
			Arrays.fill(a, 0);
			int b;
			for(int i=0; i<n; i++) {
				b = Integer.parseInt(scanner.next());
				a[b]++;
			}
			return;
		}

		public void solve() {
			output = 0;
			int sum;
			for(int i=0; i<100000;i++) {
				sum = a[i]+a[i+1]+a[i+2];
				output = Math.max(sum, output);
			}
		}

		public void writeOutput() {
			System.out.println(output);
		}

	}

}