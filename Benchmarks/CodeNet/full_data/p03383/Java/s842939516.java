import java.util.Arrays;
import java.util.Scanner;

class Solver {
	Scanner sc = new Scanner(System.in);

	void run() {
		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] map = new char[h][];
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}

		boolean[][][][] match = new boolean[h][h][w][w];

		for (int i = 0; i < h; i++) {
			for (int j = i + 1; j < h; j++) {
				for (int k = 0; k < w; k++) {
					for (int l = k + 1; l < w; l++) {

						boolean flag = map[i][k] == map[j][l];
						match[i][j][k][l] = flag;
						match[j][i][k][l] = flag;
						match[i][j][l][k] = flag;
						match[j][i][l][k] = flag;

					}
				}
			}
		}

		boolean[][] used = new boolean[1 << h ][1 << w ];

		if (h % 2 == 0) {
			used[0][0] = true;
		} else {
			for (int i = 0; i < h; i++) {
				used[1 << i][0] = true;
				for (int jj = 0; jj < (1 << w); jj++) {
					if(!used[1<<i][jj]){
						continue;
					}
					for (int j1 = 0; j1 < w; j1++) {
						if((jj & (1<<j1)) !=0){
							continue;
						}
						for (int j2 = j1 + 1; j2 < w; j2++) {
							if(((1<<j2) & jj) != 0){
								continue;
							}
							int jjj = jj + (1<<j1)+(1<<j2);
							if(map[i][j1] == map[i][j2]){
								used[1<<i][jjj] = true;;
							}
						}
					}
				}

			}

		}

		for (int ii = 0; ii < (1 << h ); ii++) {
			for (int i1 = 0; i1 < h; i1++) {
				if (((1 << i1) & ii) != 0) {
					continue;
				}
				for (int i2 = i1 + 1; i2 < h; i2++) {
					if (((1 << i2) & ii) != 0) {
						continue;
					}
					int iii = ii + (1 << i1) + (1 << i2);

					for (int jj = 0; jj < (1 << w ); jj++) {
						if (!used[ii][jj]) {
							continue;
						}

						for (int j1 = 0; j1 < w; j1++) {
							if (((1 << j1) & jj) != 0) {
								continue;
							}
							for (int j2 = j1 + 1; j2 < w; j2++) {
								if (((1 << j2) & jj) != 0) {
									continue;
								}
								int jjj = jj + (1 << j1) + (1 << j2);
								if (match[i1][i2][j1][j2])
									used[iii][jjj] = true;
							}
						}
					}
				}
			}
		}
		
//		for(int i = 0;i<1<<h;i++){
//			System.out.println(Arrays.toString(used[i]));
//		}
		
		if(w%2==0){
			if(used[(1<<h)-1][(1<<w)-1]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}else{
			boolean ans = false;
			for(int j = 0; j < w; j++){
				int center = 1 << j;
				int jjj = (1<<w)-1 - center;

				boolean flag = true;
				if(!used[(1<<h)-1][jjj]){
					flag = false;
				}
				
				if(flag){
					ans = true;
				}

			}
			
			if(ans){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}

public class Main {
	public static void main(String[] args) {
		Solver s = new Solver();
		s.run();
	}
}
