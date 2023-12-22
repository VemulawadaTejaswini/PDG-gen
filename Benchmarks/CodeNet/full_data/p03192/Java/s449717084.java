import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		long n = sc.nextLong();
		long p = sc.nextLong();
		System.out.println(getAns(n, p));
	}
	long getAns(long n, long p) {
		long ans = 1;
		for(long i = 2; i <= p; i++) {
			if(p % i != 0)continue;
			long num = (long)Math.pow(i, n);
			while(p % num == 0) {
				ans *= i;
				p /= num;
				//System.out.println(p + " " + ans + " " + i);
				if(p == 0)return ans;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
