import java.util.Scanner;

public class Main {
	static long f(long x) {
		long ret = 0;
		for(int base = 0 ; base <= 63 ; ++base) {
			long up = 1L << base;
			if(x < up) {
				break;
			}
			long n1 = (x / (up * 2)) * (up);
			if(x % (up * 2) >= up) {
				n1 += (x % (up *2)) - (up - 1);
			}
			if(n1 % 2 == 1) {
				ret |= up;
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		if(A == 0) {
			System.out.println(f(B));
		}else {
			System.out.println(f(B) ^ f(A - 1));			
		}
	}
}
