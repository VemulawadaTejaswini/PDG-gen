import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		long ans = 0;
		for(int a=1; a<=k; a++) {
			for(int b=1; b<=k; b++) {
				for(int c=1; c<=k; c++) {
					ans += gcd(a,b,c);
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}

	private long gcd(long a, long b, long c) {
		return gcd(gcd(a,b), c);
	}

	private long gcd(long a, long b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
}
