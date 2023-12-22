import java.util.*;
public class Main{
	static long mod=998244353;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] d=new int[n];
		long count1=0;
		for(int i=0; i<n; i++){
			d[i]=sc.nextInt();
			if(d[i]==1){
				count1++;
			}
		}
		if(d[0]!=0){
			System.out.println(0);
			return;
		}
		Arrays.sort(d);
		long ans=1;
		int cc=2;
		long count=0;
		long count2=0;
		if(count1==0){
			System.out.println(0);
			return;
		}
		for(int i=1; i<n; i++){
			if(cc==d[i]){
				count++;
			}else if(cc+1==d[i]){
				if(d[i]>cc+1){
					System.out.println(0);
					return;
				}
				count2=count;
				while(count>0){
					if((count & 1)==1){
						ans*=count1;
					}
					count>>=1;
					ans%=mod;
					count1*=count1;
					count1%=mod;
				}
				count1=count2;
				count=1;
				cc++;
			}
		}
		while(count>0){
			if((count & 1)==1){
				ans*=count1;
			}
			count>>=1;
			ans%=mod;
			count1*=count1;
			count1%=mod;
		}
		System.out.println(ans);
	}
}
