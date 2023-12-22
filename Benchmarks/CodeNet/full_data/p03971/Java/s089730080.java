import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static FScanner sc;
    public static PrintWriter out;
    public static void main(String[] args) {
        sc=new FScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String seq = sc.nextLine();

        int counter = 0;
        int counter2 = 0;
        for(int p = 0; p < n; p++){
            if(seq.charAt(p) == 'a' && counter <  a + b){
                counter++;
                out.println("Yes");
            }
            else if(seq.charAt(p) == 'b' && counter2 < b && counter < a + b){
                counter2++;
                counter++;
                out.println("Yes");
            }

            else{
                out.println("No");
            }
        }




        out.close();
    }

    //-----------------------------------------------------HERE---------------------------------------------------------



    //------------------------------------------------------------------------------------------------------------------

    //scanner
    public static class FScanner {
        BufferedReader br;
        StringTokenizer st;

        public FScanner() {
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