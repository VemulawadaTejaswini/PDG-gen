import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] kk =new int[m][n];
		for(int i=0;  i<m; i++){
			int k=sc.nextInt();
			for(int j=0;j<k; j++){
				int s = sc.nextInt()-1;
				kk[i][s]=1;
			}
		}
		int[] p=new int[m];
		for(int i=0; i<m; i++){
			p[i]= sc.nextInt();
		}
		boolean oi=true;
		long ans=0;
		for(int i=0; i<=Math.pow(2,n); i++){
			for(int j=0; j<m; j++){
				int count=0;
				oi=true;
				for(int k=0; k<n; k++){
					if(kk[j][k]==1 && ((i>>k)&1)==1){
						count++;
					}
				}
				if(count%2!=p[j]){
					oi=false;
					break;
				}
			}
			if(oi){
				ans++;
			}
		}
		System.out.println(ans);
	}
}
