import java.util.*;
import java.math.*;
public class Main {
	static int x;
	static int ans;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long ans = 0;
		for(int i = 1; i <= n; i++) {
			String str = i + "";
			if(str.length() == 1) {
				ans += 1L;
			}else if(str.length() == 2){
				if((str.charAt(1) != '0')) {
					int a = Integer.parseInt(str.substring(0, 1));
					int b = Integer.parseInt(str.substring(1, 2));
					if(a > b) ans += 2;
					else if(a == b) ans += 3;
				}
			}else {
				if((str.charAt(str.length() - 1) != '0')) {
					int a = Integer.parseInt(str.substring(0, 1));
					int b = Integer.parseInt(str.substring(str.length() - 1, str.length()));
					if(a == b) ans += 2;
					ans += 2;
					int size = str.length() - 2;
					int cnt = 1;
					long mult = 1;
					String createnew = "";
					while (cnt <= size) {
						if((a < b) && (cnt == size)) break;
						mult *= 10;
						ans += mult + mult;
						cnt += 1;
						createnew += "9";
					}
					if(a == b) {
						int newnum = Integer.parseInt(createnew);
						int midnum = Integer.parseInt(str.substring(1, str.length() - 1));
						if(newnum == midnum) {
							ans -= 1;
						}else if(newnum > midnum) {
							ans -= (newnum - midnum) * 2;
							ans -= 1;
						}
					}
					
				}
			}
		}
		System.out.println(ans);
	}
} 