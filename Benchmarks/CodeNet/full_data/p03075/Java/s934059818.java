import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int k = scan.nextInt();

		int [] list = new int [] {a, b, c, d, e};

		for (int p = 0;p < 5; p++) {
			for (int q = p+1; q < 5; q++) {
				if ( Math.abs(list[q] - list[p]) > k) {
					System.out.println(":(");   //直接通信ができないアンテナの組が存在
					return;
				}
			}
		}
		  System.out.println("Yey!");
	}
}