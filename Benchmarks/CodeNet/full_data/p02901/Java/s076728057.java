import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] dp=new int[n+1][2];
		for(int i=1; i<=n; i++){
			dp[i][0]=100000001;
		}
		ArrayList<Integer>[] b=new ArrayList[m];
		int[] a=new int[m];
		for(int i=0; i<m; i++){
			b[i]=new ArrayList<>();
			a[i]=sc.nextInt();
			int k=sc.nextInt();
			for(int j=0; j<k; j++){
				b[i].add(sc.nextInt());
			}
		}
		for(int i=1; i<=n; i++){
			boolean tt=false;
			for(int k=0; k<m; k++){
				for(int j=0; j<b[k].size(); j++){
					if(b[k].get(j)==i && dp[i][0]>a[k]){
						dp[i][0]=a[k];
						dp[i][1]=k;
						tt=true;
					}
				}
			}
			if(!tt){
			System.out.println(-1);
			return;
			}
		}
		
		long ans=Long.MAX_VALUE;
		for(int i=0; i<m; i++){
			int count=0;
			int tmp=a[i];
			HashSet<Integer> set=new HashSet<>();
			boolean kk=false;
			for(int j=0; j<n; j++){
				if(kk || (j+1)!=b[i].get(count)){
					count--;
					tmp+=dp[j+1][0];
					if(!set.contains(dp[j+1][1])){
						set.add(dp[j+1][1]);
					}else{
						tmp=100000001;
						break;
					}
				}
				if(count==b[i].size()-1){
					kk=true;
				}
				count++;
			}
			ans=Math.min(ans,tmp);
		}
		System.out.println(ans);
	}
}
