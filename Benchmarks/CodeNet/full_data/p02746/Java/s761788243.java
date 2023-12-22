
import java.util.Scanner;


public class Main {

	static final int LENGTH = 30;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		
		
		long[] base = new long[LENGTH];
		base[0]=1;
		for (int i=1;i<LENGTH;i++) {
			base[i]=base[i-1]*3;
		}
		for (int i=0;i<q;i++) {
			long a = sc.nextLong()-1;
			long b = sc.nextLong()-1;
			long c = sc.nextLong()-1;
			long d = sc.nextLong()-1;
			System.out.println(solve(a,b,c,d, base));
		}
	}
	
	static long solve(long a, long b, long c, long d, long[] base) {
		for (int i=LENGTH-1; i>=0; i--) {
			long aa = (a/base[i]);
			long bb = (b/base[i]);
			long cc = (c/base[i]);
			long dd = (d/base[i]);
			if (aa!=cc && bb!=dd) {
				return Math.abs(a-c)+Math.abs(b-d);
			}
			if (aa==cc && bb!=dd) {
				return sub(a, c, base)+Math.abs(b-d);
			}
			if (aa!=cc && bb==dd) {
				return Math.abs(a-c)+sub(b, d, base);
			}
		}
		return 0;
	}
	
	
	
	static long sub(long a, long b, long[] base) {
		for (int i=LENGTH-1; i>=0; i--) {
			if ((a/base[i])%3 != (b/base[i])%3) {
				return Math.abs(a-b);
			} else if ((a/base[i])%3 == (b/base[i])%3 && (a/base[i])%3 ==1) {
				if (i==0) {
					return 2;
				}
				return Math.min(a%base[i-1]+b%base[i-1]+2, base[i]*2-a%base[i-1]-b%base[i-1]);
			}
		}
		return 0;
	}
}
