import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String o = sc.next();
		String e = sc.next();
		
		// 計算
		String result = "";
		int n = o.length() + e.length();
		char[] c = new char[n];
		for(int i = 0; i < o.length(); i++){
		    c[i*2] = o.charAt(i);
		}
		for(int i = 0; i < e.length(); i++){
		    c[i*2+1] = e.charAt(i);
		}
		result = new String(c);
		
		// 出力
		System.out.println(result);
	}
}

