import java.io.*;
import java.util.*;
public class Main {
static PrintWriter pw =new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)throws IOException {
	// write your code here
        MyScanner sc = new MyScanner();
        int D = sc.nextInt();
        int N  =sc.nextInt();
        if(D==0) pw.println(N);
        else if (D==1)pw.println(D+"00");
        else if (D==2)pw.println(D+"0000");
        pw.flush();
    }
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
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

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }

}

