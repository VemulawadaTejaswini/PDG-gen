import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int answer = 0;
		int nn = (n == 1) ? 1 : Math.max(0, n - 2);
		int mm = (m == 1) ? 1 : Math.max(0, m - 2);

		System.out.println(nn * mm);
	}
}
