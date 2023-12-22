import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveA();
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int maxMin = s.length();
		for (char c = 'a'; c <= 'z'; c++) {
			int max = 0;
			int current = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == c) {
					if (max < current) {
						max = current;
					}
					current = 0;
				} else {
					current++;
				}
			}
			if (max < current) {
				max = current;
			}
			if (maxMin > max) {
				maxMin = max;
			}
		}
		System.out.println(maxMin);
	}
}