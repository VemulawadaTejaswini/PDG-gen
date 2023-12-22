import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main  implements Runnable {
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 64 * 1024 * 1024).start();
    }
    public void run() {
    	FastScanner sc = new FastScanner(System.in);
    	int n = Integer.parseInt(sc.next());
    	int l = Integer.parseInt(sc.next());
    	int t = Integer.parseInt(sc.next());
		PrintWriter out = new PrintWriter(System.out);
		int[] x = new int[n];
		int[] w = new int[n];
		for(int i = 0; i < n; i++)
		{
			x[i] = Integer.parseInt(sc.next());
			w[i] = Integer.parseInt(sc.next());
		}
		int tmp = t % l;
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
		{
			int ans = x[i];
			if(w[i] == 1)
			{
				ans += tmp;
				ans %= l;
			}
			else
			{
				ans -= tmp;
				if(ans < 0)
				{
					ans += l;
				}
			}
			a[i] = ans;
		}

		int count = 0;
		for(int i = 1; i < n; i++)
		{
			if(w[0] != w[i])
			{
				long count_tmp = (long)(t*2)/(long)l;
				count_tmp %= n;
				count += count_tmp;
				count %= n;
				if(w[0] ==1)
				{
					int tx = x[i]-x[0];
					if(tx < 0)
					{
						tx = tx + l;
					}
					if((t*2)%l >= (tx))
					{
						count++;
					}
					if((t*2)%l >= (tx)+(l+1)/2)
					{
						//count++;
					}
				}
				else
				{
					int tx = x[0]-x[i];
					if(tx < 0)
					{
						tx = tx + l;
					}
					if((t*2)%l >= (tx))
					{
						count++;
					}
					if((t%l)*2 >= (tx)+(l+1)/2)
					{
						//count++;
					}
				}
			}
		}
		if(w[0] == 2)
		{
			count = n - count;
		}
		count %= n;
		int pos0 = a[0];
		Arrays.parallelSort(a);
		int p=0;
		int ant0pos = -1;
		while(ant0pos == -1)
		{
			if(a[p] == pos0)
			{
				if(w[0] == 1 && a[(p+1)%n] == a[p])
				{
					ant0pos=p+1;
				}
				else
				{
					ant0pos = p;
				}
			}
			p++;
		}
		for(int i = 0; i < n; i++)
		{
			int ap = (i+ant0pos-count)%n;
			if(ap < 0) {
				ap += n;
			}
			out.printf("%d\n", a[ap]);
		}
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
    }
}