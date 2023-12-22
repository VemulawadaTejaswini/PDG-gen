import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		String s = sc.next();

		int c = 0;

		for ( int i=0; i<n-2; i++ ) {
			String t = s.substring(i,i+3);
			if (t.equals("ABC")) {
				c++;
			}
		}
		// 出力
		System.out.println(c);
	}
}