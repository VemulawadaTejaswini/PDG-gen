import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Main  implements Runnable {
	int[][] ta = new int[16][4096];
	int ptr = 0;
    public static void main(String[] args) {

        new Thread(null, new Main(), "", 64 * 1024 * 1024).start();

    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
		//long n = Long.parseLong(sc.next());
    	//int[] ar = new int[3];
    	//ar[0]=Integer.parseInt(sc.next());
    	//Arrays.parallelSort(ar);
		int n = Integer.parseInt(sc.next());
		//int m = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//long b = Long.parseLong(sc.next());
		//int l = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//String s = sc.next();
		//int k = Integer.parseInt(sc.next());
		//int m = Integer.parseInt(sc.next());
		//int x2000 = Integer.parseInt(sc.next());
		//int t = Integer.parseInt(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		//char a[][] = new char[n];
		//int atmp[] = new int[h];
		//int max= 0;
		//int blackar[][] = new int[h*w][2];
		//int p=0;
		//ArrayList<Str_4> lists = new ArrayList<Str_4>();
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
		//int[] ra = new int[r];
		//ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		int[] a = new int[n];
		for (int i = 0; i < n; i++){
			 a[i] = Integer.parseInt(sc.next());
		}
		int ans_num = 0;
		int[] ans = new int[n];
		for (int i = n/2+1; i < n; i++){
			ans[i] = a[i];
			if(a[i] == 1)
			{
				ans_num++;
			}
		}

		for (int i = n/2; i >= 0; i--){
			int tmp =0;
			tmp = a[i];
			for(int j = 2; j*(i+1)-1 < n; j++)
			{
				tmp = tmp + ans[j*(i+1)-1];
			}
			ans[i]= tmp%2;
			if(tmp%2 == 1)
			{
				ans_num++;
			}
		}
		out.println(ans_num);
		for (int i = 0; i < n; i++){
			 if(ans[i]==1)
			 {
				 out.print(i+1 + " ");
			 }
		}
		out.println();
		out.flush();
    }

    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
        public FastScanner(String in) {
        	StringReader sr = new StringReader(in);
            reader = new BufferedReader(new BufferedReader(sr));
            tokenizer = null;
        }
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long nextInt() {
            return Integer.parseInt(next());
        }

    }


}