import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SomethingOnIt solver = new SomethingOnIt();
		solver.readInput();
		solver.solve();
		solver.writeOutput();
	}

	static class SomethingOnIt {

		private Scanner scanner;
		private String s;
		private String answer;

		public SomethingOnIt() {
			scanner = new Scanner(System.in);
		}

		public void readInput() {
			s = scanner.next();
		}

		public void solve() {
			int price = 700;
			for(String t : s.split("")) {
				if(t.equals("o")) {
					price += 100;
				}
			}
			answer = String.valueOf(price);
		}

		public void writeOutput() {
			System.out.println(answer);
		}

	}


}
