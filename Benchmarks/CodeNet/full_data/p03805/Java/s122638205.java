import java.util.*;

public class Main {
    static boolean[] visit;
	static boolean[][] graph;
	static int N;
	static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M + 1];
        int[] b = new int[M + 1];
        graph = new boolean[N + 1][N + 1];
        visit = new boolean[N + 1];

        for (int i = 1; i <= M; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            graph[a[i]][b[i]] = graph[b[i]][a[i]] = true;
        }
		DFS(1);
            
        System.out.println(count);
    }

    static void DFS(int n) {
		visit[n] = true;
		
		boolean flag = true;
		for (int i = 1; i <= N; i++) {
			if (visit[i] == false) {
				flag = false;
			}
		}
		
		if (flag) {
			count++;
			visit[n] = false;
		}
		
		for (int i = 1; i <= N; i++) {
			if (!graph[n][i]) continue;
			if (visit[i]) continue;
			
			DFS(i);
		}
		visit[n] = false;
    }
}
