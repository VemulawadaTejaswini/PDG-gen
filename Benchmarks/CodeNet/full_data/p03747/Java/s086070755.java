import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long l = sc.nextLong();
		long t = sc.nextLong();
		long[] x = new long[n];
		int[] w = new int[n];
		for(int i=0; i<n; i++){
			x[i] = sc.nextLong();
			w[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=1; i<n; i++){
			if(w[0]==1){
				if(w[i]==2){
					if(((x[i]-x[0])%2==1&&(x[i]-x[0])/2<t) || ((x[i]-x[0])%2==0&&(x[i]-x[0])/2<=t))count++;
				}
			}else{
				if(w[i]==1){
					if(((l-x[i]+x[0])%2==1&&(l-x[i]+x[0])/2<t) || ((l-x[i]+x[0])%2==0&&(l-x[i]+x[0])/2<=t))count--;
				}
			}
		}
		if(w[0]==1){
			while(count>=n)count -= n;
		}else{
			while(count<0)count += n;
		}
		long[] dist = new long[n];
		for(int i=0; i<n; i++){
			if(w[i]==1){
				dist[i] = x[i] + t;
				while(dist[i]>=l)dist[i] -= l;
			}else{
				dist[i] = x[i] - t;
				while(dist[i]<0)dist[i] += l;
			}
		}
		long dist0 = dist[0];
		Arrays.sort(dist);
		int index0 = 0;
		for(int i=0; i<n; i++){
			if(dist[i]==dist0){
				index0 = i;
				break;
			}
		}
		long[] ans = new long[n];
		if(index0>=count){
			for(int i=0; i<n-index0+count; i++){
				ans[i] = dist[i+index0-count];
			}
			for(int i=0; i<index0-count; i++){
				ans[n-index0+count+i] = dist[i];
			}
		}else{
			for(int i=0; i<n-count+index0; i++){
				dist[i] = ans[i+count-index0];
			}
			for(int i=0; i<count-index0; i++){
				dist[n-count+index0+i] = ans[i];
			}
		}
		for(int i=0; i<n; i++){
			System.out.println(ans[i]);
		}
	}
}