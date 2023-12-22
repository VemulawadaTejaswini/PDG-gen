import java.io.*;
import java.util.*;


class Main {
    static double comp(double[]p,double[]q,double x){
        double ans=0;
        for(int i=0;i<6;++i)ans+=Math.max(p[i]*x,q[i]*(1-x));
        return ans;
    }
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        double[]p=new double[6],q=new double[6];
        for(int i=0;i<6;++i)p[i]=sc.nextDouble()/100;
        for(int i=0;i<6;++i)q[i]=sc.nextDouble()/100;
        double lo=0,hi=1;
        for(int i=0;i<100;++i){
            double mid1=(2*lo+hi)/3;
            double mid2=(lo+2*hi)/3;
            if(comp(p,q,mid1)>comp(p,q,mid2))
                lo=mid1;
            else
                hi=mid2;
        }
        out.println(comp(p,q,lo));
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
