import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main  implements Runnable {
    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();

    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
/*		FastScanner sc = new FastScanner("6 6 \r\n" +
				"..#..#\r\n" +
				"......\r\n" +
				"#..#..\r\n" +
				"......\r\n" +
				".#....\r\n" +
				"....#.");*/
    	//FastScanner sc = new FastScanner("1000000000000");
		//long n = Long.parseLong(sc.next());
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		//int x2000 = Integer.parseInt(sc.next());
		//int t = Integer.parseInt(sc.next());
		//int k = 0;
		//int k = Integer.parseInt(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		//char a[][] = new char[n];
		//int atmp[] = new int[h];
		//int max= 0;
		//int blackar[][] = new int[h*w][2];
		//int p=0;
		PrintWriter out = new PrintWriter(System.out);
		//for(long i = 1; i < n; i++)
		//{
		//	if(n/i==n%i)
		//	{
		//		out.println(n + ":" + i + ":" + n/i + ":" + n%i+":"+ (n/(n%i)-1));
		//	}
		//}
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(sc.next());
		}
		int b[][] = new int[m][2];
		//int c[] = new int[m];
		for (int i = 0; i < m; i++)
		{
			b[i][1] = Integer.parseInt(sc.next());
			b[i][0] = Integer.parseInt(sc.next());
		}
		Arrays.parallelSort(a);
		Arrays.parallelSort(b, (ba, bb) -> Integer.compare(ba[0], bb[0]));
		long ans = 0l;
		int pb = 0;
		int pa = 0;
		for (int i = 0; i < n; i++)
		{
			if(pb>=m)
			{
				 ans += (long)a[n-pa-1];
				 pa++;
			}
			else if(a[n-pa-1] > b[m-pb-1][0])
			{
				ans += (long)a[n-pa-1];
				pa++;
			}
			else
			{
				 ans += (long)b[m-pb-1][0];
				 b[m-pb-1][1]--;
				 if(b[m-pb-1][1]==0)
				 {
					 pb++;
				 }
			}
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