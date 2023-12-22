import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		FastScanner br = new FastScanner();
		ArrayList<Integer> caca = new ArrayList<Integer>();
		ArrayList<Integer> caca2 = new ArrayList<Integer>();
		int n1 = br.ni();
		int n2 = br.ni();
		String n = br.nt();
		int ind = 0;
		caca.add(1);
		for(int i = 0;i<n.length()-1;i++) {
			if(n.charAt(i)==n.charAt(i+1)) {
				caca.set(ind,caca.get(ind)+1);
			} else {
				caca.add(1);
				ind++;
			}
		}boolean[] r = new boolean[caca.size()];
		int mol = 0;
		if(n.charAt(0)=='1')mol=0;
		else mol=1;
		for(int i = 0;i<caca.size();i++) {
			if(i%2==mol) {r[i]=true;caca2.add(caca.get(i));}
			else r[i]=false;
		}
		
		if(n2==0) {System.out.println(Collections.max(caca2));System.exit(0);}
		if(caca.size()==1) {System.out.println(caca.get(0));System.exit(0);}
		if(caca.size()==2) {System.out.println(caca.get(1)+caca.get(0));System.exit(0);}
		if(caca.size()==3&!r[0]) {
			if(n2>1)System.out.println(caca.get(0)+caca.get(1)+caca.get(2));
			else if(n2==1)System.out.println(Math.max(caca.get(0)+caca.get(1), caca.get(1)+caca.get(2)));
			System.exit(0);
		}
		
		int max = 0;
		int sit = 0;
		while(n2-->0) {
			for(int i = 0;i<caca.size()-2;i++) {
				if(r[i]) {
					if(max<caca.get(i)+caca.get(i+1)+caca.get(i+2)) {
						max = caca.get(i)+caca.get(i+1)+caca.get(i+2);
						sit = i;
					}
				}
			}
			caca.remove(sit+2);
			caca.remove(sit+1);
			caca.set(sit, max);
			caca2.add(max);
			if(n2==0) {System.out.println(Collections.max(caca2));System.exit(0);}
			if(caca.size()==1) {System.out.println(caca.get(0));System.exit(0);}
			if(caca.size()==2) {System.out.println(caca.get(1)+caca.get(0));System.exit(0);}
			if(caca.size()==3&!r[0]) {
				if(n2>1)System.out.println(caca.get(0)+caca.get(1)+caca.get(2));
				else if(n2==1)System.out.println(Math.max(caca.get(0)+caca.get(1), caca.get(1)+caca.get(2)));
				System.exit(0);
			}
		}
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