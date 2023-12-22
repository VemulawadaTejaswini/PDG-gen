import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		PriorityQueue<pair> first = new PriorityQueue<>();
		PriorityQueue<pair2> second = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			first.add(new pair(a, b, i));
			second.add(new pair2(a, b, i));
		}
		long ans1 = 0;
		long ans2 = 0;
		HashSet<Integer> taken = new HashSet<>();
		boolean turn = false;
		for (int i = 0; i < n; i++) {
			if(!turn) {
				pair cur = null;
				while(true){
				cur = first.poll();
				if(!taken.contains(cur.indx))
					break;
				}
				ans1+=cur.a;
				taken.add(cur.indx);
				turn = true;
			}
			else if(turn) {
				pair2 cur = null;
				while(true){
				cur = second.poll();
				if(!taken.contains(cur.indx))
					break;
				}
				ans2+=cur.b;
				taken.add(cur.indx);
				turn = false;
			}
		}
		System.out.println(ans1-ans2);
		
	}
	static class pair implements Comparable{
		int a;
		int b;
		int indx;
		public pair(int a1,int b1, int i) {
			a= a1;
			b= b1;
			indx = i;
		}
		public int compareTo(Object o) {
			pair cur = (pair) o; 
			if(cur.a != this.a)
				return cur.a - this.a;
			return cur.b - this.b;
	}
}
		static class pair2 implements Comparable{
			int a;
			int b;
			int indx;
			public pair2(int a1,int b1,int i) {
				a= a1;
				b= b1;
				indx = i;
			}
			public int compareTo(Object o) {
				pair2 cur = (pair2) o; 
				if(cur.b != this.b)
					return cur.b - this.b;
				return cur.a - this.a;
			}
		}

}

class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream system) {
		br = new BufferedReader(new InputStreamReader(system));
	}

	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	public char nextChar() throws IOException {
		return next().charAt(0);
	}

	public Long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	public boolean ready() throws IOException {
		return br.ready();
	}

	public void waitForInput() throws InterruptedException {
		Thread.sleep(3000);
	}

}
