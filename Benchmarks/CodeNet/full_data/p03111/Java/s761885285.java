import java.util.*;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int[] l = new int[N];
		for(int i=0;i<N;i++) {
			l[i] = sc.nextInt();
		}
		System.out.println((int) finpoit(N,l,A,B,C,0,0,0,0));
		
	}
	
	//A用の棒(合成後の長さ), B,C同様と現在の消費ポイントあら最終ポイントを返す
	public static double finpoit(int N,int[]l, int A,int B, int C, int a, int b, int c, int cur) {
		if(cur==N) {
			if(a>0 && b>0 && c>0)  return Math.abs(A-a)+Math.abs(B-b)+Math.abs(C-c) -30;
			else return Double.POSITIVE_INFINITY;
		}
		else {
			double c1 = finpoit(N,l,A,B,C,a+l[cur],b,c,cur+1)+10;
			double c2 = finpoit(N,l,A,B,C,a,b+l[cur],c,cur+1)+10;
			double c3 = finpoit(N,l,A,B,C,a,b,c+l[cur],cur+1)+10;
			double c4 = finpoit(N,l,A,B,C,a,b,c,cur+1);
			return Math.min(Math.min(c1, c2), Math.min(c3, c4));
		}
	}
}
