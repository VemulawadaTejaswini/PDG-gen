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
		String str = sc.next();
		char c[] = str.toCharArray();
		//char a[][] = new char[n];
		//ArrayList<Str_4> lists = new ArrayList<Str_4>();
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
		//int[] ra = new int[r];
		//ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		int n = c.length;
		int[] ans = new int [n];
		Arrays.fill(ans, 0);
		int o = 0;
		int e = 0;
		int inv = 0;
		for(int i = 0; i < n; i++)
		{
			if(c[i] == 'R')
			{
				if(inv == 0)
				{
					o++;
					inv = 1;
				}
				else
				{
					e++;
					inv = 0;
				}
			}
			else
			{
				if(inv == 0)
				{
					ans[i-1] += e;
					ans[i-0] += o;
				}
				else
				{
					ans[i-1] += o;
					ans[i-0] += e;
				}
				inv = 0;
				o = 0;
				e = 0;
			}
		}
		for(int i = n-1; i >= 0; i--)
		{
			if(c[i] == 'L')
			{
				if(inv == 0)
				{
					o++;
					inv = 1;
				}
				else
				{
					e++;
					inv = 0;
				}
			}
			else
			{
				if(inv == 0)
				{
					ans[i+1] += e;
					ans[i+0] += o;
				}
				else
				{
					ans[i+1] += o;
					ans[i+0] += e;
				}
				inv = 0;
				o = 0;
				e = 0;
			}
		}
		
		//out.println(a[5]);
		for(int i = 0; i < n; i++)
		{
			out.print(ans[i]);
			out.print(" ");
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