import java.util.*;	
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String o = sc.next();
		String e = sc.next();
		int a = 0,mozilong = o.length() + e.length();
		char ans[] = new char[mozilong];
		for(int i = 0;i < e.length() ;i++) {
			ans[a] = o.charAt(i);
			a++;
			ans[a] = e.charAt(i);
			a++;
		}
		if( o.length() > e.length())ans[a] = o.charAt(o.length()-1);
		System.out.println(ans);
	}

}