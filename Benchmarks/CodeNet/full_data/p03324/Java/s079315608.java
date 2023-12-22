import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int n = scan.nextInt();
		double a = Math.pow(100, d);
		int answer = (int)a * n;
		System.out.println(answer);
	}
}
