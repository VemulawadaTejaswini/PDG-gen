import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Solution();

	}

}

class Solution {

	private int n, k;

	public Solution() {
		this.setScanner();
		this.run();
	}

	private void setScanner() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		sc.close();
	}

	private void run() {
		int max = n / k;
		int min = n % k;
		int out = (min != 0) ? max - min : 0;
		System.out.println(out);
	}

}