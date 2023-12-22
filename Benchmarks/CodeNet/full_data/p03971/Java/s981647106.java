import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static MyScanner scan;
    public static PrintWriter out;
    public static void main(String[] args) {
        scan=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));

        int t=1;
//        int t=scan.nextInt();
        while(t-->0) {

            int n=scan.nextInt(),a=scan.nextInt(),b=scan.nextInt(),brank=0,passed=0;
            String s=scan.nextLine();
            for(int c=0;c<n;c++) {
                if(s.charAt(c)=='a') {
                    if(passed<a+b) {
                        passed++;
                        out.println("Yes");
                    } else out.println("No");
                } else if(s.charAt(c)=='b') {
                    brank++;
                    if(passed<a+b&&brank<=b) {
                        passed++;
                        out.println("Yes");
                    } else out.println("No");
                } else out.println("No");
            }

        }
        out.close();
    }

    //scanner
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
}