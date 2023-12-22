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
		int n = Integer.parseInt(sc.next());
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
		String[] ss = new String[n];
		for(int i = 0; i < n; i++)
		{
			String str = sc.next();
			char c[] = str.toCharArray();
			Arrays.parallelSort(c);
			ss[i] = new String(c);
		}
		Arrays.parallelSort(ss);
		int preeq = 0;
		int eqlen = 0;
		long ans = 0;
		for(int i = 1; i < n; i++)
		{
			if(ss[i].contentEquals(ss[i-1]))
			{
				if(preeq == 0)
				{
					eqlen = 2;
				}
				else
				{
					eqlen++;
				}
				preeq = 1;
			}
			else
			{
				if(preeq == 1)
				{
					ans += (long)((eqlen*(eqlen-1))/2);
				}
				preeq = 0;
			}
		}
		if(preeq == 1)
		{
			ans += (long)((eqlen*(eqlen-1))/2);
		}
		out.println(ans);
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