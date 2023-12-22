import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		int cnt = 0;
		int flag = 0;
		for(int i = 0; i < n; i++){
			a[i] = sc.nextLong();
			if(a[i] == 0){
				flag = 1;
			}else if(a[i] < 0){
				cnt++;
			}
		}
		if(cnt%2 == 0 || flag == 1){
			long ans = 0;
			for(int i = 0; i < n; i++){
				ans += Math.abs(a[i]);
			}
			System.out.print(ans);
		}else{
			long ans = 0;
			for(int i = 0; i < n-2; i++){
				ans += Math.abs(a[i]);
			}
			if(Math.abs(a[n-2]) < Math.abs(a[n-1])){
				ans += Math.abs(a[n-1]);
				ans -= Math.abs(a[n-2]);
			}else{
				ans += Math.abs(a[n-2]);
				ans -= Math.abs(a[n-1]);
			}
			System.out.print(ans);
		}
	}
}
