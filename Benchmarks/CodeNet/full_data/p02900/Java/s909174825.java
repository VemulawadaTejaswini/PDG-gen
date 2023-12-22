import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();

		long gcd=gcd(A,B);
		long max=(long) (Math.sqrt(gcd)) + 1;
//		System.out.println(max);

		int ans=1;

		if(gcd%2==0) {ans++;}
		while (gcd%2==0) {
			gcd = gcd/2;
		}

		for(long i=3;i<=max;i+=2) {
			if(gcd%i==0) {ans++;}
			while (gcd%i==0) {gcd = gcd/i;}
		}
		if(gcd>max) {ans++;}

		System.out.println(ans);
	}

	public static long gcd(long m,long n) {
		long t;
		while (m % n != 0) {
			t = n;
			n = m%n;
			m = t;
		}
		return n;
	}

}
