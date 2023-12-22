

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		boolean[]ab = check(a,b);
		boolean[]ac = check(a,c);
		boolean[]ba = check(b,a);
		boolean[]bc = check(b,c);
		boolean[]ca = check(c,a);
		boolean[]cb = check(c,b);
		
		int ans = a.length()+b.length()+c.length();
		int m = Math.max(a.length(), Math.max(b.length(), c.length()));
		
		for (int i=0;i<=m;i++) {
			for (int j=0;j<=m;j++) {

				ans=Math.min(ans, solve(a,b,c,ab,bc,ac,i,j));
				ans=Math.min(ans, solve(a,c,b,ac,cb,ab,i,j));
				ans=Math.min(ans, solve(b,a,c,ba,ac,bc,i,j));
				ans=Math.min(ans, solve(b,c,a,bc,ca,ba,i,j));
				ans=Math.min(ans, solve(c,a,b,ca,ab,cb,i,j));
				ans=Math.min(ans, solve(c,b,a,cb,ba,ca,i,j));
			}
		}
		System.out.println(ans);
	}
	
	static boolean[] check (String s, String t){
		boolean[] ans = new boolean[s.length()];
		for (int i=0;i<s.length();i++) {
			boolean tmp = true;
			for (int j=0;j<Math.min(t.length(), s.length()-i);j++) {
				tmp &= (s.charAt(i+j)==t.charAt(j) || s.charAt(i+j)== '?' || t.charAt(j) == '?');
			}
			ans[i]=tmp;
		}
		return ans;
	}
	
	static int solve(String a, String b, String c, boolean[] ab, boolean[] bc, boolean[] ac, int i, int j) {
		if ((i>=a.length() || ab[i]) && (j>=b.length() || bc[j]) && (i+j >=a.length() || ac[i+j])) {
			return Math.max(a.length(), Math.max(i+b.length(), i+j+c.length()));
		} else {
			return Integer.MAX_VALUE;
		}
	}

}


