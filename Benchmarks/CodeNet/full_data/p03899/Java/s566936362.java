import java.io.*;
import java.util.*;


class Main {
    static final long I=1L<<53;
    static void mEqN(int n,int k,long[]a){
        long[]ans=new long[k+1];
        Arrays.fill(ans,-I);
        ans[0]=0;
        for(int i=0;i<n;++i){
            for(int j=Math.min(i+1,k);j>=1;--j){
                ans[j]=Math.max(ans[j],ans[j-1]+j*a[i]);
            }
        }
        out.println(ans[k]);
    }
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        long[]a=new long[n];
        for(int i=0;i<n;++i){
            a[i]=sc.nextLong();
        }
        if(m==n){
            mEqN(n,k,a);
        }
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
