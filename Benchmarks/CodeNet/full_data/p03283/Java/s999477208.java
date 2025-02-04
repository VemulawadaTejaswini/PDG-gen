import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int Q=sc.nextInt();

		int[][] sta=new int[M][2];

		int[][] hct=new int[N+1][N+1];

		for(int i=0; i<=N; i++) {
			for(int j=0; j<=N; j++) {
				hct[i][j]=0;
			}
		}

		for(int i=0; i<M; i++) {
			sta[i][0]=sc.nextInt();
			sta[i][1]=sc.nextInt();
			hct[sta[i][0]][sta[i][1]]++;
		}

		int s=0; int g=0;
		long ans=0;
		for(int i=0; i<Q; i++) {
			ans=0;
			s=sc.nextInt();
			g=sc.nextInt();
			for(int jj=s; jj<=g; jj++) {
				for(int kk=s; kk<=g; kk++) {
					ans+=hct[jj][kk];
				}
			}
			System.out.println(ans);
		}

	}
}