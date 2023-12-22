import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int l=sc.nextInt();
		long[][] min=new long[n][n];
		for(int i=0; i<n; i++){
			Arrays.fill(min[i],Long.MAX_VALUE/10);
		}
		for(int i=0; i<m; i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			long c=sc.nextLong();
			if(c>l){
				continue;
			}
			min[a][b]=c;
			min[b][a]=c;
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				for(int k=0; k<n; k++){
					min[j][k]=Math.min(min[j][k],min[j][i]+min[i][k]);
				}
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(min[i][j]<=l){
					min[i][j]=1;
				}else{
					min[i][j]=Long.MAX_VALUE/10;
				}
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				for(int k=0; k<n; k++){
					min[j][k]=Math.min(min[j][k],min[j][i]+min[i][k]);
				}
			}
		}
		int q=sc.nextInt();
		for(int i=0; i<q; i++){
			int s=sc.nextInt()-1;
			int t=sc.nextInt()-1;
			if(min[s][t]==Long.MAX_VALUE/10){
				System.out.println(-1);
			}else{
				System.out.println(min[s][t]-1);
			}
		}
	}
}
