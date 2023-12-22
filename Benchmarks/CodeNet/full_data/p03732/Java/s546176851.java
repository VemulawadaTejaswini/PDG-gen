import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args){
        int N;
        int W;
        FastScanner fs = new FastScanner();
        N = fs.nextInt();
        W = fs.nextInt();
        int[]  v = new int[N+1];
        int[]  w = new int[N+1];
        int[][] G = new int[N+1][W+1];
        long[][] C = new long[N+1][W+1];

        v[0] = 0;
        w[0] = 0;
        //値を取得
        for(int i=1;i<=N;i++){
          w[i] = fs.nextInt();
          v[i] = fs.nextInt();
        }
        //初期化
        for(int i=0;i<=W;i++){
          C[0][i] = 0;
          G[0][i] = 1;
        }
        for(int i=1;i<=N;i++) C[i][0] = 0;

       for(int i=1;i<=N;i++){
          for(int j=1;j<=W;j++){
            C[i][j] = C[i-1][j];
            G[i][j] = 0;
            if(w[i] > j) continue;
              C[i][j] = Math.max(v[i] + C[i-1][j-w[i]],C[i-1][j]);
              G[i][j]=1;

          }
        }

      /*  for(int i=0;i<=N ; i++){
          for(int j=0;j<=W ; j++){
            System.out.print(C[i][j]);
          }
          System.out.println();
        }*/
        System.out.println(C[N][W]);


    }
}

class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String nextToken() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		String nextLine(){
			String line = "";
			try{
				line = br.readLine();
			}catch(IOException e){
				e.printStackTrace();
			}
			return line;
		}

		int nextInt() {
			return Integer.parseInt(nextToken());
		}

		long nextLong() {
			return Long.parseLong(nextToken());
		}

		double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}
