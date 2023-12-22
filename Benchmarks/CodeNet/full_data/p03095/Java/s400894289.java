import java.io.*;
import java.util.*;

public class tr3 {
    static ArrayList<Integer>[]ed;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n=sc.nextInt();
		String s=sc.nextLine();
		long ans=n;
		for(int c=2;c<=26;c++) {
			HashMap<Character,Integer> h=new HashMap();
			for(int i=0;i<n;i++) {
				  if(h.size()>(c-1) && h.containsKey(s.charAt(i))) {
				  if(c==2) {
					  long mul=0;
					  for(char t:h.keySet()) {
						  if(t!=s.charAt(i))
							  mul+=h.get(t);
					  }
					  long f=fac(h.size()-1)/(fac(h.size()-1-c+1)*fac(c-1));
					  f=f%mod;
					  ans+=(mul)%mod;
					 // System.out.println("OO "+f+" "+mul+" "+c+" 1");
					  }
					  else {
						  long mul=1;
						  for(char t:h.keySet()) {
							  if(t!=s.charAt(i))
								  mul*=h.get(t);
						  }
						  long f=fac(h.size()-1)/(fac(h.size()-1-c+1)*fac(c-1));
						  f=f%mod;
						  ans+=(f*mul)%mod;
						  //System.out.println("OO "+f+" "+mul+" "+c+" 1");
					  }
					//  System.out.println("OO "+f+" "+mul+" "+c+" 1");
				  }
				  else if(h.size()>=(c-1) && !h.containsKey(s.charAt(i))) {
					  if(c==2) {
						  long mul=0;
						  for(char t:h.keySet()) {
							  if(t!=s.charAt(i))
								  mul+=h.get(t);
						  }
						  long f=fac(h.size())/(fac(h.size()-c+1)*fac(c-1));
						  f=f%mod;
						  ans+=(mul)%mod;
					//	  System.out.println("OO "+f+" "+mul+" "+c+" 2");
						  }
						  else {
							  long mul=1;
							  for(char t:h.keySet()) {
								  if(t!=s.charAt(i))
									  mul*=h.get(t);
							  }
							  long f=fac(h.size())/(fac(h.size()-c+1)*fac(c-1));
							  f=f%mod;
							  ans+=(f*mul)%mod;
						//	  System.out.println("OO "+f+" "+mul+" "+c+" 2");
						  }
					//  System.out.println("OO "+f+" "+mul+" "+c+" 2");
				  }
                  h.put(s.charAt(i), h.getOrDefault(s.charAt(i),0)+1);				
			}
		}
		out.print(ans);
		out.flush();
	}
	static final long mod=(long)1e9+7;
	static long fac(long n) {
		if(n==0 || n==1)
			return 1;
		long a=1;
		while(n>0) {
			a*=n;
			n--;
		}
		return a;
	}
	static boolean io=false;
	static boolean []vis;
    static void dfs(int u,int w) {
    	vis[u]=true;
    	if(u==w)
    		 io=true;
    	for(int v:ed[u]) {
    		if(!vis[v]) {
    	   dfs(v,w);
    		}
    	}
    	//return false;
    }
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	static class pair{
		char a;
	    char b;

		pair(char a,char b) {
			this.a = a;
			this.b = b;
		}

		public String toString() {
			return a + " " + b;
			}
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
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
}