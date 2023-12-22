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
 
          public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n=in.nextInt();
            int a[]=new int[20];
            int l=1,i;
            long ans=0;
            for(i=1;i<=n;i++){
             int x=in.nextInt();
             HashSet<Integer> hs=new HashSet<>();
             int p=-1;int tx=x;int max=-1;
             while(x!=0){
              ++p;
              if(x%2!=0){
               if(a[p]!=0){
                hs.add(a[p]);max=Math.max(max,a[p]);
               }
              }x/=2;
             }
             if(max!=-1){
              for(int j=0;j<20;j++){
               if(hs.contains(a[j])){
                a[j]=0;
               }
              }
              ans+=(i-l)*(i-l+1)/2;
//              System.out.println((i-1)+" "+l+" "+max);
              l=max+1;
              if(l<i)ans-=(i-l)*(i-l+1)/2;
             }
             p=-1;
             while(tx!=0){
              ++p;
              if(tx%2!=0){
               a[p]=i;
              }tx/=2;
             }
            }ans+=(i-l)*(i-l+1)/2;
            out.print(ans);
          }
          //          int ja[][],from[],to[],c[];
    //              void make(int n,int m,InputReader in){
    //               ja=new int[n+1][];from=new int[m];to=new int[m];c=new int[n+1];
    //               for(int i=0;i<m;i++){
    //                from[i]=in.nextInt();to[i]=in.nextInt();
    //                c[from[i]]++;c[to[i]]++;
    //               }
    //               for(int i=1;i<=n;i++){
    //                ja[i]=new int[c[i]];c[i]=0;
    //               }
    //               for(int i=0;i<m;i++){
    //                ja[from[i]][c[from[i]]++]=to[i];
    //                ja[to[i]][c[to[i]]++]=from[i];
    //               }
    //              }
//            int[] radixSort(int[] f){ return radixSort(f, f.length); }
//    	int[] radixSort(int[] f, int n)
//    	{
//    		int[] to = new int[n];
//    		{
//    			int[] b = new int[65537];
//    			for(int i = 0;i < n;i++)b[1+(f[i]&0xffff)]++;
//    			for(int i = 1;i <= 65536;i++)b[i]+=b[i-1];
//    			for(int i = 0;i < n;i++){
//                             to[b[f[i]&0xffff]++] = f[i];
//                            }
//    			int[] d = f; f = to;to = d;
//    		}
//    		{
//    			int[] b = new int[65537];
//    			for(int i = 0;i < n;i++)b[1+(f[i]>>>16)]++;
//    			for(int i = 1;i <= 65536;i++)b[i]+=b[i-1];
//    			for(int i = 0;i < n;i++)to[b[f[i]>>>16]++] = f[i];
//    			int[] d = f; f = to;to = d;
//    		}
//    		return f;
//    	}
    
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