import java.util.Scanner;

public class Main {
	/*問題文
	非負の整数 a, b (a≤b) と、正の整数 x が与えられます。
	 a 以上 b 以下の整数のうち、x で割り切れるものの個数を求めてください。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		System.out.println(( b + x ) / x - ( a + x - 1 ) / x );
	}

}