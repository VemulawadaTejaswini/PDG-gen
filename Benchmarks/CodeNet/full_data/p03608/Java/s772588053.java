import java.util.*;

public class Main {
	static int INF = 100000000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// GET INPUT
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		ArrayList<Integer> rl = new ArrayList<Integer>();
		for(int i=0; i<R; i++) {
			rl.add(sc.nextInt());
		}
		int[][] d = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				d[i][j] = INF;
			}
		}
		for(int i=0; i<M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			d[A-1][B-1] = C;
			d[B-1][A-1] = C;
		}
		
		
		// GET INPUT END
		
		sc.close();
		
		// shori
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				for(int k=0; k<N; k++) {
					if(d[i][j] > d[i][k] + d[k][j]) {
						d[i][j] = d[i][k] + d[k][j];
						d[j][i] = d[i][j];
					}
				}
			}
		}
		int min = INF;
		for(int i=0; i<13440000; i++) {
			int temp = 0;
			Collections.shuffle(rl);
			for(int j=0; j<rl.size()-1; j++) {
				temp += d[rl.get(j)-1][rl.get(j+1)-1];
			}
			if(temp < min) {
				min = temp;
			}
		}
		System.out.println(min);
		
	}

}