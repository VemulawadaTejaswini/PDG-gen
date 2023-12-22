import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        long[]a=new long[n];
        for(int i=0;i<n;++i)a[i]=sc.nextLong();
        Arrays.sort(a);
        int p=0;
        Map<Long,Integer>hm=new HashMap<Long,Integer>();
        for(int i=0;i<n;++i)
            if(i<=0||a[i]!=a[i-1])hm.put(a[i],p++);
        int[]f=new int[p];
        long[]c=new long[p];
        p=0;
        for(int i=0;i<n;++i)
            if(i<=0||a[i]!=a[i-1])c[p++]=a[i];
        for(int i=0;i<n;++i)f[hm.get(a[i])]++;
        long e=0,o=0;
        for(int i=0;i<p;++i){
            if(c[i]%2==1)e+=1+(f[i]-1)%2;
            else o+=1+(f[i]-1)%2;
        }
        int cons=p;
        for(int i=0;i<p;++i)
            if(c[i]!=i+1){
                cons=i;
                break;
            }
        long[]es=new long[cons+1],os=new long[cons+1];
        es[0]=e;
        os[0]=o;
        for(int i=0;i<cons;++i){
            e-=1+(f[i]-1)%2;
            long t=e;
            e=o;
            o=t;
            es[i+1]=e;
            os[i+1]=o;
        }
        boolean[]dp=new boolean[cons+1];
        for(int i=cons;i>=0;--i){
            boolean red=(es[i]>os[i]&&(es[i]-os[i])%2==1)||(es[i]<os[i]&&(os[i]-es[i])%2==0);
            dp[i]=!red;
            if(i<cons)dp[i]|=!dp[i+1];
        }
        /*
        System.err.println("es="+Arrays.toString(es));
        System.err.println("os="+Arrays.toString(os));
        System.err.println("dp="+Arrays.toString(dp));
        */
        out.println(!dp[0]?"Second":"First");
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
