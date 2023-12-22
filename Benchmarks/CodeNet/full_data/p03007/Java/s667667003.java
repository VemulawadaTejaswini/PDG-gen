import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main  implements Runnable {

    public static void main(String[] args) {

        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();

    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
		//long n = Long.parseLong(sc.next());
    	//int[] ar = new int[3];
    	//ar[0]=Integer.parseInt(sc.next());
    	//ar[1]=Integer.parseInt(sc.next());
    	//ar[2]=Integer.parseInt(sc.next());
    	//Arrays.parallelSort(ar);
		int n = Integer.parseInt(sc.next());
		//int k = Integer.parseInt(sc.next());
		//int q = Integer.parseInt(sc.next());
		//int r = Integer.parseInt(sc.next());
		//int a = Integer.parseInt(sc.next())-1;
		//int b = Integer.parseInt(sc.next())-1;
		//int c = Integer.parseInt(sc.next())-1;
		//int d = Integer.parseInt(sc.next())-1;
		//String s = sc.next();
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
		ArrayList<Integer> lists = new ArrayList<Integer>();
		//lists = new ArrayList;

		//int[] x = new int[n];
		int p = 0;
		int m = 0;
		for(int i = 0; i < n; i++)
		{
			lists.add(Integer.parseInt(sc.next()));
		}
		PrintWriter out = new PrintWriter(System.out);
		Collections.sort(lists);
		if(lists.get(lists.size()-1)<0)
		{
			int ans = 0;
			for(int i = 0; i < n-1; i++)
			{
				ans += -lists.get(i);
			}
			ans += +lists.get(n-1);
			out.println(ans);
			int tmp = lists.get(n-1);
			for(int i = 0; i < n-1; i++)
			{
				out.println(tmp+" "+lists.get(i));
				tmp = tmp - lists.get(i);
			}
		}
		else if(lists.get(0)>0)
		{
			int ans = 0;
			for(int i = 1; i < n; i++)
			{
				ans += +lists.get(i);
			}
			ans += -lists.get(0);
			out.println(ans);
			int tmp = lists.get(0);
			for(int i = 1; i < n-1; i++)
			{
				out.println(tmp+" "+lists.get(i));
				tmp = tmp - lists.get(i);
			}
			out.println(lists.get(n-1)+" "+tmp);
		}
		else
		{
			int flg=0;
			int pm=0;
			int ans = 0;
			for(int i = 0; i < n; i++)
			{
				if(flg==0 && lists.get(i)<0)
				{
					ans += -lists.get(i);
				}
				else
				{
					if(flg ==0)
					{
						pm = i;
						flg = 1;
					}
					ans += +lists.get(i);
				}
			}
			out.println(ans);
			int tmp = lists.get(0);
			for(int i = n-1; i > pm ; i--)
			{
				out.println(tmp+" "+lists.get(i));
				tmp = tmp - lists.get(i);
			}
			out.println(lists.get(pm)+" "+tmp);
			tmp = lists.get(pm)-tmp;
			for(int i = pm-1; i > 0 ; i--)
			{
				out.println(tmp+" "+lists.get(i));
				tmp = tmp - lists.get(i);
			}
		}





			//out.println(lists.get(0));





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