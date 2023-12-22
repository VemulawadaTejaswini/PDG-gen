import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
    void run() throws Exception{
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        boolean multiple = false;
        for(int tc = 1, tt = (multiple)?ni(in):1; tc<=tt; tc++)solve(in,out,tc);
        out.flush();
        out.close();
    }
    void solve(FastReader in, PrintWriter out, int TC) throws Exception{
        HashMap<Long, Integer> map = new HashMap<>();
        int n = ni(in);
        long m = nl(in);
        long ans = 0, sum = 0;
        long[] a = new long[n];
        for(int i = 0; i< n; i++){
            a[i] = nl(in)%m;
            sum = (sum+a[i])%m;
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        sum = 0;
        for(int i = 0; i< n; i++){
            ans+=map.getOrDefault(sum, 0);
            sum = (sum+a[i])%m;
            map.put(sum, map.getOrDefault(sum, 0)-1);
        }
        pn(out,ans);
    }
    void p(PrintWriter out, Object o){out.print(o);}
    void pn(PrintWriter out,Object o){out.println(o);}
    int ni(FastReader in){return Integer.parseInt(in.next());}
    long nl(FastReader in){return Long.parseLong(in.next());}
    class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception{
            br = new BufferedReader(new FileReader(s));
        }

        String next(){
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException  e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }   
            return str;
        }
    }
} 
