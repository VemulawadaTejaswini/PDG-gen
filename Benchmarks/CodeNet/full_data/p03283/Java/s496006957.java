import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int Q=sc.nextInt();
		
		int[][] se=new int[n+1][n+1];		
		for(int i=0;i<m;i++){
			int l=sc.nextInt();
			int r=sc.nextInt();
			se[l][r]++;
		}
		
		int[][] s_se=new int[n+1][n+1];
		int[][] ss_se=new int[n+1][n+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				s_se[i][j]=se[i][j]+s_se[i][j-1];
			}
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				ss_se[i][j]=s_se[i][j]+ss_se[i-1][j];
			}
		}
		
		for(int i=0;i<Q;i++){
			int p=sc.nextInt();
			int q=sc.nextInt();			
			System.out.println(ss_se[q][q]-ss_se[p-1][q]-ss_se[q][p-1]+ss_se[p-1][p-1]);
		}		
	}
}
