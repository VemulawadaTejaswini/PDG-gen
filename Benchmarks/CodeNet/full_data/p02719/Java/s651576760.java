import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int min = N % K;
		
		if (min > K / 2.0) {
			min = Math.abs(min - K);
		}
		
		System.out.println(min);
		
	}
}