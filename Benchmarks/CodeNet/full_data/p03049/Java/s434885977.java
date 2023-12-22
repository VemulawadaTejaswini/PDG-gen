import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int ans = 0;
		for(int i = 0; i < n; i++){
			s[i] = sc.next();
			if(s[i].equals(s[i].replace("AB", "0"))) {
			}else {
				ans += (s[i].length() - s[i].replace("AB", "0").length());
				}
			}
		int ca = 0;
		int cb = 0;
		boolean ja = false;
		boolean jb = false;
		int cc = 0;
		for(int i = 0; i < n; i++) {
			ja = false;
			jb = false;
				if(s[i].substring(0,1).equals("B") ) {
					ca ++;
					ja = true;
				}
				if(s[i].substring(s[i].length() - 1,s[i].length()).equals("A")) {
					cb ++;
					jb = true;
				}
				if(ja && jb) {
					cc ++;
				}
			}
		ans += Math.min(ca, cb);
		if(cc == cb) {
			ans --;
		}
		System.out.println(ans);
		sc.close();
	}
	
}
