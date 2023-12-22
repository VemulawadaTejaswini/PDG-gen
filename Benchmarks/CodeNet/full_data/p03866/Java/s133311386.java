
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int xs=sc.nextInt(),ys=sc.nextInt(),xt=sc.nextInt(),yt=sc.nextInt();
		int N=sc.nextInt();
		int[][] cir=new int[3][N];
		for(int i=0;i<N;i++){
			cir[0][i]=sc.nextInt();
			cir[1][i]=sc.nextInt();
			cir[2][i]=sc.nextInt();
		}
		double[][] floyd=new double[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				floyd[i][j]=helper(cir[0][i],cir[0][j],cir[1][i],cir[1][j])-cir[2][i]-cir[2][j];
				if(floyd[i][j]<0) floyd[i][j]=0;
			}
		}


		
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				for(int k=0;k<N;k++)
					floyd[i][j]=Math.min(floyd[i][j], floyd[i][k]+floyd[k][j]);


		
		
		double res=Integer.MAX_VALUE;
		
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				res=Math.min(res, helper(xs,cir[0][i],ys,cir[1][i])+floyd[i][j]+helper(cir[0][j],xt,cir[1][j],yt)-cir[2][i]-cir[2][j]);
		System.out.println(res);
	}

	private static double helper(int xs, int xt, int ys, int yt) {
		// TODO Auto-generated method stub
		double res=(xt-xs)*(xt-xs)+(yt-ys)*(yt-ys);
		return Math.sqrt(res);
	}
}
