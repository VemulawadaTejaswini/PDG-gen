import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		int C = sc.nextInt();
		int D = sc.nextInt();
		long bdivic = B / C;
		long bdivid = B / D;
		long adivic = (A - 1) / C;
		long adivid = (A - 1) / D;
		long sum = B - (A - 1) - (bdivic - adivic) - (bdivid - adivid);
		sum += B / lcm(C, D) - (A - 1)  / lcm(C, D);
		System.out.println(sum);


	}

	//最小公約数を求める
	public static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}

	//最大公約数を求める　ユークリッドの互除法
	public static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}


}
