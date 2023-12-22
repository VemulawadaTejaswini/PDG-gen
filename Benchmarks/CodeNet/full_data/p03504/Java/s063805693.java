import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        int cc=sc.nextInt();
        ArrayList<Long>[]ode=new ArrayList[cc];
        Arrays.setAll(ode,x->new ArrayList<Long>());
        for(int i=0;i<n;++i){
            int s=sc.nextInt();
            int t=sc.nextInt();
            int c=sc.nextInt()-1;
            ode[c].add((long)s<<32|t);
        }
        int[]timeline=new int[110000];
        for(int c=0;c<cc;++c){
            Collections.sort(ode[c]);
            int len=ode[c].size();
            int es=-1;
            int et=-1;
            for(int i=0;i<len;++i){
                long nxt=ode[c].get(i);
                int fs=(int)(nxt>>>32);
                int ft=(int)nxt;
                if(et==fs)et=ft;
                else{
                    if(es>=1){
                        for(int j=es-1;j<et;++j)timeline[j]++;
                    }
                    es=fs;
                    et=ft;
                }
            }
            if(es>=1)for(int i=es-1;i<=et;++i)timeline[i]++;
        }
        int ans=0;
        for(int t:timeline)ans=Math.max(ans,t);
        out.println(ans);
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
