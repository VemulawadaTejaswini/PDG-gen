import java.util.Scanner;

public class Main {
	static long max =Long.MIN_VALUE;
	static long[] C;
	static int[] P;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String string = sc.next();

		if (N % 2 ==1) {
			System.out.println("No");
		} else {
			if (string.substring(0, N/2).equals(string.substring(N/2, N)) ) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}