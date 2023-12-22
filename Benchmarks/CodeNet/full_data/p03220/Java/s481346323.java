import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int[] h = new int[n];
		double ans =Math.abs(a - t);
		int hAns = n-1;
		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i <n ;i++) {
			double temp =Math.abs( a - (t - (h[i]*0.006)));
			if (ans > temp) {
				ans =temp;
				hAns = i;
			}
		}
		System.out.println(hAns + 1);
	}
}