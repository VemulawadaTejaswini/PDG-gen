import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	static class Scanner{
		BufferedReader br=null;
		StringTokenizer tk=null;
		public Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		public String next() throws IOException{
			while(tk==null || !tk.hasMoreTokens()) {
				String cad = br.readLine();
				if (cad == null)
					return null;
				tk=new StringTokenizer(cad);
			}
			return tk.nextToken();
		}
		public int nextInt() throws NumberFormatException, IOException{
			return Integer.valueOf(next());
		}
		public long nextLong() throws NumberFormatException, IOException{
			return Long.valueOf(next());
		}
		public double nextDouble() throws NumberFormatException, IOException{
			return Double.valueOf(next());
		}
	}
	
	
	static class Block {
		int[][][] m;
		int[][][] image;
		int L;
		
		public Block(int KK) {
			m = new int[2][K][K];
			image = new int[2][K][K];
			L = KK;
		}
		void computeImage() {
			for(int k = 0; k < 2; k++) {
				for(int i = 0; i < L; i++) {
					for(int j = 0; j < L; j++) {
						image[k][i][j] = m[k][i][j];
						image[k][i][j] += get(k, i, j - 1);
						image[k][i][j] += get(k, i - 1, j);
						image[k][i][j] -= get(k, i - 1, j - 1);
					}
				}
			}
		}
		
		int get(int k, int x, int y) {
			if(x < 0 || y < 0 || x >= L || y >= L)
				return 0;
			return image[k][x][y];
		}
		
		int query(int k, int x1, int y1, int x2, int y2) {
			int ret = get(k, x2, y2);
			ret -= get(k, x2, y1 - 1);
			ret -= get(k, x1 - 1, y2);
			ret += get(k, x1 - 1, y1 - 1);
			return ret;
		}
	}
	
	static int N, K;
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		Scanner sc = new Scanner();
		N = sc.nextInt();
		K = sc.nextInt();
		Block[] a = new Block[2];
		a[0] = new Block(K);
		a[1] = new Block(K);
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = ((sc.next().charAt(0) == 'B') ? 1:0);
			int block = (x/K + y/K) % 2;
			a[block].m[c][K - 1 - (y % K)][x % K] += 1;
		}
//		for(int i = 0; i < K; i++) {
//			for(int j = 0; j < K; j++)
//				System.out.print(a[0].m[1][i][j]+" ");
//			System.out.println();
//		}
		a[0].computeImage();
		a[1].computeImage();
		int ans = a[0].query(0, 0, 0, K - 1, K - 1);
		ans += a[1].query(1, 0, 0, K - 1, K - 1);
		for(int i = 0; i < K; i++) {
			for(int j = 0; j < K; j++) {
				int tmp = a[0].query(0, 0, 0, K - 1, K - 1);
				tmp += a[0].query(1, 0, 0, i, j);
				tmp += a[0].query(1, i + 1, j + 1, K - 1, K - 1);
				tmp -= a[0].query(0, 0, 0, i, j);
				tmp -= a[0].query(0, i + 1, j + 1, K - 1, K - 1);
				
				int tmp2 = a[1].query(1, 0, 0, K - 1, K - 1);
				tmp2 += a[1].query(0, 0, 0, i, j);
				tmp2 += a[1].query(0, i + 1, j + 1, K - 1, K - 1);
				tmp2 -= a[1].query(1, 0, 0, i, j);
				tmp2 -= a[1].query(1, i + 1, j + 1, K - 1, K - 1);
				
				ans = Math.max(ans, tmp + tmp2);
			}
		}
		System.out.println(ans);
	}

}
