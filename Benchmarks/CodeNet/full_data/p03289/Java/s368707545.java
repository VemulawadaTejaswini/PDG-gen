import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			int check = 0;
			String ans = "WA";
			sc.close();
			for(int i = 2;i<s.length();i++) {
				if(s.charAt(i)=='C') 
					check++;
			}
			if(s.charAt(0)=='A') {
				if(check<2) {
				if(s.charAt(1)!='C'&&s.charAt(s.length()-1)!='C'&&s.contains("C")) {
					ans = "AC";
				}
			}
		}
	
				System.out.println(ans);
		}
	public static void main(String[] args) {
		solve();

	}

}
