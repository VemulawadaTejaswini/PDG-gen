import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SumOfThreeIntegers solver = new SumOfThreeIntegers();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class SumOfThreeIntegers {
		private int k;
		private int s;
		private Scanner scanner;
		private int output;

		public SumOfThreeIntegers() {
			scanner = new Scanner(System.in);
			output = 0;
		}

		public void readInput() {
			k = scanner.nextInt();
			s = scanner.nextInt();
		}

		public void solve() {

			for(int x=0; x<=k;x++)
				for(int y=0; y<=k; y++)
					for(int z=0; z<=k; z++)
						if(x+y+z == s)
							output++;
		}

		public void writeOutput() {
			System.out.print(output);
		}

	}

}
