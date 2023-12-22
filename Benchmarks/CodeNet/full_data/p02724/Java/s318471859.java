import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int dist500 = N/500;
		int rest500 = N%500;
		int dist5 = rest500/5;

		System.out.println(dist500*1000 + dist5*5);
	}
}
