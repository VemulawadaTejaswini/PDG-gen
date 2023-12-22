import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		long MOD=1000000007L;

		Scanner sc = new Scanner(System.in);

		int h=sc.nextInt();
		int w=sc.nextInt();

		String s[]=new String[h];
		char c[][]=new char[h][w];

		for(int i=0;i<h;++i){
			s[i]=sc.next();
			c[i]=s[i].toCharArray();
		}

		int L[][]=new int[h][w];
		int R[][]=new int[h][w];
		int U[][]=new int[h][w];
		int D[][]=new int[h][w];


		for(int i=0;i<h;++i){
			if(c[i][0]=='.')L[i][0]=1;
			else L[i][0]=0;
			for(int j=1;j<w;++j){
				if(c[i][j]=='.')L[i][j]=L[i][j-1]+1;
				else L[i][j]=0;
			}
			if(c[i][w-1]=='.')R[i][w-1]=1;
			else R[i][w-1]=0;
			for(int j=w-2;j>=0;--j){
				if(c[i][j]=='.')R[i][j]=R[i][j+1]+1;
				else R[i][j]=0;
			}
		}

		for(int i=0;i<w;++i){
			if(c[0][i]=='.')U[0][i]=1;
			else U[0][i]=0;
			for(int j=1;j<h;++j){
				if(c[j][i]=='.')U[j][i]=U[j-1][i]+1;
				else U[j][i]=0;
			}
			if(c[h-1][i]=='.')D[h-1][i]=1;
			else D[h-1][i]=0;
			for(int j=h-2;j>=0;--j){
				if(c[j][i]=='.')D[j][i]=D[j+1][i]+1;
				else D[j][i]=0;
			}
		}
		long ans=0;
		for(int i=0;i<h;++i){
			for(int j=0;j<w;++j){
				ans=Math.max(ans,L[i][j]+R[i][j]+D[i][j]+U[i][j]-3);

			}
		}
		System.out.println(ans);
	}
}