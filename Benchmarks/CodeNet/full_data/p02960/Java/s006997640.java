import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main  implements Runnable {
	int[][] ta = new int[16][4096];
	int ptr = 0;
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 64 * 1024 * 1024).start();
    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
    	//int[] ar = new int[3];
    	//ar[0]=Integer.parseInt(sc.next());
    	//Arrays.parallelSort(ar);
		//int n = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//String s = sc.next();
		//String str = sc.next();
		//char c[] = str.toCharArray();
		//char a[][] = new char[n];
		//ArrayList<Str_4> lists = new ArrayList<Str_4>();
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
		//int[] ra = new int[r];
		//ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		String str = sc.next();
		char c[] = str.toCharArray();
		//char[] c = new char[100000];
		//Arrays.fill(c, '?');
		int[] a = new int[13];
		int[] at = new int[13];
		for(int i = 0; i < 13; i++)
		{
			a[i] = 0;
		}
		a[0] = 1;
		int base = 1;
		for(int i = c.length-1; i >= 0; i--)
		{
			if(c[i] == '?')
			{
				at = Arrays.copyOf(a, 13);
				Arrays.fill(a, 0);
				for(int j = 0; j < 10; j++)
				{
					int tmp = (j*base)%13;
					for(int k = 0; k < 13; k++)
					{
						a[(k+tmp)%13] += at[k];
						a[(k+tmp)%13] = a[(k+tmp)%13] % 1000000007;
					}
				}
			}
			else
			{
				int v = (int)(c[i] - '0');
				int tmp = (v*base)%13;
				at = Arrays.copyOf(a, 13);
				for(int k = 0; k < 13; k++)
				{
					a[(k+tmp)%13] = at[k];
				}
			}
			base = (base*10)%13;
		}
		out.println(a[5]);
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