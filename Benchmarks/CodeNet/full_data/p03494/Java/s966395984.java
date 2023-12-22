import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ShiftOnly solver = new ShiftOnly();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class ShiftOnly {

		private int n;
		private ArrayList<Integer> aInput;

		private Scanner scanner;

		private String answer;

		public ShiftOnly() {
			this.scanner = new Scanner(System.in);
		}

		public void readInput() {
			aInput = new ArrayList<Integer>();
			n = scanner.nextInt();
			for(int i=0; i<n; i++) {
				Integer b =scanner.nextInt();
				aInput.add(b);
			}
		}

		public void solve() {
			int o = 0;
			while(true) {
				for(Integer a :aInput) {
					aInput.set(aInput.indexOf(a), a>>1);
					if(Integer.lowestOneBit(a) == 1) {
						answer = String.valueOf(o);
						return;
					}
				}
				o++;
			}
		}

		public void writeOutput() {
			System.out.println(answer);
		}

	}


}
