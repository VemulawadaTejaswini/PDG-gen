import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		//素因数分
		long ans = Long.MAX_VALUE/2;
		for(int i = 1;(long)i*i<=n;i++) {
			if(n%i==0) {
				long a = i;
				long b = n/i;
				long tmp = Math.max(a,b);
				ans = Math.min(ans, tmp);
			}
		}
		int res = 0;
		while(ans > 0) {
			ans /= 10;
			res ++;
		}
		System.out.println(res);
	}
}

