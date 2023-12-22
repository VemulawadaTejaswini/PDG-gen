import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Coins solver = new Coins();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}


	static public class Coins {

		private int a;
		private int b;
		private int c;
		private int x;

		private Scanner scanner;
		private int output;
		public Coins() {
			scanner = new Scanner(System.in);
			output = 0;
		}
		public void readInput() {
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			x = scanner.nextInt();
		}
		public void solve() {
			for(int i=0;i<=a;i++) {
				for(int j=0;j<=b;j++) {
					for(int k=0;k<=c;k++) {
						if((x-500*i-100*j-50*k)==0) {
							output++;
						}
					}
				}
			}
		}
		public void writeOutput() {
			System.out.println(output);
		}
	}
}
