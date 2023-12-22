import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long ans = Long.parseLong(sc.next());

		for (int i=0; i<n-1;i++){
			ans = lcm(ans, Long.parseLong(sc.next()));
		}
		System.out.println(ans);
    }

	public static long gcd(long x, long y){
		if (y == 0){
			return x;
		}else {
			return gcd(y, x%y);
		}
	}

	public static long lcm(long x, long y){
		return x / gcd(x, y) * y;
	}
}