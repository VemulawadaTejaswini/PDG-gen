
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());

		int []div = divisor(n);
		
		int []cnt = new int [5]; //3,5,15,25,75 個の素因数の約数の個数
		
		int ans = 0;
		
		for(int i = 1 ; i <= n ;i++) {
			if(div[i] >= 2) cnt[0]++;
			if(div[i] >= 4) cnt[1]++;
			if(div[i] >= 14) cnt[2]++;
			if(div[i] >= 24) cnt[3]++;
			if(div[i] >= 74) cnt[4]++;
		}
		
		
		if(cnt[4] > 0) {
			ans += cnt[4];
		}
		if(cnt[3] > 0 && cnt[0] > 1) {
			ans += cnt[3] * (cnt[0]-1);
		}
		if(cnt[2] > 0 && cnt[1] > 1) {
			ans += cnt[2] * (cnt[1]-1);
		} 
		if(cnt[1] > 1 && cnt[0] > 2) {
			ans +=(cnt[1] * (cnt[1]-1)* (cnt[0]-2))/2;
		}
		
		System.out.println(ans);
		
	}
	
	
	static int[] divisor(int n) {
		int []d = new int [n+1];
		for(int i = 2 ; i <= n ; i++) {
			Euclid(i,d);
			}
		return d;

	}
	
	static void Euclid(int i , int []d) {
		for(int j = 2 ; j <= i ; j++) {
			if(prime(i)) {
				d[i]++;
				return;
			}
			else if(i % j == 0 && prime(j)) {
				int t = i;
				while(t % j == 0) {
					d[j]++;
					t = t / j;
				}
			}
		}
	}
	
	static boolean prime(int k) {
		
		if(k == 1) return false;
		
		for(int i = 2 ; i <= Math.sqrt(k) ; i++) {
			if(k % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
