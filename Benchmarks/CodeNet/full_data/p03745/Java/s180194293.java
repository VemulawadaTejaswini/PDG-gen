import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader();
        //InputStream inputStream = System.in;
        //Scanner in = new Scanner(inputStream);
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        long mod = (int)1e9+7;
        int n = in.ni();
        long[] arr = new long[n];
        for(int i=0;i<n;i++)
            arr[i] = in.ni();
        if(n<=2){
            out.println(1);
            out.close();
            return;
        }
        int count = 1;
        for(int i=1;i<n-1;i++){
            long first = arr[i]-arr[i-1];
            long sec = arr[i+1]-arr[i];
            if(first*sec>=0)
                continue;
            else {
                count++;
                i++;
            }
        }
        int cc = 1;
        for(int i=n-2;i>=1;i--){
            long first = arr[i]-arr[i-1];
            long sec = arr[i+1]-arr[i];
            if(first*sec>=0)
                continue;
            else {
                cc++;
                i--;
            }
        }
        out.println(Math.min(count,cc));
        out.close();
    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String n() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

        int ni() {
            return Integer.parseInt(n());
        }

        long nl() {
            return Long.parseLong(n());
        }

        double nd() {
            return Double.parseDouble(n());
        }

        String nli() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                throw new RuntimeException();
            }
            return str;
        }
    }
}
