import java.util.Scanner;
public class Main {
		
		static void solve() {
			Scanner sc = new Scanner(System.in);
			String s = new String();
			s = sc.next();
			int check = 0;
			int n = s.length();
			String res = "Yes";
			for(int i = 0; i < n;i++) {
			if(i%2==1&&s.charAt(i)=='R') {
				check++;
			}
			if(i%2==0&&s.charAt(i)=='L') {
				check++;
			}
			}
			if(check>0) res = "No";
			System.out.println(res);
			sc.close();
			
		}
	public static void main(String[] args) {
		solve();

	}

}
