import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;

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
	static long pow(long a, long x){
		if(x == 1) return a;
		else if(x % 2 == 0) return pow((a * a), x / 2);
		return (a * pow((a * a), x / 2));
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
}
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long P = sc.nextLong();
		HashMap<Long, Long> fact = new HashMap<Long, Long>();
		if(NumTh.ip(P)) {
			fact.put(P, (long) 1);
		}else {
			for(long i = 2; P != 1; i++) {
				if(P % i == 0) {
					long cnt = 0;
					while(P % i == 0) {
						cnt++;
						P /= i;
					}
					fact.put(i, cnt);
				}
			}
		}
		long ans = 1;
		for(Entry<Long, Long> ent : fact.entrySet()) {
			if(ent.getValue() >= N) {
				long num = ent.getValue();
				ans *= NumTh.pow(ent.getKey(), num / N);
			}
		}
		System.out.println(ans);
	}
}
