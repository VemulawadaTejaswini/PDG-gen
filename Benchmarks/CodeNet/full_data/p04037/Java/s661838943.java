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
        boolean flip=false;
        for(int i=0;i<p;++i){
            if(f[i]>=2&&f[i]%2==0)
                break;
            flip=!flip;
        }
        out.println(flip?"Second":"First");
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
