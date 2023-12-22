import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	static Scanner scan = new Scanner(System.in);
	static int N = scan.nextInt();
	static int Q = scan.nextInt();
	static int[]a = new int[N];
	static int[]b = new int[N];
	static int[]p = new int[N+1];
	static int[]x = new int[N+1];
	static int counter = 0;
	static int[] tyoutencount = new int[N+1];
	static int[] tyoutenXcount = new int[N+1];
	static boolean[] tyoutenserch = new boolean[N+1];
	static int[][]edge = new int[N+1][N+1];//余分に作っておく
	static List<List<Integer>> list;
	
	public static void main(String[]args) {
		list = new ArrayList<>(N);
		for (int i = 0; i < N; i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i = 1;i<N;i++) {//ちょっと工夫1~N-1個
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			edge[a[i]][b[i]] = 1;//N-1こ分の変数
			list.get(a[i]-1).add(b[i]);
			list.get(b[i]-1).add(a[i]);
		}	
		for(int i = 1;i<Q+1;i++) {//1~QのNこ
			p[i] = scan.nextInt();
			x[i] = scan.nextInt();
			tyoutenXcount[p[i]]+=x[i];
		}
		DFS(1);
		/*for(int i = 1;i<=N;i++) {
			for (int next : list.get(i-1)) {
			System.out.println(next);
			}
			System.out.println();
		}*/
		
		for(int i = 1;i<=N;i++) {
			System.out.println(tyoutencount[i]);
		}
		
	}
	private static void DFS(int n) {
		counter+=tyoutenXcount[n];
		tyoutencount[n] +=counter;
		tyoutenserch[n] = true;
		for (int next : list.get(n-1)) {
			if (tyoutenserch[next]==false) {
				DFS(next);
			}
		}
		
		counter-=tyoutenXcount[n];	
	}
}
