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
		ArrayList<MyClass> lists = new ArrayList<MyClass>();
		//lists = new ArrayList;

		int[][] xy = new int[n][2];
		for(int i = 0; i < n; i++)
		{
			xy[i][0]=Integer.parseInt(sc.next());
			xy[i][1]=Integer.parseInt(sc.next());
		}

		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				lists.add(new MyClass(xy[i][0]-xy[j][0],xy[i][1]-xy[j][1]));
			}
		}
		int max = 1;
		while(lists.size()!=0)
		{
			int x = lists.get(0).x;
			int y = lists.get(0).y;
			int cn = 1;
			lists.remove(0);
			for(int i = lists.size()-1; i >= 0; i--)
			{
				if(lists.get(i).x == x && lists.get(i).y == y)
				{
					cn++;
					lists.remove(i);
				}
				else if(lists.get(i).x == -x && lists.get(i).y == -y)
				{
					cn++;
					lists.remove(i);
				}
			}
			if(cn > max)
			{
				max = cn;
			}
		}

		PrintWriter out = new PrintWriter(System.out);
		if(n==1)
		{
			out.println(1);
		}
		else
		{
			out.println(n-max);
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


class MyClass {
	int x;
    int y;

    public MyClass(int x, int y) {
    	this.x = x;
        this.y = y;
    }

}
