import java.util.*;
public class ABC089A {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// // 整数の入力
		// int a = sc.nextInt();
		// // スペース区切りの整数の入力
		// int b = sc.nextInt();
		// int c = sc.nextInt();
		// // 文字列の入力
		// String s = sc.next();
		// // 出力
    // System.out.println((a+b+c) + " " + s);
		String up = sc.next();
		String down = sc.next();
		if (up.charAt(0) == down.charAt(2) && up.charAt(1) == down.charAt(1) && up.charAt(2) == down.charAt(0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}