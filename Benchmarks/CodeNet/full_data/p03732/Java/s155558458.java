import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		List<Integer>[] x = new ArrayList[4];
		for(int i = 0; i < 4; i++)
			x[i] = new ArrayList<>();
		int w1 = sc.nextInt();
		x[0].add(sc.nextInt());
		for(int i = 1; i < N; i++)
			x[sc.nextInt()-w1].add(sc.nextInt());
		for(int i = 0; i < 4; i++)
			Collections.sort(x[i], Collections.reverseOrder());
		int[][] S = new int[4][N+1];
		for(int i = 0; i < 4; i++) {
			for(int j = 1; j <= x[i].size(); j++) {
				S[i][j] = S[i][j-1];
				S[i][j] += x[i].get(j-1);
			}
		}		
		int ans = 0;
		for(int i = 0; i <= x[0].size(); i++)
			for(int j = 0; j <= x[1].size(); j++)
				for(int k = 0; k <= x[2].size(); k++)
					for(int l = 0; l <= x[3].size(); l++)
						if((i+j+k+l)*w1+j+k*2+l*3 <= W)
							ans = Math.max(ans, S[0][i]+S[1][j]+S[2][k]+S[3][l]);
		System.out.println(ans);
	}

}