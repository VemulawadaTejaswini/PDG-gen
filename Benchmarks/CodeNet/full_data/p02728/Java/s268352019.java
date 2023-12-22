import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static final long mod=1_000_000_007;
	static long[] facts;
	static long[] factInvs;

	public static void main(String[] args) {
		precomp();
		FastScanner fs=new FastScanner();
		int n=fs.nextInt();
		Node[] nodes=new Node[n];
		for (int i=0; i<n; i++) nodes[i]=new Node(i);
		for (int i=1; i<n; i++) {
			int a=fs.nextInt()-1, b=fs.nextInt()-1;
			nodes[a].adj.add(nodes[b]);
			nodes[b].adj.add(nodes[a]);
		}
		nodes[0].dfs0(null);
		nodes[0].dfs1(0, 1);
		for (int i=0; i<n; i++) {
			System.out.println(nodes[i].waysEveryone);
		}
		System.out.println();
	}

	static class Node {
		ArrayList<Node> adj=new ArrayList<>();
		int subtreeSize, index;
		long waysRooted;
		long waysEveryone;
		
		public Node(int index) {
			this.index=index+1;
		}

		public void dfs0(Node par) {
			if (par!=null) adj.remove(par);
			subtreeSize=0;
			waysRooted=1;
			for (Node nn:adj) {
				nn.dfs0(this);
				subtreeSize+=nn.subtreeSize;
				waysRooted=mul(waysRooted, nn.waysRooted);
				waysRooted=mul(waysRooted, factInvs[nn.subtreeSize]);
			}
			waysRooted=mul(waysRooted, facts[subtreeSize]);
//			System.out.println("At node: "+index+" waysRooted: "+waysRooted);
			subtreeSize++;
		}
		
		public void dfs1(int fatherSubtreeSize, long fatherWays) {
//			System.out.println("At node: "+index+" fatherSubtreeSize: "+fatherSubtreeSize+" fatherWays: "+fatherWays);
			subtreeSize--;
			waysEveryone=mul(waysRooted, factInvs[subtreeSize]);
			subtreeSize+=fatherSubtreeSize;
			waysEveryone=mul(waysEveryone, fatherWays);
			waysEveryone=mul(waysEveryone, factInvs[fatherSubtreeSize]);
			waysEveryone=mul(waysEveryone, facts[subtreeSize]);
			for (Node nn:adj) {
				fatherSubtreeSize=subtreeSize+1-nn.subtreeSize;
				fatherWays=mul(waysEveryone, factInvs[subtreeSize]);
				fatherWays=mul(fatherWays, facts[subtreeSize-nn.subtreeSize]);
				fatherWays=mul(fatherWays, facts[nn.subtreeSize]);
				fatherWays=mul(fatherWays, modInv(nn.waysRooted));
				nn.dfs1(fatherSubtreeSize, fatherWays);
			}
			subtreeSize++;
		}
	}
	
	static long add(long a, long b) {
		return (a+b)%mod;
	}
	
	static long mul(long a, long b) {
		return a*b%mod;
	}
	
	static long fastPow(long base, long exp) {
		if (exp==0) return 1;
		long half=fastPow(base, exp/2);
		if (exp%2==0)
			return mul(half, half);
		return mul(base, mul(half, half));
	}
	
	static long modInv(long x) {
		return fastPow(x, mod-2);
	}
	
	static void precomp() {
		facts=new long[1_000_000];
		factInvs=new long[1_000_000];
		facts[0]=factInvs[0]=1;
		for (int i=1; i<facts.length; i++) facts[i]=mul(facts[i-1], i);
		factInvs[factInvs.length-1]=modInv(facts[factInvs.length-1]);
		for (int i=facts.length-2; i>=0; i--) factInvs[i]=mul(factInvs[i+1], i+1);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");

		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) {
				a[i]=nextInt();
			}
			return a;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}

}
