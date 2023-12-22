
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ps;
		char c;
		String o = sc.next();
		String e = sc.next();
		int idx;
		int l = o.length() + e.length();
		for(int i = 0; i <= l; i++) {
			if(i % 2 != 1){
				idx = i/2;
				c = o.charAt(idx);
			}else {
				idx = (i-1)/2;
				c = e.charAt(idx);
			}
			System.out.print(c);
		}

	}
}
