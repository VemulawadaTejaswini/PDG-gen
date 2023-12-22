import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++) A[i]=sc.nextInt();
		
		int cnt = 0;
		
		boolean allplus = false;
		for(int i=0;i<N;i++) {
			if(A[i]==0) {
				allplus=true;
				break;
			}
			if(A[i]<0) cnt ++;
		}
		
		
		for(int i=0;i<N;i++) {
			A[i] = Math.max(A[i], -A[i]);
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			min = Math.min(min, A[i]);
		}

		
		long ans = 0;
		for(int tmp:A) {
			ans += tmp;
		}
		
		if(allplus);
		else{
			if(cnt%2==0) {
				//全部プラス
			}else {
				//evenの中で絶対値が最小のもののみマイナスにする。
				ans -= min*2;
			}
		}
		System.out.println(ans);
	}
}
