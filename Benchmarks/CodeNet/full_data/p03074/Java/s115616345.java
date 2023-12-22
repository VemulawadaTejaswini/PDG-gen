import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		String s = sc.next();
		sc.close();
		int ans = 0;
		int j = 0;
		int tmp = 0;
		int cnt = 0;
		for(int i = 0; i < n; ++i) {
			if(s.charAt(i) == '1') 
				tmp++;
			else {
				if(i != 0) {
					if(s.charAt(i - 1) == '1')
						++cnt;
				}
				else ++cnt;
				if(cnt == 1)j = i;
				if(cnt <= k)++tmp;
			}
			if(cnt > k) {
				ans = Math.max(ans,  tmp);
				cnt = 0;
				tmp = 0;
				i = j;
			}
			else {
				if(i == n - 1) 
					ans = Math.max(ans,  tmp);
			}
		}
		
		System.out.println(ans);
		
	}

}
