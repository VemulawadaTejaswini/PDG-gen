import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long ans = (long) ((1900 * M + ((N-M) * 100)) * Math.pow(2, M));
		System.out.println(ans);
	}
}