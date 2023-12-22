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
		//long n = Long.parseLong(sc.next());
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next())-1;
		int b = Integer.parseInt(sc.next())-1;
		int c = Integer.parseInt(sc.next())-1;
		int d = Integer.parseInt(sc.next())-1;
		String s = sc.next();
		//int k = Integer.parseInt(sc.next());
		//int m = Integer.parseInt(sc.next());
		//int x2000 = Integer.parseInt(sc.next());
		//int t = Integer.parseInt(sc.next());
		//int k = 0;
		//int k = Integer.parseInt(sc.next());
		///String str = sc.next();
		//char c[] = str.toCharArray();
		//char a[][] = new char[n];
		//int atmp[] = new int[h];
		//int max= 0;
		//int blackar[][] = new int[h*w][2];
		//int p=0;
		//ArrayList<MyClass> lists = new ArrayList<>();;
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
		char ar[] = s.toCharArray();
		int ans = 0;
		if(d <  c)
		{

			int crnt = 0;
			for(int i = a; i < c; i++)
			{
				if(ar[i]=='#' && crnt == 0) 
				{
					crnt = 1;

				}
				else if(ar[i]=='#' && crnt == 1) 
				{
					ans = 1;
				}
				else
				{
					crnt = 0;

				}
			}
			int max_space = 0;
			int space = 0;
			crnt = 0;
			for(int i = b-1; i < d; i++)
			{
				if(ar[i]=='#' && crnt == 0) 
				{
					crnt = 1;
					space = 0;
				}
				else if(ar[i]=='#' && crnt == 1) 
				{
					ans = 1;
					space = 0;
				}
				else
				{
					crnt = 0;
					space++;
				}
				if(space > max_space) 
				{
					max_space = space;
				}
			}
			if(max_space < 3)
			{
				ans = 1;
			}
		}
		else
		{
			int crnt = 0;
			for(int i = a; i < c; i++)
			{
				if(ar[i]=='#' && crnt == 0) 
				{
					crnt = 1;
				}
				else if(ar[i]=='#' && crnt == 1) 
				{
					ans = 1;
				}
				else
				{
					crnt = 0;
				}
			}
			crnt = 0;
			for(int i = b; i < d; i++)
			{
				if(ar[i]=='#' && crnt == 0) 
				{
					crnt = 1;
				}
				else if(ar[i]=='#' && crnt == 1) 
				{
					ans = 1;
				}
				else
				{
					crnt = 0;
				}
			}
		}
		
		//ArrayList<Integer> listA = new ArrayList();
		//listA.add(new int());
		//list.add(listA);
		if(ans == 0)
		{
			out.println("Yes");
		}
		else
		{
			out.println("No");
		}
		
		out.flush();
	}
    void nar (int ln)
    {

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