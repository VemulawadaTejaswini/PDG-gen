import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		boolean[][] cards = new boolean[N][M];
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < M; j++){
				cards[i][j] = !cards[i][j];
				int[] dir = {-1, -1, -1, 0, 1, 1, 1, 0, -1, -1};
				for(int k = 0; k < 8; k++){
					int y = i + dir[k];
					int x = j + dir[k + 2];
					if(y < 0 || y >= N) continue;
					if(x < 0 || x >= M) continue;
					cards[y][x] = !cards[y][x];
				}
			}
		}
		
		long ans = 0;
		for(int i = 0; i < N; i++){
			for(int j = 0; j < M; j++){
				if(cards[i][j]) ans++;
			}
		}
		System.out.println(ans);
	}
}
