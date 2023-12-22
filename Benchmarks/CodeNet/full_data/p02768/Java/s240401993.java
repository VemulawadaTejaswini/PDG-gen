import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	long n = sca.nextLong();
	int a = sca.nextInt();
	int b = sca.nextInt();
	long ans = 0L;
	long bunbo = 1L;
	long bunsi = 1L;
	long k = n;
	for(long i = 1; i <= n; i++) {
		bunbo = (bunbo * k) % (long)1000000007;
		bunsi = (bunsi * i) % (long)1000000007;
		if(i == a || i == b) {
		} else {
			ans = (ans + bunbo/bunsi) % (long)1000000007;
		}
		k--;
	}
	System.out.println(ans);

	// 後始末
	sca.close();
	}
}