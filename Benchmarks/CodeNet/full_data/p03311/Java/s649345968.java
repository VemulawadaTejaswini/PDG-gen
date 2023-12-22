import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws Throwable {
        MyScanner sc=new MyScanner();
        PrintWriter pw=new PrintWriter(System.out);

        int n=sc.nextInt();
        int [] a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt()-(i+1);
        }
        Arrays.sort(a);
        int b=a[n/2];
        long ans=0;
        for(int i=0;i<n;i++)
            ans+=Math.abs(a[i]-b);
        pw.println(ans);
        pw.flush();
        pw.close();
    }

    static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {while (st == null || !st.hasMoreElements()) {
            try {st = new StringTokenizer(br.readLine());}
            catch (IOException e) {e.printStackTrace();}}
            return st.nextToken();}
        int nextInt() {return Integer.parseInt(next());}
        long nextLong() {return Long.parseLong(next());}
        double nextDouble() {return Double.parseDouble(next());}
        String nextLine(){String str = "";
            try {str = br.readLine();}
            catch (IOException e) {e.printStackTrace();}
            return str;}
    }
}