import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	public static long sum;
	public static String s;
	public static void dfs( List<String> strs, String str, int n ) {
		str += s.charAt(n);
		if( n == s.length()-1 ) {
			strs.add(str);
			for(String tmp: strs)
				sum += Long.valueOf(tmp);
			strs.clear();
		}
		else {
			List<String> strs_tmp = new ArrayList<>(strs);
			String str_tmp = str;
			strs.add(str);
			str = "";
			dfs(strs, str, n+1);
			strs = strs_tmp;
			str = str_tmp;
			dfs(strs, str, n+1);
		}
	}
	
	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		
		s = sc.next();
		List<String> strs = new ArrayList<>();
		dfs(strs, "", 0 );
		System.out.println( sum );
		
		sc.close();
	}
}