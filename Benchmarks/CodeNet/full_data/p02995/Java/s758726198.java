import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();

		long cnum = divisornum(0,(double)B,(double)C) - divisornum(0,(double)A,(double)C);
		long dnum = divisornum(0,(double)B,(double)D) - divisornum(0,(double)A,(double)D);
		long cdnum = divisornum(0,(double)B,(double)lcm(C,D)) - divisornum(0,(double)A,(double)lcm(C,D));

		long ans = (B-A+1) - (cnum + dnum - cdnum);
		System.out.println(ans);
	}

	//m以上n以下でのaの倍数の個数
	public static long divisornum(double m,double n,double a) {
		long mindiv = (long) Math.ceil(m/a);
		long maxdiv = (long) Math.floor(n/a);
		return (maxdiv - mindiv) + 1;
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