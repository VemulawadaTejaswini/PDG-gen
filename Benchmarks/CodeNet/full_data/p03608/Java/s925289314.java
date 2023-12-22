package contest;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(final String args[]) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int R = Integer.parseInt(sc.next());
		edge[] e = new edge[M];
		int dist[][] = new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(i!=j) dist[i][j] = Integer.MAX_VALUE;
				else dist[i][j] = 0;
			}
		}
		ArrayList<Integer> cities = new ArrayList<>();
		for (int i = 0; i < R; i++) {
			cities.add(Integer.parseInt(sc.next()));
		}
		for (int i = 0; i < M; i++) {
			int a = Integer.parseInt(sc.next()) - 1;
			int b = Integer.parseInt(sc.next()) - 1;
			int c = Integer.parseInt(sc.next());
			edge[i] = new edge(a,b,c);
			dist[a][b] = Math.min(c,dist[a][b]);
			dist[b][a] = Math.min(c,dist[b][a]);
		}

		for(int k=0;k<N;k++){
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					dist[i][j] = Math.min(dist[i][j],dist[i][k]+dist[k][j]);
				}
			}
		}

		int result = 0;
		for(int i=0;i<cities.size()-1;i++){
			result += dist[i][i+1];
		}


		out.println(result);
		out.flush();
	}

 class edge {
	int cost;

	public edge(final int a, final int b, final int c) {
		this.cost = c;
	}
 }
}