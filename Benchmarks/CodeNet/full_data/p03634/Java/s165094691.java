import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	//重み付き無向グラフのワーシャルフロイド
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		long[][] edge = new long[N+1][N+1];
		
		for(int i = 1; i <= N; i++){
			for(int j = 1; j <= N; j++){
				edge[i][j] = (i == j) ? 0 : Long.MAX_VALUE;
			}
		}
		
		for(int i = 0; i < N - 1; i++){
			int a = in.nextInt();
			int b = in.nextInt();
			long c = in.nextLong();
			edge[a][b] = c;
			//無向グラフ
			edge[b][a] = c;
		}
		
		/*
		for(int i = 1; i <= N; i++){
			for(int j = 1; j <= N; j++){
				System.out.print(((edge[i][j] == Long.MAX_VALUE) ? "N" : edge[i][j]) + " ");
			}
			System.out.println();
		}
		System.out.println();
		*/
		
		for(int k = 1; k <= N; k++){
			for(int i = 1; i <= N; i++){
				if(edge[i][k] == Long.MAX_VALUE) continue;
				for(int j = 1; j <= N; j++){
					if(edge[k][j] == Long.MAX_VALUE) continue;
					edge[i][j] = Math.min(edge[i][j], edge[i][k] + edge[k][j]);
				}
			}
		}
		
		/*
		for(int i = 1; i <= N; i++){
			for(int j = 1; j <= N; j++){
				System.out.print(((edge[i][j] == Long.MAX_VALUE) ? "N" : edge[i][j]) + " ");
			}
			System.out.println();
		}
		*/
		
		int Q = in.nextInt();
		int K = in.nextInt();
		for(int i = 0; i < Q; i++){
			int x = in.nextInt();
			int y = in.nextInt();
			System.out.println(edge[x][K] + edge[K][y]);
		}
	}
}
