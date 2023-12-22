import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long sum = B-A+1;
		long maxC = B/C;
		long minC = A/C;
		long maxD = B/D;
		long minD = A/D;
		Main main = new Main();
		long gcd = main.gcd(C, D);
		long maxCD = B/((C*D)/gcd);
		long minCD = A/((C*D)/gcd);
		sum =sum -(maxC-minC);
		if (A%C==0) {
			sum--;
		}
		sum =sum -(maxD-minD);
		if (A%D==0) {
			sum--;
		}
		sum =sum +(maxCD-minCD);
		if (A%(((C*D)/gcd))==0) {
			sum++;
		}
		System.out.println(sum);
	}

	public long gcd(long a,long b) {
		if (a<b) {
			return gcd(b,a);
		}
		if (b==0) {
			return a;
		}
		return gcd(a%b,b);
	}
}