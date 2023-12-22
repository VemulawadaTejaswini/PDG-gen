
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		
		int cnt = 0;
		int flipcnt = 0;
		
		int ans = 0;
		for(int j=0;j<N;j++) {
			
			int nows = S.charAt(j)-'0';
			if(j!=0) {
				int beforenows = S.charAt(j-1) - '0';
				if(nows==0 | nows - beforenows==0)continue;
			}

			int now = 1;
			if(j==0&nows==0) {
				now--;
			}
			for(int i=j;i<N-1;i++) {
				now++;
				int s = S.charAt(i) - '0';
				int nexts = S.charAt(i+1) - '0';
				if(flipcnt==K&nexts-s==-1){
					break;
				}	
				if(nexts-s==1) {
					flipcnt ++;
				}
	
			}
			ans = Math.max(ans, now);
		}
		System.out.println(ans);
	}
}