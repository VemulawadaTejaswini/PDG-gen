import java.util.Scanner;

/**
 * https://abc052.contest.atcoder.jp/tasks/abc052_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		sc.close();
		
		System.out.println(Math.max(a*b,c*d));

	}

}