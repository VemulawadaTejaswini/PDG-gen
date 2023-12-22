import java.util.Scanner;


public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		char[][]c=new char[H][W];
		for(int i=0;i<H;i++){
			String x=sc.next();
			for(int j=0;j<W;j++){
				c[i][j]=x.charAt(j);
			}
		}int g[][]=new int[H+1][W+1];
		int i;int j=0;
		for( i=0;i<=H;i++){
			for(j=0;j<=W;j++){
				if(i==0||j==0){
					g[i][j]=0;
				}else{
					if(i==1&&j==1){
						g[i][j]=1;
					}else{
						if(c[i-1][j-1]=='#'){
							g[i][j]=0;
						}else{
							g[i][j]=g[i-1][j]+g[i][j-1];
						}
					}
				}
			}
		}System.out.print(g[i-1][j-1]%1000000007);
	}
}