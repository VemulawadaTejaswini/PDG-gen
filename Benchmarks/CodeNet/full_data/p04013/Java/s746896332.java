

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int ave=sc.nextInt();
		int[] num=new int[N];

		for(int i=0; i<N; i++) {
			num[i]=sc.nextInt();
		}

		int[][] goukei=new int[N+1][N*50+1];
		boolean[][] bbnwa=new boolean[N+1][N*50+1];
		int[][] maisu=new int[N+1][N*50+1];

		for(int i=0; i<=N; i++) {
			for(int j=0; j<N*50+1; j++) {
				goukei[i][j]=0;
				bbnwa[i][j]=false;
				maisu[i][j]=0;
			}
		}

		goukei[0][0]=1;
		bbnwa[0][0]=true;


		for(int i=0; i<N; i++) {
			for(int j=0; j<N*50+1; j++) {
				if(bbnwa[i][j]==true) {
					bbnwa[i+1][j+num[i]]=true;
					bbnwa[i+1][j]=true;
					goukei[i+1][j+num[i]]+=goukei[i][j];
					goukei[i+1][j]+=goukei[i][j];
					maisu[i+1][j]=maisu[i][j];
					maisu[i+1][j+num[i]]=maisu[i][j]+1;
				}
			}
		}

		long sousu=0;

		for(int j=ave; j<=N*50; j+=ave) {
			if(ave*maisu[N][j]==j) {
				sousu+=goukei[N][j];
			}
		}
		System.out.println(sousu);

		/*String a="";
		for(int i=0; i<=N; i++) {
			a="";
			for(int j=0; j<=10*N; j++) {
				if(ave*maisu[i][j]==j) {
					a=a+goukei[i][j]+" ";
				}
				else {
					a=a+"0 ";
				}
			}
			System.out.println(a);
		}*/
	}
}