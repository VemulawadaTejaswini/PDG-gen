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
         LinkedList ll[];
         int T,node[];
         int pa[],cc[];
         int dfs(int u){
          ListIterator it=ll[u].listIterator();
          int r=0;
          while(it.hasNext()){
           int v=(int)it.next();
           if(pa[u]!=v){
            ++cc[u];
            pa[v]=u;r+=dfs(v);
           }
          }
          if(cc[u]==0)return 0;
          if(r<cc[u]-1)T+=(cc[u]-1-r);
          node[u]=Math.max(r,cc[u]-1);
          return Math.min(node[u],1);
         }
         void dfs1(int u){
          ListIterator it=ll[u].listIterator();
          //System.out.println(T+" "+u+" s"+" "+ll[u]);
          while(it.hasNext()){
           int v=(int)it.next();
           if(pa[u]!=v){//System.out.println(u+" u");
            int t=Math.min(node[v],1);
            if(cc[v]==0||cc[v]!=node[v]){
             if(node[u]-t==0){
              node[u]=Math.min(cc[u],node[u]+1);T++;//System.out.println(u+" "+v);
             }
            }node[v]++;
            dfs1(v);
           }
          }//System.out.println(T+" "+u+" e");
         }
         public void solve(int testNumber, InputReader in, PrintWriter out) {
          int n=in.nextInt();
          ll=new LinkedList[n];
          for(int i=0;i<n;i++)ll[i]=new LinkedList<>();
          for(int i=0;i<n-1;i++){
           int u=in.nextInt(),v=in.nextInt();
           ll[u].add(v);ll[v].add(u);
          }
          T=0;node=new int[n];pa=new int[n];cc=new int[n];
          Arrays.fill(pa,-1);
          dfs(0);//System.out.println(T+" T");
          dfs1(0);
          //for(int i=0;i<n;i++)System.out.println(node[i]+" ");
          out.print(T);
         }
    }
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