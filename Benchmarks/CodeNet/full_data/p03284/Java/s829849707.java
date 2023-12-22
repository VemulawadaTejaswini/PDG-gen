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
		int out = (n % k != 0) ? 1 : 0;
		System.out.println(out);
	}

}