import java.util.Scanner;

/**
 * https://abc063.contest.atcoder.jp/tasks/abc063_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		String ans = a+b < 10 ? String.valueOf(a+b) : "error";
		System.out.println(ans);
	}
}
