import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		sc.close();
		long ans = 0;
		int tmp = a[0];
		if(tmp > x){
			ans = (long)(tmp - x);
			a[0] = x;
		}
		for(int i = 1; i < n; ++i){
			tmp = a[i] + a[i - 1];
			if(tmp > x){
				ans += (long)(tmp - x);
				a[i] -= tmp - x;
			}
		}
		System.out.println(ans);
	}
}
