import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
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
		int q = Integer.parseInt(sc.next());
		//int m = Integer.parseInt(sc.next());
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
		int mina=0;
		//int prea;
		long total = 0;
		int firsta=1;
		int anum=0;
		for (int i = 0; i < q; i++)
		{
			int qe = Integer.parseInt(sc.next());
			if (qe == 1)
			{
				int a = Integer.parseInt(sc.next());
				int b = Integer.parseInt(sc.next());
				if(firsta == 1)
				{
					mina = a;
					firsta = 0;
				}
				else
				{
					if(a < mina)
					{
						total += (long)anum*(mina-a);
						mina = a;
					}
					else
					{
						total += (long)(mina - a);
					}
				}
				anum++;
				total += (long)b;
			}
			else
			{
				out.println(mina + " " + total );
			}
		}

		//out.println(ans);
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