import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();

		long cnum = (B/C) - (A/C);
		long dnum = (B/D) - (A/D);
		long cdnum =(B/lcm(C,D)) - (A/lcm(C,D));

		long ans = (B-A+1) - (cnum + dnum - cdnum);
		System.out.println(ans);
	}

	//整数a,bの最大公約数
	public static long gcd(long a,long b) {
		if(b == 0) return a;
		else return gcd(b,a%b);
	}

	//整数a,bの最小公倍数
	public static long lcm(long a,long b) {
		return a*b/gcd(a,b);
	}
}