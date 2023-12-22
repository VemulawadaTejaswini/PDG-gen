import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		FastScanner br = new FastScanner();
		Map<String, Byte> map = new HashMap<String, Byte>();
		int n = br.ni();
		int n2 = br.ni();
		int m, m2;
		for(int i = br.ni();i>0;i--) {
			m = br.ni();
			m2 = br.ni();
			if(m<=n-2&m2<=n2-2)map.put(m+" "+m2,(byte) (map.getOrDefault(m+" "+m2, (byte) 0)+1));
			if(m>1&m<=n-1&m2<=n2-2) map.put((m-1)+" "+m2,(byte) (map.getOrDefault((m-1)+" "+m2, (byte) 0)+1));
			if(m>2&m2<=n2-2) map.put((m-2)+" "+m2,(byte) (map.getOrDefault((m-2)+" "+m2, (byte) 0)+1));
			if(m2>1&m<=n-2&m2<=n2-1) map.put(m+" "+(m2-1),(byte) (map.getOrDefault(m+" "+(m2-1), (byte) 0)+1));
			if(m2>2&m<=n-2) map.put(m+" "+(m2-2),(byte) (map.getOrDefault(m+" "+(m2-2), (byte)0)+1));
			if(m>1&m2>1&m<=n-1&m2<=n2-1) map.put((m-1)+" "+(m2-1),(byte) (map.getOrDefault((m-1)+" "+(m2-1), (byte)0)+1));
			if(m>2&m2>2) map.put((m-2)+" "+(m2-2),(byte) (map.getOrDefault((m-2)+" "+(m2-2), (byte) 0)+1));
			if(m>1&m2>2&m<=n-1) map.put((m-1)+" "+(m2-2),(byte) (map.getOrDefault((m-1)+" "+(m2-2), (byte) 0)+1));
			if(m>2&m2>1&m2<=n2-1) map.put((m-2)+" "+(m2-1),(byte) (map.getOrDefault((m-2)+" "+(m2-1), (byte) 0)+1));
		}
		long[] cc = new long[9];
		for (byte value : map.values()) {
		    if(value==1)cc[0]++;
		    if(value==2)cc[1]++;
		    if(value==3)cc[2]++;
		    if(value==4)cc[3]++;
		    if(value==5)cc[4]++;
		    if(value==6)cc[5]++;
		    if(value==7)cc[6]++;
		    if(value==8)cc[7]++;
		    if(value==9)cc[8]++;
		}
		System.out.println((long)(n-2)*(n2-2)-cc[0]-cc[1]-cc[2]-cc[3]-cc[4]-cc[5]-cc[6]-cc[7]-cc[8]);
		for(int i = 0;i<9;i++)System.out.println(cc[i]);
	}
}

class FastScanner {
	BufferedReader br;
	StringTokenizer st;

	public FastScanner(String s) {
		try {
			br = new BufferedReader(new FileReader(s));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public FastScanner() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	ArrayList<Integer>[] ng(int n, int e) {
		ArrayList<Integer>[] adj = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < e; i++) {
			int a = ni() - 1;
			int b = ni() - 1;
			adj[a].add(b);
			adj[b].add(a);
		}
		return adj;
	}

	Integer[] nIa(int n) {
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = ni();
		}
		return arr;
	}

	int[] nia(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = ni();
		}
		return arr;
	}

	Long[] nLa(int n) {
		Long[] arr = new Long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = nl();
		}
		return arr;
	}

	long[] nla(int n) {
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = nl();
		}
		return arr;
	}

	String[] nsa(int n) {
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = nt();
		}
		return arr;
	}

	String nt() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int ni() {
		return Integer.parseInt(nt());
	}

	long nl() {
		return Long.parseLong(nt());
	}

	double nd() {
		return Double.parseDouble(nt());
	}

}