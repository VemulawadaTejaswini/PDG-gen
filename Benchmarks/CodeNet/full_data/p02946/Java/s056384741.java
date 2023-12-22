import java.util.*;

public class Main {
	Scanner sc;
	int K, X;
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		K = sc.nextInt();
		X = sc.nextInt();
		
		int min = X-(K-1);
		int max = X+(K-1);
		if (min < -1000000) min = -1000000;
		if (max > 1000000) max = 1000000;
		
		for (int i = min; i <= max; i++) {
			System.out.print(i);
			if (i < max) System.out.print(" ");
		}
		System.out.println();
		System.out.flush();
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.calc();
	}

}