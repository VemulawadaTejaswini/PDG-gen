import java.util.*;
import java.io.*;
 // Compiler version JDK 11.0.2

 class Dcoder
 {
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
   public static void main(String args[])
   { 
    FastReader in = new FastReader();
    int n = in.nextInt();
    int[] c = new int[n+2];
    for(int i = 1; i <= n; i++){
      c[in.nextInt()]++;
    }
    for(int i = 1; i <= n+1; i++){
      System.out.println(c[i]);
    }
   }
 }
