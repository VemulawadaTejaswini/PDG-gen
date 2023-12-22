import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		long a = sc.nextLong();		
		long b = sc.nextLong();
		long c = sc.nextLong();
		double x = lessThanSqrt(a)+lessThanSqrt(b);
		double y = lessThanSqrt(c);
			if(x<c)
			System.out.println("Yes");
			else
			System.out.println("No");
	}

			private static long lessThanSqrt (long a) {
				long b = longSqrt(a);
				if (b*b == a) {
					return b-1;
				} else {
					return b;
				}
			}
		
			private static long longSqrt (long a) {
				long b = (long)Math.sqrt(a);
				// 得られた値を2乗して元の値を超える場合は
				// 誤差で1大きくなっているため
				// 誤差修正のため1引いた値を返す
				if(b*b > a) {
					b--;
				}
				return b;
			}
		
		

	}	
