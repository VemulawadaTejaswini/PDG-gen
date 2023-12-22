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
    	int n = Integer.parseInt(sc.next());
    	//int k = Integer.parseInt(sc.next());
    	//char a[]= sc.next().toCharArray();
		//ArrayList<Long> ttest = new ArrayList<Long>();
		//ttest.add(n);
		//int b = Integer.parseInt(sc.next());
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
		int n0 = n / 100;
		int n1 = n % 100;
		int n0m = 0;
		if(n0 <= 12 && n0 >= 1)
		{
			n0m = 1;
		}
		int n1m = 0;
		if(n1 <= 12 && n1 >= 1)
		{
			n1m = 1;
		}
		String s;
		if(n0m==1 && n1m==1)
		{
			s="AMBIGUOUS";
		}
		else if (n0m==1)
		{
			s="MMYY";
		}
		else if (n1m==1)
		{
			s="YYMM";
		}
		else
		{
			s="NA";
		}
		//for(long i = 1; i < n; i++)
		//{
		//	if(n/i==n%i)
		//	{
		//		out.println(n + ":" + i + ":" + n/i + ":" + n%i+":"+ (n/(n%i)-1));
		//	}
		//}


//N=(N%M)*M
//a=N%M
//a+Ma=N =1+M=N/a
    	//a[k-1] = Character.toLowerCase(a[k-1]);
		out.println(s);
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