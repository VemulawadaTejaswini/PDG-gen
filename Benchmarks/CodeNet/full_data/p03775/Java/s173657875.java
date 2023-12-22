import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		long n=sc.nextLong();
		int rootN = (int) (Math.sqrt(n));
		long ans=digCount(n);
		for (int i=1;i<=rootN;i++) {
			if (n%i==0) {
				long a=i;
				long b=n/i;
				long bigger =Math.max(a,b);
				long biggerDigCount= digCount(bigger);
				ans =Math.min(ans, biggerDigCount);
			}
		}
		System.out.println(ans);
		
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
	//----------------------------------------
	//置き場
//桁数
static long digCount(long n) {
	int res = 0;
	while(n > 0) {
		res ++;
		n /= 10;
		}
	return res;
}
	//----------------------------------------
}