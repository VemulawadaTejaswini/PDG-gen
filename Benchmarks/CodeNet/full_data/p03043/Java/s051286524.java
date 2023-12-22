import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double ans = 0;
		for(int i = 1; i <= N; i++) {
			int a = i;
			int h = 0;
			while(a < K) {
				h ++;
				a *= 2;
			}
			ans += (double)1/N/Math.pow(2,h);
		}
		System.out.println(ans);
	}

}
