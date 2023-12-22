import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] cnt = new int[100001];
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			cnt[a]++;
		}
		
		long c = 0;
		for(int i=0;i<cnt.length;i++){
			if(cnt[i]>1)
				c+=cnt[i]-1;
		}
		
		if(c%2!=0)
			c++;
		
		System.out.println(n-c);
	}
}
