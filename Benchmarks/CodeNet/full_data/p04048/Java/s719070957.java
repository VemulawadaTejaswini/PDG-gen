import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by vikas.k on 26/12/16.
 */
public class Main {
    public static void main(String[] args){
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        long n = sc.nextLong();
        long x = sc.nextLong();

        long a = x;
        long b = n-x;

        if(b > a){
            b = x;
            a = n-x;
        }
        long ans = n;
        while(b!=0){
            ans+= b*2*(a/b);
            long tmp = a%b;
            a=b; b=tmp;
        }
        ans-=a;
        out.println(ans);
        out.close();
    }

    public static PrintWriter out;

    private static class MyScanner{
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        private MyScanner(){
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next(){
            if(stringTokenizer == null || !stringTokenizer.hasMoreElements()){
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        private int nextInt(){
            return Integer.parseInt(next());
        }
        private long nextLong() { return Long.parseLong(next()); }
        private String nextLine(){
            String ret= "";
            try {
                ret= bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ret;
        }
    }
}
