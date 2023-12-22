import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int ans = 0;
		char[] alp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i = 1; i < n; i++) {
			String x = s.substring(0, i);
			String y = s.substring(i, n);
			int cout = 0;
			for(int j = 0; j < 26; j ++) {
				if(y.contains(String.valueOf(alp[j])) && x.contains(String.valueOf(alp[j]))) cout++;
			}
			ans = Math.max(ans, cout);
		}
		System.out.println(ans);
	}
}
