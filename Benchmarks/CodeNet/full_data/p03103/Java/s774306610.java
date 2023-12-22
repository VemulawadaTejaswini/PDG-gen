import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int r = (int)Math.pow(10,  9) + 1;
		int b[] = new int[r];
		int a[] = new int[n];
		for(int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			b[a[i]] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a);
		long ans = 0 , count = 0;
		for(int i = 0; i < n; ++i) {
			long tmp = (long)b[a[i]];
			if(count + tmp >= m)tmp = m - count;
			count += tmp;
			ans += (long)a[i] * tmp;
			if(count >= m)break;
		}
		System.out.println(ans);
		
	}

}
