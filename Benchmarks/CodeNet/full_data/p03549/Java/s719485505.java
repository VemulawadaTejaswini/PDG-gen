import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();

		int ans = (1900*m+100*(n-m))*(int)(Math.pow(2, m));

		// 出力
		System.out.println(ans);
	}
}
