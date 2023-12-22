
import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n=sc.nextInt();
		int ans =0;
		for (int i=1;i<=n;i++) {
			int digCount=digCount(i);
			if (digCount%2!=0) {
				ans++;
			}
		}
		System.out.println(ans);
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
	//----------------------------------------
	//置き場
	static int digCount(int n) {
		int res = 0;
		while(n > 0) {
			res ++;
			n /= 10;
			}
		return res;
	}
	//----------------------------------------
}