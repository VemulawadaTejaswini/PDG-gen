import java.util.*;
 
public class Main{
	public static int[] p = new int[90001]; //累積和
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();
		int[] x = new int[H*W+1];
		int[] y = new int[H*W+1];
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				int a = sc.nextInt();
				x[a] = j;
				y[a] = i;
			}
		}		
		for(int i=D+1;i<=H*W;++i){
			p[i] = p[i-D] + dist(x[i],y[i],x[i-D],y[i-D]);
		}
		
		int Q = sc.nextInt();
		for(int i=0;i<Q;++i){
			System.out.println(-1*p[sc.nextInt()]+p[sc.nextInt()]);
		}
		return;
	}
	
	public static int dist(int x1,int y1,int x2, int y2){
		return Math.abs(x2-x1)+Math.abs(y2-y1);
	}
}