import java.util.Scanner;

public class Main {
	static int N;
	static int Ma;
	static int Mb;
	static int[]a;
	static int[]b;
	static int[]c;
	static int min;
	static int a2;
	static int b2;
	static int cost;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		Ma=sc.nextInt();
		Mb=sc.nextInt();
		a=new int[N];
		b=new int[N];
		c=new int[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}
		min=Integer.MAX_VALUE;
		dfs(0);
		if(min==Integer.MAX_VALUE)System.out.println(-1);
		else System.out.println(min);
	}
	static void dfs(int i){
		if(i==N)return;
		if(cost>0 && a2*Mb==b2*Ma && cost<min){
			min=cost;
			return;
		}
		a2+=a[i];
		b2+=b[i];
		cost+=c[i];
		dfs(i+1);
		
		a2-=a[i];
		b2-=b[i];
		cost-=c[i];
		dfs(i+1);
	}
	
}
