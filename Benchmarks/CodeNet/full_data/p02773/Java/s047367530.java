import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	static class Pair {
		public int x, y, id;
		public Pair() {
			x = y = 0;
		}
		public Pair(int x, int y, int i) {
			this.x = x;
			this.y = y;
			id = i;
		}
	}
	
	public static void main(String[] args) throws IOException {

		InputReader in = new InputReader(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = in.nextInt();
		String s;
		Map<String,Integer> mp=new HashMap<>();
		int y = 0;
		Vector<String>ans=new Vector<String>();
		for(int i=0;i<n;i++) {
			s = in.next();
		    if(mp.containsKey(s)) {
		    	int x = mp.get(s) + 1;
		    	mp.put(s,x);
		    	if(x>y) {
		    		ans.clear();
		    		ans.add(s);
		    		y=x;
		    	}
		    	else if(x==y) {
		    		ans.add(s);
		    	}
		    }else {
		    	mp.put(s,1);
		    	if(1>y) {
		    		y = 1;
		    		ans.add(s);
		    	}else if(1==y) {
		    		ans.add(s);
		    	}
		    }
		}
		Collections.sort(ans);
		for(String _s: ans) {
			out.println(_s);
		}
		out.flush();

	}

	static class InputReader {
		StreamTokenizer tokenizer;

		public InputReader(InputStream stream) {
			tokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(stream)));
			tokenizer.ordinaryChars(33, 126);
			tokenizer.wordChars(33, 126);
		}

		public String next() throws IOException {
			tokenizer.nextToken();
			return tokenizer.sval;
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean hasNext() throws IOException {
			int res = tokenizer.nextToken();
			tokenizer.pushBack();
			return res != StreamTokenizer.TT_EOF;
		}
	}

}
