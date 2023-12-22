import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main  implements Runnable { //Runnableを実装する

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行

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
    	//FastScanner sc = new FastScanner("9 BEWPVCRWH ZZNQYIJX BAVREA PA HJMYITEOX BCJHMRMNK BP QVFABZ PRGKSPUNA");
		int n = Integer.parseInt(sc.next());
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
		int la = 0;
		int fb = 0;
		int fbla = 0;
		String a;
		int ans =0;
		for(int i =0; i<n; i++)
		{
			a= sc.next();
			int l = a.length();
			char[] c = a.toCharArray();
			//int l = 5;
			//char[] c = "BCCCA".toCharArray();
			if(c[0]=='B' && c[l-1]=='A')
			{
				fbla++;
			}
			if(c[l-1]=='A')
			{
				la++;
			}
			if(c[0]=='B')
			{
				fb++;
			}
			for (int j = 1; j < l; j++)
			{
				if(c[j-1]=='A' && c[j] == 'B')
				{
					ans++;
				}
			}
		}
		la = la-fbla;
		fb = fb-fbla;
		if(fbla > 0)
		{
			ans += fbla -1;
			if(la > 0)
			{
				ans++;
				la--;
			}
			if(fb > 0)
			{
				ans++;
				fb--;
			}
			if(la<fb)
			{
				ans += la;
			}
			else
			{
				ans += fb;
			}
		}
		else
		{
			if(la<fb)
			{
				ans += la;
			}
			else
			{
				ans += fb;
			}
		}


		PrintWriter out = new PrintWriter(System.out);
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