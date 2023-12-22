import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main {
	
	static class Scanner{
		BufferedReader br=null;
		StringTokenizer tk=null;
		public Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		public String next() throws IOException{
			while(tk==null || !tk.hasMoreTokens()) {
				String cad = br.readLine();
				if (cad == null)
					return null;
				tk=new StringTokenizer(cad);
			}
			return tk.nextToken();
		}
		public int nextInt() throws NumberFormatException, IOException{
			return Integer.valueOf(next());
		}
		public long nextLong() throws NumberFormatException, IOException{
			return Long.valueOf(next());
		}
		public double nextDouble() throws NumberFormatException, IOException{
			return Double.valueOf(next());
		}
	}
	
	static class Node {
		int color;
		LinkedList<Integer> v;
		public Node() {
			color = -1;
			v = new LinkedList<Integer>();
		}
	}
	
	static boolean color(int index, int color) {
		if (array[index].color >= 0)
			return array[index].color == color;
		array[index].color = color;
		for(int e: array[index].v)
			if (!color(e, (color + 1) % 2))
				return false;
		return true;
	}
	
	static int N, M;
	static Node[] array;
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		Scanner sc = new Scanner();
		N = sc.nextInt();
		M = sc.nextInt();
		array = new Node[N];
		for(int i = 0; i < N; i++)
			array[i] = new Node();
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			array[a].v.add(b);
			array[b].v.add(a);
		}
		long ans;
		if (color(0, 0)) {
			long count[] = new long[2];
			for(Node e : array)
				count[e.color]++;
			ans = count[0] * count[1] - M;
		}
		else
			ans = (N * (N - 1L))/2 - M;
		System.out.println(ans);
		
	}

}
