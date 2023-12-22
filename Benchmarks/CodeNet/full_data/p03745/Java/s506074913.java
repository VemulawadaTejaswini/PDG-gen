import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		SortedArrays solver = new SortedArrays();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}


	static class SortedArrays {

		private int n;
		private int a[];

		private Scanner scanner;
		private int output;

		public SortedArrays() {
			scanner = new Scanner(System.in);
			output = 2;
		}

		public void readInput() {
			int buff;
			n = Integer.parseInt(scanner.next());
			a = new int[n];

			for(int i=0;i<n;i++) {
				a[i] = Integer.parseInt(scanner.next());
			}

		}

		public void solve() {
			int slope=0;
			for(int i=0; i<n-1; i++) {

				if(slope == 0) {
					if(a[i]<a[i+1]) {
						slope = 1;
					} if(a[i]>a[i+1]) {
						slope = -1;
					} else {
						slope = 0;
					}
				} else if(slope == 1) {
					if(a[i]>a[i+1]) {
						slope = 0;
						output++;
					}
				} else if(slope == -1) {
					if(a[i]<a[i+1]) {
						slope = 0;
						output++;
					}
				}





			}

		}
		public void writeOutput() {
			System.out.println(output);
		}
	}

}
