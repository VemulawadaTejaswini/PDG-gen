import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		long nn = (n == 1) ? 1 : Math.max(0, n - 2);
		long mm = (m == 1) ? 1 : Math.max(0, m - 2);

		System.out.println(nn * mm);
	}
}
