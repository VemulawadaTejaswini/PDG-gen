import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	static char[][] a;
	static int h1;
	static int w1;
	static long sum;
	static int[][] b;
	static int l;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		 h1 = sc.nextInt();
		 w1 = sc.nextInt();
		 a = new char[h1][w1];
		 b = new int[h1][w1];
		 l = 1;
		int count = 0;
		ArrayList<Integer> t = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		long ans = 0;
		for(int i = 0; i < h1; i++){
			String c = sc.next();
			for(int j = 0; j < w1; j++){
				a[i][j]=c.charAt(j);
				if(a[i][j]=='#'){
					count++;
					t.add(i);
					y.add(j);
				}
			}
		}
			for(int j=0; j<count; j++){
				if(a[t.get(j)][y.get(j)]=='#'){
					sum=0;
					dfs('#',t.get(j),y.get(j));
					ans+=sum;
					l++;
				}
			}
		
		System.out.println(ans);
	}
	public static void dfs(char q,int h, int w){
		if(q=='.'){
			sum++;
		}
		b[h][w]=l;
		if(h+1<h1 && q!=a[h+1][w] && b[h+1][w]!=l){
			dfs(a[h+1][w],h+1,w);
		}
		if(h-1>=0 && q!=a[h-1][w] && b[h-1][w]!=l){
			dfs(a[h-1][w],h-1,w);
		}
		if(w+1<w1 && q!=a[h][w+1] && b[h][w+1]!=l){
			dfs(a[h][w+1],h,w+1);
		}
		if(w-1>=0 && q!=a[h][w-1] && b[h][w-1]!=l){
			dfs(a[h][w-1],h,w-1);
		}
		
	}
}