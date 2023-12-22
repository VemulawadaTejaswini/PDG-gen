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
        Thread tt = new Thread(null, new Main(), "", 256 * 1024 * 1024);
        tt.start();
    }

    public void run() {
    	FastScanner sc = new FastScanner(System.in);
    	//int[] ar = new int[3];
    	//ar[0]=Integer.parseInt(sc.next());
    	//Arrays.parallelSort(ar);
		//int n = Integer.parseInt(sc.next());
		//int q = Integer.parseInt(sc.next());
		//long a = Long.parseLong(sc.next());
		//String s = sc.next();
		String str = sc.next();
		char s[] = str.toCharArray();
		String str2 = sc.next();
		char t[] = str2.toCharArray();
		//char a[][] = new char[n];
		//ArrayList<Str_4> lists = new ArrayList<Str_4>();
		//lists = new ArrayList;
		ArrayList<ArrayList<Integer>> tmp = new ArrayList<>();
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < 26; i++) {
			tmp.add(new  ArrayList<Integer>());
		}
		for (int i = 0; i < s.length; i++) {
			tmp.get(s[i]-'a').add(i);
		}
		long n = (long)s.length;
		int not = 0;
		long ans = 0;
		long cv = -1;
		for (int i = 0; i < t.length; i++) {
			if(tmp.get(t[i]-'a').size() == 0)
			{
				not = 1;
			}
			else {
				cv += bs(tmp.get(t[i]-'a'), cv, n);
				if(cv >= n)
				{
					cv -= n;
					ans += n;
				}
			}
		}
		ans += cv;
		if(not != 1)
		{
			out.println(ans+1);
		}else {
			out.println(-1);
		}
		out.flush();
    }
    long bs (ArrayList<Integer> ar, long cv, long n)
    {
    	long ans = 0;
    	int min = 0;
    	int max = ar.size() -1;
    	if(ar.size()==1)
    	{
    		if(ar.get(0) > cv)
    		{
    			ans = ((long)ar.get(0)) - cv;
    		}
    		else {
    			ans = ((long)ar.get(0)) - cv + n;
			}
    	}
    	else {
    		if(ar.get(max) <= cv)
    		{
    			ans = ((long)ar.get(0)) - cv + n;
    		}
    		else if (ar.get(min) > cv){
    			ans = ((long)ar.get(0)) - cv;
			}
    		else {
    			int cp = 0;
    			while((ar.get(cp) <= cv && cv < ar.get(cp+1)) != true )
    			{
    				cp = (max + min)/2;
    				if(ar.get(cp) > cv)
    				{
    					max = cp;
    				}
    				else {
						min = cp;
					}
    			}
    			ans = ((long)ar.get(cp + 1)) - cv;
			}
		}
    	return ans;
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