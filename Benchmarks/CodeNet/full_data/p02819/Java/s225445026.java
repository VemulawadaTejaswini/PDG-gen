import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		int X = sc.nextInt();
		
	lp:
		while (true) {
			int n = (int)Math.sqrt(X);
			for (int i = 2; i <= n; i++) {
				if (X%i == 0) {
					X++;
					continue lp;
				}
			}
			System.out.println(X);
			break;
		}
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}