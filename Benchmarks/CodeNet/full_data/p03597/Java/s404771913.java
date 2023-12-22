import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int aa = a * a;
		int b = sc.nextInt();
		int ans = aa - b;
		// 出力
		System.out.println(ans);
	}
}