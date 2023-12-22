import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.flush();out.close();
    }
        static class TaskE {
         String s1="Vacant",s2="Male",s3="Female";
         int get(int l,int rf){
          if(l%2==0)return rf;else return 1-rf;
         }
         int p[],R[];
         void f(int u){
          if(p[u]==u)return;
          f(p[u]);
          p[u]=p[p[u]];
         }
         void m(int u,int v){
          f(u);f(v);
          int pu=p[u],pv=p[v];
          if(pu==pv)return;
          if(R[pu]==R[pv])++R[pu];
          if(R[pu]<R[pv])p[pu]=pv;
          else p[pv]=pu;
         }
         public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n=in.nextInt(),m=in.nextInt();
            int a[]=new int[n];p=new int[n];R=new int[n];
            for(int i=0;i<n;i++){
             a[i]=in.nextInt();p[i]=i;
            }
            for(int i=0;i<m;i++){
             int u=in.nextInt(),v=in.nextInt();
             m(u,v);
            }
            HashSet<Integer> hs=new HashSet<>();
            ArrayList<Integer> al[]=new ArrayList[n];
            for(int i=0;i<n;i++)al[i]=new ArrayList<>();
            for(int i=0;i<n;i++){
             f(i);
             hs.add(p[i]);al[p[i]].add(a[i]);
            }
            if(hs.size()==1){
             out.print("0");return;
            }
            //System.out.println(hs);
            //for(int i=0;i<n;i++)System.out.println(al[i]);
            for(int i=0;i<n;i++)Collections.sort(al[i]);
            ArrayList<Integer> ans[]=new ArrayList[2];
            for(int i=0;i<2;i++)ans[i]=new ArrayList<>();
            for(int i=0;i<n;i++){
             int c=0;
             for(int j=0;j<al[i].size()&&c<2;j++){
              ++c;ans[j].add(al[i].get(j));
             }
            }
            if(ans[0].size()+ans[1].size()<2*hs.size()-2){
             out.print("Impossible");return;
            }
            for(int i=0;i<2;i++)Collections.sort(ans[i]);
            long v=0;
            for(int i=0;i<hs.size();i++){
             v+=(long)ans[0].get(i);
            }
            for(int i=0;i<hs.size()-2;i++){
             v+=(long)ans[1].get(i);
            }
            out.println(v);
         }
    }
        /*
7 4
1 2 3 4 5 6 7
3 0
4 0
1 2
1 5
        */
    static class InputReader {
        BufferedReader br;
        StringTokenizer st;
        public InputReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
            st = null;
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}