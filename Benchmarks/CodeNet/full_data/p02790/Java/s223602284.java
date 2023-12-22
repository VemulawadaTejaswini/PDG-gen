import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;
public class Main{
       public static void main(String[] args){
            FastScanner scanner = new FastScanner(System.in);
            int a = scanner.nextInt();
            int b=scanner.nextInt();
            if(a>=b)for(int i=0;i<a;++i)System.out.print(b);
         	else for(int i=0;i<b;++i)System.out.print(a);
       }
       static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
 
        String next() {
            while (st == null || !st.hasMoreTokens()) {
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
    }
}