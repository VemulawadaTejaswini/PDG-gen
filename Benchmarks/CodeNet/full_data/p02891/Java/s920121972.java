import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		int c = 0;
		char f = 'x';
		for (int i = 0; i < s.length() - 1 ; i++ ) {
			if ( s.charAt(i) == s.charAt(i+1) ) {
				if ( f == 'x' ) {
					c++;
					f = 'o';
				} else {
					f = 'x';
				}
			} else {
				f = 'x';
			}
		}
		long d = (long)c * (long)k ;
		// 出力
		System.out.println(d);
	}
}