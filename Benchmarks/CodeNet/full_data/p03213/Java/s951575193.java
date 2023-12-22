import java.util.Scanner;

public class Main {

	public static int[] divisor;
	public static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		divisor = new int[n+1];
		for (int i = 2; i <= n; i++) {
			int k = i;
			for (int j = 2; j <= i; j++) {
				while(k%j==0) {
					divisor[j]++;
					k /= j;
				}
			}
		}
		int ans = 0;
		ans += count(74);
		ans += count(24)*(count(2)-1);
		ans += count(14)*(count(4)-1);
		ans += count(4)*(count(4)-1)/2*(count(2)-2);
		System.out.println(ans);
		sc.close();
	}
	public static int count(int x) {
		int res = 0;
		for (int i = 0; i <= n; i++) {
			if(divisor[i]>=x) res++;
		}
		return res;
	}
}