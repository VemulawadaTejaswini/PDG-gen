import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		
		int a, b;
		boolean[][] pass = new boolean[N+1][N+1];
		for(int i = 0; i < M; i++) {
			a = s.nextInt();
			b = s.nextInt();
			pass[a][b] = true;
			pass[b][a] = true;
		}
		
		int goal = (1<<N) - 1;
		
		int[] start = {1, 1}; // 0=現在地、1=通過点 1=1, 10=2, 100=3,,,10000000 = 8;
		Stack<int[]> S = new Stack<int[]>();
		S.add(start);
		
		int[] tmp;
		int result = 0;
		while(!S.isEmpty()) {
			tmp = S.pop();
			// 現在地からN通りのグラフを調査
			for(int i = 1; i < N; i++) {
				// i番目が通過済みであれば処理をスキップ
				if(((tmp[1]>>i)&1) == 1) {
					continue;
				}
				if(pass[tmp[0]][i+1]) {
					if((tmp[1] + (1<<i)) == goal) {
						result++;
						continue;
					}
					S.add(new int[] {i+1, tmp[1] + (1<<i)});
				}
			}
		}
		System.out.println(result);
    }
}