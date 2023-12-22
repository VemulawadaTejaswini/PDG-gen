

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int H = Integer.parseInt(scan.next());
		int W = Integer.parseInt(scan.next());
		System.out.println((N - H + 1) * (N - W + 1));
	}
}
