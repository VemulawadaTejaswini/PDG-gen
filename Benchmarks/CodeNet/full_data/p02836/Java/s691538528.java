import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int cnt = 0;
		int l = s.length()/2;
		for ( int i = 0; i < l ; i++ ) {
			int r = s.length()- 1 - i ;
			if ( s.charAt(i) != s.charAt(r) ) {
				cnt++ ;
			}
		}
		System.out.println(cnt);
	}
}