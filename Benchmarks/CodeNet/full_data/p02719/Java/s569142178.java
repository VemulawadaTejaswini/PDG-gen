import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long mod = N % K;
		System.out.println(mod <= K / 2 ? mod : K - mod);
	}
}