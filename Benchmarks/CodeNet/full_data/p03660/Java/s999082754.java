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

        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();

    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
		//long n = Long.parseLong(sc.next());
    	//int[] ar = new int[3];
    	//ar[0]=Integer.parseInt(sc.next());
    	//Arrays.parallelSort(ar);
		int n = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//long b = Long.parseLong(sc.next());
		//int l = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//String s = sc.next();
		//int k = Integer.parseInt(sc.next());
		//int m = Integer.parseInt(sc.next());
		//int x2000 = Integer.parseInt(sc.next());
		//int t = Integer.parseInt(sc.next());
		//String str = sc.next();
		//char c[] = str.toCharArray();
		//char a[][] = new char[n];
		//int atmp[] = new int[h];
		//int max= 0;
		//int blackar[][] = new int[h*w][2];
		//int p=0;
		//ArrayList<Str_4> lists = new ArrayList<Str_4>();
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
		//int[] ra = new int[r];
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		ArrayList<ArrayList<Integer>> lists2 = new ArrayList<>();
		for (int i = 0; i < n; i++){
			lists.add(new ArrayList<Integer>());
			lists2.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < n-1; i++){
			int a = Integer.parseInt(sc.next())-1;
			int b = Integer.parseInt(sc.next())-1;
			lists.get(a).add(b);
			lists.get(b).add(a);
			lists2.get(a).add(b);
			lists2.get(b).add(a);}

		int[] cn = new int[n];
		int[] cn2 = new int[n];
		sl(0,   0,   0, lists, cn);
		sl(0, n-1, n-1, lists2, cn2);
		int fn=0;
		int sn=0;
		for (int i = 0; i < n; i++){
			if(cn[i] <= cn2[i])
			{
				fn++;
			}
			else
			{
				sn++;
			}
		}
		if(fn>sn)
		{
			out.println("Fennec");
		}
		else
		{
			out.println("Snuke");
		}
		out.flush();
    }
    void sl(int cv, int ci, int pci, ArrayList<ArrayList<Integer>> lists, int[] cn)
    {
    	cn[ci]=cv;
		for(int i=0; i<lists.get(ci).size(); i++)
		{
			if(lists.get(ci).get(i)==pci)
			{
				lists.get(ci).remove(i);
			}
		}
		for(int i=0; i<lists.get(ci).size(); i++)
		{
			sl(cv+1, lists.get(ci).get(i), ci, lists, cn);
		}
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