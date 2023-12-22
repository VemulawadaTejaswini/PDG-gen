import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextInt();
		long d = sc.nextInt();
		long gcd = gcd(c, d);
		long lcm = c * d / gcd;
		long divC = divider(a, b, c);
		long divD = divider(a, b, d);
		long divLcm = divider(a, b, lcm);
		long ans = b - a + 1 - divC - divD + divLcm;
		System.out.println(ans);
	}
	static long divider(long a, long b, long c){
		long divA = a / c;
		long divB = b / c;
		long modA = a % c;
		long modB = b % c;
		long ret = divB - divA;
		if(modA == 0){
			ret++;
		}
		return ret;
	}
	static long gcd(long c, long d){
		if(c > d){
			return gcd(d, c);
		}
		long mod = d % c;
		if(mod == 0){
			return c;
		}else{
			return gcd(mod, c);
		}
	}
}
