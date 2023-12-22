import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] tt=new int[n];
		int[] kk=new int[n];
		int[] cc=new int[n];
		for(int i=0; i<n; i++){
			kk[i]=i;
			cc[i]=i;
		}
		tt[n-1]=1;
		for(int i=n-2; i>=1; i--){
			tt[i]=tt[i+1]*(n-i);
		}
		int pp=1;
		for(int i=0; i<n; i++){
			int p=sc.nextInt();
			if(i==n-1){
				break;
			}
			for(int j=p; j<n; j++){
				kk[j]--;
			}
			pp+=kk[p-1]*tt[i+1];
		}
		int qq=1;
		for(int i=0; i<n; i++){
			int q=sc.nextInt();
			if(i==n-1){
				break;
			}
			for(int j=q; j<n; j++){
				cc[j]--;
			}
			qq+=cc[q-1]*tt[i+1];
		}
		System.out.println(Math.abs(qq-pp));
	}
}
