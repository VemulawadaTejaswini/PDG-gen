import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		String s = "";
		// 出力
		if (a < b) {
			for ( int i=0; i<b; i++ ) {
				s = s.concat(String.valueOf(a));
			}
		} else {
			for ( int i=0; i<a; i++ ) {
				s = s.concat(String.valueOf(b));
			}
		}
		System.out.println(s);
	}
}