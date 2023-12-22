import java.math.BigInteger;
import java.util.*;

public class Main {
	double EPS = 10.e-08;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long a = sc.nextLong()-1;
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			
			long lcm = lcm(c, d);
			
			long a1 = a / c;
			long a2 = a / d;
			long a3 = a / lcm;
			
			long b1 = b / c;
			long b2 = b / d;
			long b3 = b / lcm;
			long res1 = a - a1 - a2 + a3;
			long res2 = b - b1 - b2 + b3;
//			debug(res1, res2, a1, a2, a3, lcm);
//			debug(b, b1, b2, b3, res2, lcm);
			System.out.println(res2 - res1);
		}
	}
	
	private long gcd(long a, long b){
		if(b == 0)  return a;
		else        return gcd(b, a%b);
	}
	
	private long lcm(long a, long b){
		return a / gcd(a, b) * b;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
