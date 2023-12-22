import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double num = 0.;
		for (int i = 0; i < n; i++) {
			num += Math.pow(sc.nextDouble(), -1);
		}
		System.out.println(Math.pow(num, -1));
	}
}
