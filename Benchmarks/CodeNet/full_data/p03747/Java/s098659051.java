import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float l = sc.nextFloat();
		float t = sc.nextFloat();
		float[] x = new float[n];
		int[] w = new int[n];
		for(int i=0; i<n; i++){
			x[i] = sc.nextFloat();
			w[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=1; i<n; i++){
			if(w[0]==1){
				if(w[i]==2){
					if((x[i]-x[0])/2<t)count++;
					else break;
					if((t-(x[i]-x[0])/2)%(l/2)==0)count += (t-(x[i]-x[0])/2) / (l/2) - 1;
					else count += (t-(x[i]-x[0])/2) / (l/2);
				}
			}else{
				if(w[i]==1){
					if((l-x[i]+x[0])/2<t)count--;
					else break;
					if((t-(l-x[i]+x[0])/2)%(l/2)==0)count -= (t-(l-x[i]+x[0])/2) / (l/2) +1;
					else count -= (t-(l-x[i]+x[0])/2) / (l/2);
				}
			}
		}
		if(w[0]==1){
			count %= n;
		}else{
			count = (count%n + n)%n;
		}
		float[] dist = new float[n];
		for(int i=0; i<n; i++){
			if(w[i]==1){
				dist[i] = (x[i] + t)%l;
			}else{
				dist[i] = ((x[i] - t)%l+l)%l;
			}
		}
		float dist0 = dist[0];
		Arrays.sort(dist);
		int index0 = 0;
		if(w[0]==1){
			for(int i=0; i<n; i++){
				if(dist[i]==dist0){
					index0 = i;
					break;
				}
			}
		}else{
			for(int i=n-1; i>=0; i--){
				if(dist[i]==dist0){
					index0 = i;
					break;
				}
			}
		}
		int[] ans = new int[n];
		if(index0>=count){
			for(int i=0; i<n-index0+count; i++){
				ans[i] = (int)dist[i+index0-count];
			}
			for(int i=0; i<index0-count; i++){
				ans[n-index0+count+i] = (int)dist[i];
			}
		}else{
			for(int i=0; i<n-count+index0; i++){
				ans[i+count-index0] = (int)dist[i];
			}
			for(int i=0; i<count-index0; i++){
				ans[i] = (int)dist[n-count+index0+i];
			}
		}
		for(int i=0; i<n; i++){
			System.out.println(ans[i]);
		}
	}
}