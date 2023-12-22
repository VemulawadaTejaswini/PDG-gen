import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			int res = 0;
			for(int i = 0;i<s.length()-1;i++) {
				if(s.charAt(i) =='A') {
					res++;
				}
				if(s.charAt(i) =='C') {
					res++;
				}
				if(s.charAt(i) =='G') {
					res++;
				}
				if(s.charAt(i) =='T') {
					res++;
				}
				if(s.charAt(i)!='A'&&s.charAt(i)!='C'&&s.charAt(i)!='G'&&s.charAt(i)!='T') {
					continue;
				}
			}
			System.out.println(res);
			sc.close();
			
		}
	public static void main(String[] args) {
		solve();

	}

}
