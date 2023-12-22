import java.util.*;

@SuppressWarnings("unchecked")
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long x = in.nextLong();
		long ans = (b - a) / x;
		if (a % x == 0 || b % x == 0) ++ans;
		System.out.println(ans);
	}
}