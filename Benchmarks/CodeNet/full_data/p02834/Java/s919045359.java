import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Integer>[] path;
	static int[] dis_u;
	static int[] dis_v;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int u = sc.nextInt();
		int v = sc.nextInt();
		path = new ArrayList[n + 1];
		dis_u = new int[n + 1];
		dis_v = new int[n + 1];
		if(u == v) {
			System.out.println(0);
			return;
		}

		for(int i = 1 ; i <= n ; i++) {
			path[i] = new ArrayList<>();
		}
		for(int i = 0 ; i < n - 1 ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			path[a].add(b);
			path[b].add(a);
		}
		Arrays.fill(dis_u, -1);
		Arrays.fill(dis_v, -1);
		dis_u[u] = 0;
		dis_v[v] = 0;

		dfsU(u,n);
		dfsV(v,n);
		int ans  = 0;
		for(int i = 1 ; i <= n ; i++) {
			int uDis = dis_u[i];
			int vDis = dis_v[i];
			if(uDis < vDis) {

					ans = Math.max(ans, dis_v[i] - 1);
			}

		}
		/*for(int i = 1 ; i <= n ; i++) {
			System.out.println(i + ", u : " + dis_u[i] + " v : " + dis_v[i]);
		}*/




		sc.close();
		System.out.println(ans);

	}
	public static void dfsU(int now , int n) {
		List<Integer> edge = path[now];
		int nowDis = dis_u[now];
		for(int ed : edge) {
			if(dis_u[ed] < 0) {
				dis_u[ed] = nowDis + 1;
				dfsU(ed , n);
			}
		}
	}
	public static void dfsV(int now , int n) {
		List<Integer> edge = path[now];
		int nowDis = dis_v[now];
		for(int ed : edge) {
			if(dis_v[ed] < 0) {
				dis_v[ed] = nowDis + 1;
				dfsV(ed , n);
			}
		}
	}

}

