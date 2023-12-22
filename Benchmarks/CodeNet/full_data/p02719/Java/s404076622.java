import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long N = stdIn.nextLong();
		long K = stdIn.nextLong();
		
		System.out.println(Math.min(N % K, K - (N % K)));
	}
}