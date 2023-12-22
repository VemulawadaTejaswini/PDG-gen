import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BitterAlchemy solver = new BitterAlchemy();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}


	static class BitterAlchemy {

		private Scanner scanner;
		private int n;
		private int x;
		private int[] m;
		private int output;

		public BitterAlchemy(){
			scanner = new Scanner(System.in);
		}

		public void readInput() {
			n = scanner.nextInt();
			x = scanner.nextInt();
			m = new int[n];
			for(int i=0; i<n;i++) {
				m[i] = scanner.nextInt();
			}
		}
		public void solve() {
			int min = 1000;
			output=0;
			for(int i=0;i<n;i++) {
				x -= m[i];
				output++;
				if(m[i] < min) {
					min = m[i];
				}
			}

			while(min<=x) {
				x-=min;
				output++;
			}
		}
		public void writeOutput() {
			System.out.println(output);
		}

	}


}
