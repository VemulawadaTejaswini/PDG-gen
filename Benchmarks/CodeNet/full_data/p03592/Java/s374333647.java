import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main{
	static Scanner sc;

	static int N, M ,K;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;
		//PrintStream out = new PrintStream("src/output.txt");

		//System.setOut(out);

		sc = new Scanner(in);

		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();

		int[][] map = new int[N][M];

		for(int i = 0; i < M; i++){
			for(int j = 0; j < N; j++){
				map[j][i] = -1;
			}
		}

		change(map, true, 0, false);
		change(map, false, 0, false);

		System.out.println("No");
		//out.close();
	}

	static void change(int[][] map, boolean tate, int num, boolean last){
		if(tate){
			if(num >= N){
				return;
			}
			for(int i = 0; i < M; i++){
				map[num][i] *= -1;
			}
		}else{
			if(num >= M){
				return;
			}
			for(int i = 0; i < N; i++){
				map[i][num] *= -1;
			}
		}

		int count = 0;
		for(int i = 0; i < M; i++){
			for(int j = 0; j < N; j++){
				if(map[j][i] == 1){
					count++;
				}
			}
		}

		if(count == K){
			System.out.println("Yes");
			System.exit(1);
		}
		else{
			if(last != true) change(map, !tate, num, true);
			change(map, tate, num+1, false);
		}
	}
}