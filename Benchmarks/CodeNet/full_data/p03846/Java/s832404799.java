import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt[] = new int[n] ;
		long ans = 1;
		for(int i = 0; i < n; i++)cnt[i] = 0; 
		int work;
		for(int i = 0; i < n; i++) {
			work = sc.nextInt();
			cnt[work]++; 
		}
		boolean key = true;
		int idx = 2;
		if(n % 2 == 0)idx--;
		while(idx < n) {
			if(cnt[idx] != 2) {
				key = false;
				break;
			}
			idx += 2;
		}
		if(key) {
			for(int i = 0; i < n / 2; i++) {
				ans = ans *  2 % 1000000007;
			}
		}
		else ans = 0;
		System.out.println(ans);
	}
}
