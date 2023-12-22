import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

class NumTh{
	static long mod=1000000007; // 10e9 + 7
	static long GCD(long x, long y) {
		if(Math.max(x, y) % Math.min(x, y) == 0) return Math.min(x, y);
		return GCD(Math.min(x, y), Math.max(x, y) % Math.min(x, y));
	}
	static int GCD(int x, int y) {
		return (int)GCD((long)x, (long)y);
	}
	static long LCM(long x, long y){
		return (x / GCD(x,y)) * y;
	}
	static int LCM(int x, int y) {
		return (int)LCM((long)x, (long)y);
	}
	// $a^x$ mod m
	static long pow(long a, long x, long m){
		if(x == 1) return a % m;
		else if(x % 2 == 0) return pow((a * a) % m, x / 2, m) % m;
		else return (a * pow((a * a) % m, x / 2, m)) % m;
	}
	static boolean ip(long x) {
		if(x == 1) return false;
		for(long i = 2; i * i <= x; i++) if(x % i == 0) return false;
		return true;
	}
	static LinkedList<Long> fact(long n) {
		long tn = n;
		LinkedList<Long> factorize = new LinkedList<Long>();
		for(long i = 2; i <= tn; i++) {
			if(n == 1) break;
			if(ip(i)) {
				while(n % i == 0) {
					factorize.add(i);
					n /= i;
				}
			}
		}
		return factorize;
	}
	static long inv(long a, long mod) {
		if(GCD(a, mod) != 1) return -1; // there is no inverse
		x = 0; y = 0;
		extGCD(a, mod, 0);
		return (x + mod) % mod;
	}
	static long eulerphi(long n) {
		long tmp = n; long res = n;
		for(int i = 2; tmp > 1; i++) {
			if(tmp % i == 0) {
				res = res * (i - 1) / i;
				while(tmp % i == 0) tmp /= i;
			}
		}
		return res;
	}
	/* Calculate the solution of ax + by = gcd(a, b) */
	// Usage: extgcd(a, b, 0)
	static long x = 0, y = 0;
	static long extGCD(long a, long b, int c) {
		long d = a;
		if(b != 0) {
			d = extGCD(b, a % b, (c + 1) % 2);
			if(c == 0) y -= (a / b) * x;
			else x -= (a / b) * y;
		}else {
			x = (c == 0) ? 1 : 0;
			y = (c == 0) ? 0 : 1;
		}
		return d;
	}
}
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long P = sc.nextLong();
		long tmp_P = P;
		TreeMap<Long, Long> fact = new TreeMap<Long, Long>();
		for(long i = 2; i <= tmp_P && P != 1; i++) {
			long cnt = 0;
			while(P % i == 0) {
				cnt++;
				P /= i;
			}
			if(cnt != 0) fact.put(i, cnt);
		}
		long ans = 1;
		for(Entry<Long, Long> ent : fact.entrySet()) {
			if(ent.getValue() >= N) {
				long num = ent.getValue();
				while(num >= N) {
					ans *= ent.getKey();
					num -= N;
				}
			}
		}
		System.out.println(ans);
	}
}
