import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i = 1; i < n+1; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int ans = 1000000001;
		for(int i = 1; i < n; i++){
			ans = Math.min(ans,Math.max(a[i],a[i+1])%Math.min(a[i],a[i+1])==0?a[i]:(a[i]%2==1&&a[i+1]%2==1?1:(a[i]%2==0&&a[i+1]%2==0?2:1000000002)));
			if(a[i+1]%a[i]!=0&&a[i]%2 != a[i+1]%2){
				boolean flag = true;
				int wa1 = a[i];
				int wa2 = a[i+1];
				int work;
				while(flag){
					if(wa1 > wa2){
						work = wa1;
						wa1 = wa2;
						wa2 = work;
					}
					if(wa2%wa1==0){
						flag = false;
					}
					int hw = wa2/wa1;
					wa2 = wa2 - wa1*hw;
				}
				ans = Math.min(ans,wa1);
			}
		}
		System.out.print(ans);
 	}
}
