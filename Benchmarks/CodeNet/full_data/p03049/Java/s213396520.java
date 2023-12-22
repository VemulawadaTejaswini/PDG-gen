
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int ans = 0;
		for(int i = 0; i < n; i++){
			s[i] = sc.next();
			if(s[i].equals(s[i].replace("AB", " "))) {
			}else {
				ans ++;
			}
		}
		int ca = 0;
		int cb = 0;
		for(int i = 0; i < n; i++) {
				if(s[i].substring(0,1).equals("B") ) {
					ca ++;
				}
				if(s[i].substring(s[i].length() - 1,s[i].length()).equals("A")) {
					cb ++;
				}
			}
		if(ca == cb) {
			ans += ca;
		}else {
			ans += Math.min(ca, cb);
		}
		System.out.println(ans);
		sc.close();
	}
}
