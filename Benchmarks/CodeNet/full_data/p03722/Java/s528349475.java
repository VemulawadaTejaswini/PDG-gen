import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[]a=new int[m],b=new int[m];
        long[]c=new long[m];
        for(int i=0;i<m;++i){
            a[i]=sc.nextInt()-1;
            b[i]=sc.nextInt()-1;
            c[i]=-sc.nextInt();
        }
        long[]d=new long[n];
        Arrays.fill(d,1L<<48);
        d[0]=0;
        long x1=-1,x2=-1;
        for(int i=0;i<2*n;++i){
            for(int j=0;j<m;++j)
                d[b[j]]=Math.min(d[b[j]],d[a[j]]+c[j]);
            if(i==n-1)x1=d[n-1];
            if(i==2*n-1)x2=d[n-1];
        }
        assert x1>=x2;
        if(x1==x2)
            out.println(-x1);
        else
            out.println("inf");
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
