import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main  implements Runnable {
	long M = 1000000007;
	long[] fac = new long[300001];
	long[] ifac = new long[300001];
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
		//long r = Long.parseLong(sc.next());
		//int l = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//String s = sc.next();
		//int k = Integer.parseInt(sc.next());
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
		ArrayList<Str_4> lists = new ArrayList<Str_4>();
		//lists = new ArrayList;
		PrintWriter out = new PrintWriter(System.out);
        ArrayList<String> cl = new ArrayList<>();
        cl.add("a");
        cl.add("g");
        cl.add("c");
        cl.add("t");
        for (String s : cl) 
        {
        	lists.add(new Str_4(s,1));
        }
        for(int i =1; i < n; i++)
        {
        	ArrayList<Str_4> lists_tmp = new ArrayList<Str_4>();
        	for(Str_4 s4: lists)
        	{
	            for (String s : cl) 
	            {
	            	if(ok(s4.s+s))
	            	{
	            		lists_tmp.add(new Str_4(s4.s+s,s4.n));
	            	}
	            	else
	            	{
	            		lists_tmp.add(new Str_4(s4.s+s,0));
	            	}
	            }
        	}
        	ArrayList<String> slist= new ArrayList<>();
        	for(Str_4 s4: lists_tmp)
        	{
        		if(s4.s.length()>=4)
        		{
        			s4.s = s4.s.substring(1);
        		}
        		slist.add(s4.s);
        	}
        	ArrayList<String> slist2 = new ArrayList<String>(new HashSet<>(slist));
        	ArrayList<Str_4> lists_tmp2 = new ArrayList<Str_4>();
        	for(String s: slist2)
        	{
        		int totaln = 0;
            	for(Str_4 s4: lists_tmp)
            	{
            		if(s4.s.contentEquals(s))
            		{
            			totaln += s4.n;
            			totaln = totaln%(int)M;
            		}
            	}
            	lists_tmp2.add(new Str_4(s,totaln));
        	}
        	lists = lists_tmp2;
        }
        int ans = 0;
        for(Str_4 s4: lists)
        {
        	ans += s4.n;
        	ans = ans%(int)M;
        }
		out.println(ans);
		out.flush();
	}
    boolean ok (String s)
    {
    	if (
    			s.matches(".*agc.*")  || 
    			s.matches("a.gc") || 
    			s.matches("ag.c") || 
    			s.matches(".*acg.*")  ||
    			s.matches(".*gac.*") 
    		)
    	{
    		return false;
    	}
    	else
    	{
    		return true;
    	}
    }
    long mpow(long x, long n){
        long ans = 1;
        while(n != 0){
            if(n%2==1) ans = ans*x % M;
            x = x*x % M;
            n = n >> 1;
        }
        return ans;
    }

    long comb(long a, long b){ //aCbをmod計算
        if(a == 0 && b == 0)return 1;
        if(a < b || a < 0)return 0;
        long tmp = ifac[(int)(a-b)]* ifac[(int)b] % M;
        return tmp * fac[(int)a] % M;
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
class Str_4 {
	String s;
	int n;
	Str_4(String ts, int tn)
	{
		s = ts;
		n = tn;
	}
}