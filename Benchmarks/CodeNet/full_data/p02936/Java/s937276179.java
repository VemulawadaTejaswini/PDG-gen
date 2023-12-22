import java.util.LinkedList;
import java.util.Scanner;




//D
public class Main {


	static int[] A=new int[200000];
	static int N;
	static int Q;
	static LinkedList<Integer>[] v;
	static int[] ans;
	public static void f(int p,int q) {
		ans[p]+=q;
		for(int b:v[p]) {
			f(b,q);
		}
	}

	//public static final long MOD = 1000000007;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		N=sc.nextInt();
		Q=sc.nextInt();
		v=new LinkedList[N+1];
		ans=new int[N+1];

		for(int i=1;i<=N;i++) {
			v[i]=new LinkedList<Integer>();
		}
		for(int i=1;i<=N-1;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			v[a].add(b);

		}
		for(int i=1;i<=Q;i++) {
			int p=sc.nextInt();
			int q=sc.nextInt();
			f(p,q);
		}
		for(int i=1;i<=N;i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println();
	}

}
