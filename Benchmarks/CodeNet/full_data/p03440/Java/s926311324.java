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
         class pair{
          int id,pi,val;pair(int a,int b,int c){id=a;pi=b;val=c;}
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
            long ans=0;ArrayList<Integer> cu=new ArrayList<>();int T=hs.size();
            for(int i=0;i<n;i++){
             Collections.sort(al[i]);
             if(al[i].size()==0)continue;
             ans+=(long)al[i].get(0);
             for(int j=1;j<al[i].size();j++)cu.add(al[i].get(j));
            }
            if(cu.size()<T-2){
             out.print("Impossible");return;
            }
            Collections.sort(cu);
            for(int i=0;i<T-2;i++)ans+=(long)cu.get(i);
            out.print(ans);
         }
    }
        /*
7 3
1 2 3 4 5 6 7
3 4
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