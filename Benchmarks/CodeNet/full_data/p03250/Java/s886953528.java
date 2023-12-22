import java.util.*;
public class Main {
	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		// 整数の標準入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 数値比較
		if(a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		if(b < c) {
			temp = b;
			b = c;
			c = temp;
		}
		if(a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		// 結果出力
		System.out.println(10 * a + b + c);
		sc.close();
	}
}
