import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp1 = sc.nextInt();
		int tmp2 = sc.nextInt();
		int a = Math.max(tmp1, tmp2);
		int b = Math.min(tmp1, tmp2);

		String ans = "Yay!";

		// 大きい方は最大10個までしか取られず、
		// 小さい方は最大8個までしか取られない。
		if ((a > 10) || (b > 8)) { 
			ans = ":(" ;
		}
		System.out.println(ans);
	}
}
