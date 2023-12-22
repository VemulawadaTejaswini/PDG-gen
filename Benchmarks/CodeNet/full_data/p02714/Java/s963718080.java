import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{

        FastReader fs = new FastReader();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = fs.nextInt();
        String s = fs.next();
        char[] inp = s.toCharArray();
long ans = 0 ;
        for(int i=0 ; i<n ; i++){
            char a = inp[i];
            for(int j=i+1 ; j<n ; j++){
                char b = inp[j];
                if(a==b){
                    continue;
                }
                for(int k= j+1 ; k<n ; k++){
                    char c = inp[k];
                    if(k==(2*j-i) || a==c || c==b){
                        continue;
                    }else{
                        ans++;
                    }
                }
            }
        }

        out.println(ans);

        out.close();
    }
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
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

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------
}
