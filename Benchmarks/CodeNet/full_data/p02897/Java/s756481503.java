import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		double ans = 0.0;
		int tmp  = (n + 1) / 2;
		ans = (double)tmp / (double)n;
		System.out.println(ans);
	}
}
