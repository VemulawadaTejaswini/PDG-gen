import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n=sc.nextInt();
		int []a=new int [n];
		TreeMap<Integer,Integer>map=new TreeMap();
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt()*-1;
			map.put(a[i],0);
		}
		int id=1;
		for(int x:map.keySet())
			map.put(x,id++);
		FenwickTree tree=new FenwickTree(n);
		int ans=0;
		for(int i=0;i<n;i++) {
			int curr=tree.query(map.get(a[i]))+1;
			ans=Math.max(ans, curr);
			tree.update(map.get(a[i]), curr);
		}
		out.println(ans);
		out.close();

	}
	static class FenwickTree{
		int []bit;
		FenwickTree(int n){
			bit=new int [n+1];
		}
		void update(int idx,int v) {
			while(idx<bit.length) {
				bit[idx]=Math.max(bit[idx], v);
				idx+=(idx&-idx);
			}
		}
		int query(int idx) {
			int ans=0;
			while(idx>0) {
				ans=Math.max(ans, bit[idx]);
				idx-=(idx&-idx);
			}
			return ans;
		}
	}
	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

}