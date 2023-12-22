import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long min = sc.nextLong();
		for(int i = 1; i < num; i ++) {
			min = gcd(min, sc.nextLong());
		}
		System.out.println(min);
	}

	public static long gcd(long a, long b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a % b);
		}
	}
}