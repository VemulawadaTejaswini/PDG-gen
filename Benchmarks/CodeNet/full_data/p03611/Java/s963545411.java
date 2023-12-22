import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n  =sc.nextInt();
		int cnt[] = new int[100010];
		
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			cnt[a]++;
		}
		
		int ans = 0;
		for(int i= 1;i<100000;i++){
			ans = Math.max(ans, cnt[i] + cnt[i+1] + cnt[i-1]);
		}
		System.out.println(ans);
	}

}
