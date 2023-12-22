import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long num = gcd (A,B);
		boolean flag = true;

		long count = 0;

		for (int index=2; index<=num; index++) {
			if (num%index==0) {
				flag = true;
				count++;
			}
			while (flag) {
				if (num%index!=0) {
					flag = false;
				} else {
					num/=index;
				}
			}
		}

		System.out.println(count+1);

	}


	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}