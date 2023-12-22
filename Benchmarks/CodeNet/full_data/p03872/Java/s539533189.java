import java.io.*;
import java.util.*;

class P implements Comparable<P>{
    double b;
    int z,w;
    P(double a,int x,int y){
        b=a;
        z=x;
        w=y;
    }
    @Override
    public int compareTo(P o){
        return Double.compare(b,o.b);
    }
}

class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        double[]x=new double[n],y=new double[n],a=new double[n];
        for(int i=0;i<n;++i){
            x[i]=sc.nextDouble();
            y[i]=sc.nextDouble();
            a[i]=sc.nextDouble();
        }
        double[][]d=new double[n][n];
        for(int i=0;i<n;++i)
            for(int j=0;j<n;++j)
                d[i][j]=Math.sqrt(Math.pow(x[i]-x[j],2)+Math.pow(y[i]-y[j],2));
        double[]e=new double[1<<n];
        for(int i=1;i<1<<n;++i){
            UnionFind u=new UnionFind(n);
            List<P>es=new ArrayList<P>();
            for(int j=0;j<n;++j)
                if((i&1<<j)!=0)
                    for(int k=j+1;k<n;++k)
                        if((i&1<<k)!=0)
                            es.add(new P(d[j][k],j,k));
            Collections.sort(es);
            double cst=0.0;
            for(P ee:es)
                if(u.root(ee.z)!=u.root(ee.w)){
                    u.unify(ee.z,ee.w);
                    cst+=ee.b;
                }
            double t=-cst;
            for(int j=0;j<n;++j)
                if((i&1<<j)!=0)
                    t+=a[j];
            e[i]=t/Integer.bitCount(i);
        }
        double[]dp=new double[1<<n];
        dp[0]=Double.MAX_VALUE;
        for(int i=1;i<1<<n;++i){
            double t=e[i];
            int b=i;
            while(b>0){
                t=Math.max(t,Math.min(e[b],dp[i-b]));
                b=(b-1)&i;
            }
            dp[i]=t;
        }
        out.printf("%.20f\n",dp[(1<<n)-1]);
        out.close();
    }
    // http://codeforces.com/blog/entry/7018
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
class UnionFind {
    int[] parent;
    int[] rank;
    UnionFind(int n) {
	this.parent = new int[n];
	this.rank = new int[n];
	this.clear();
    }
    void clear() {
	int n = this.parent.length;
	for (int i = 0; i < n; ++i) {
	    this.parent[i] = i;
	    this.rank[i] = 0;
	}
    }
    void unify(int x, int y) {
	int rootX = this.root(x);
	int rootY = this.root(y);
	if (rootX == rootY) {
	    return;
	}
	if (this.rank[rootX] < this.rank[rootY]) {
	    this.parent[rootX] = rootY;
	} else {
	    this.parent[rootY] = rootX;
	    if (this.rank[rootX] == this.rank[rootY]) {
		this.rank[rootX]++;
	    }
	}
    }
    int root(int x) {
	if (this.parent[x] == x) {
	    return x;
	}
	return this.parent[x] = this.root(this.parent[x]);
    }
}
