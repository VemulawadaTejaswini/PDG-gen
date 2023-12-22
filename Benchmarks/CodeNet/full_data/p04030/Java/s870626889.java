import java.util.*;
import java.io.*;
import java.math.*;
class Main {

	public static void main(String[] args) {
		FastScanner I=new FastScanner();
		Output O=new Output();
		String s=I.next();
		Stack<Character> cur=new Stack<Character>();
		Stack<Character> ans=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1') cur.push('1');
			else if(s.charAt(i)=='0') cur.push('0');
			else if(s.charAt(i)=='B' && cur.size()>0) cur.pop();
		}
		while(!cur.empty()) {
			ans.add(cur.pop());
		}
		while(!ans.empty()) {
			O.p(ans.pop());
		}
		
		System.out.println();
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());};
	}

	static class Output{
		PrintWriter w=new PrintWriter(System.out);
		void pln(int x) {w.println(x); w.flush();}
		void pln(long x) {w.println(x); w.flush();}
		void pln(String x) {w.println(x); w.flush();}
		void pln(char x) {w.println(x); w.flush();}
		void pln(StringBuilder x) {w.println(x); w.flush();}
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
	}
		
}
