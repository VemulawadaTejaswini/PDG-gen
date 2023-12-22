import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++)
			a[i] = sc.nextInt();
		for(int x = -100; x <= 100; x++) {
			int total = 0;
			for(int i = 0; i < N; i++)
				total += Math.pow(a[i]-x, 2);
			ans = Math.min(ans, total);
		}
		System.out.println(ans);

	}

}
