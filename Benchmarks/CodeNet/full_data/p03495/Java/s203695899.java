import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; ++i) 
			a[i] = sc.nextInt();
		
		Arrays.sort(a);
		int tmp = a[0];
		int cnt = 1;
		int ans = 0;
		for(int i = 1; i < n; ++i) {
			if(tmp != a[i]) {
				tmp = a[i];
				++cnt;
			}
		}
		
		if(k < cnt) {
			int count[] = new int[cnt];
			tmp = a[0];
			int l = 0;
			count[0] = 1;
			for(int i = 1; i < n; ++i) {
				if(tmp != a[i]) {
					tmp = a[i];
					++l;
				}
				++count[l];
			}
			Arrays.sort(count);
			for(int i = 0; i < cnt - k; ++i) {
				ans += count[i];
			}
		}
		sc.close();
		System.out.println(ans);
	}

}
