import java.util.*;

public class Main {

	static final int INF = Integer.MAX_VALUE/2;
	static final int mod = (int)1e9+7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)a[i] = sc.nextInt();
		sc.close();
		if(k==n) {
			System.out.println(1);
			return;
		}
		int ans = (n + (k-2))/(k-1);
		System.out.println(ans);
	}
	
}
