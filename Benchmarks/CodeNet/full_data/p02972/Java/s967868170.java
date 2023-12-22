import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	static int []cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		cnt = new int [n];
		
		for(int i = 0 ;i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		List<Integer> ans = new ArrayList<Integer>();
		
		for(int i = n-1 ; i >= 0 ;i--) {
			if(cnt[i] % 2 != a[i] ) {
				gcd(i+1);
				ans.add(i+1);
			}
		}
		if(ans.size() == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(ans.size());
			for(int i = 0 ;i < ans.size() ;i++) {
				System.out.println(ans.get(i));
			}
		}
	}
	
	static void gcd(int k) {
		for(int i = 1 ; i * i <= k ;i++) {
			if(k % i == 0) {
				int a =(k /i)-1;
				int b = i-1;
				cnt[a]++;
				cnt[b]++;
			}
		}
	}

}
