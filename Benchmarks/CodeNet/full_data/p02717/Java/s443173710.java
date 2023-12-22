import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static void createSgmt(int[] a, int[] s, int l, int h, int p){
        if(l == h){
            s[p] = a[l];
            return;
        }
        int mid = (l + h)/2;
        createSgmt(a, s, l, mid, 2*p + 1);
        createSgmt(a, s, mid + 1, h, 2*p + 2);
        
        s[p] = s[2*p + 1]*s[2*p + 2];
    }
    static int query(int[] s, int l, int h, int ql, int qh, int p){
        if(ql <= l && qh >= h){
            return s[p];
        }
        if(ql > h || qh < l){
            return 1;
        }
        int mid = (l+h)/2;
        
        return query(s, l, mid, ql, qh, 2*p + 1) * query(s, l, h, ql, qh, 2*p + 2);
    }
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            } catch (Exception e){
                e.printStackTrace();
            }
            return str;
        }
    }
  public static void main(String[] args)throws Exception{
    FastReader in = new FastReader();
    int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
    System.out.println(z + " " + x + " " + y);
  }
}