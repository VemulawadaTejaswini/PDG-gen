import java.util.Scanner;
public class Main{
	static long max;
	static int n;
	static int[] b;
	static int[] c;
	static int m;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] a={2,5,5,4,5,6,3,7,6};
		c =new int[m];
		b=new int[m];
		for(int i = 0; i<m; i++){
			int q = sc.nextInt()-1;
			c[i]=q;
			b[i]=a[q];
		}
		for(int i = 0; i<m; i++){
			dfs(c[i],b[i],String.valueOf(c[i]+1));
		}
		System.out.println(max);
	}
	public static void dfs(int now,int cost,String e){
		
		if(cost==n){
			if(max<Long.parseLong(e)){
				max=Long.parseLong(e);
			}
			return;
		}else if(cost>n){
			return;
		}
		for(int i=0; i<m; i++){
			dfs(c[i],b[i]+cost,e+String.valueOf(c[i]+1));
		}
	}
}