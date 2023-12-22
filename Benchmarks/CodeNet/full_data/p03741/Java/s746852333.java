
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();        	
		}        
		long ans = 0;
		int count = a[0];
		for(int i=1;i<n;i++){
			if(count>=0 && count+a[i]>=0){
				int tmp = a[i];
				a[i] = -1 - count;
				ans += (int)Math.abs(tmp - a[i]);

			}
			else if(count<0 && count+a[i]<0){
				int tmp = a[i];
				a[i] = 1 - count;
				ans += (int)Math.abs(tmp - a[i]);
			}
			if(i==n-1 && count+a[i]==0){
				ans += 1;
				break;
			}
			count += a[i];
		}


		System.out.println(ans);
    }
}