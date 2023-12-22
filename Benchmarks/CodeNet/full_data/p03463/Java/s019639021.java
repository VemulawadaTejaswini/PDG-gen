import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static class Fast {
        BufferedReader br;
        StringTokenizer st;

        public Fast() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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
static int arr[];
    public static void main(String args[]) throws Exception {
        Fast in = new Fast();
        int n = in.nextInt();
        int a = in.nextInt(), b = in.nextInt();
        for (int i = 0; i < (int)1e6; i++) {
            if(a+1==b){
                if(a-1==0){
                    System.out.println("Borys");
                    return;
                }else {
                    a--;
                }
            }else {
                a++;
            }
            if(b-1==a){
                if(b+1==n+1){
                    System.out.println("Alice");
                    return;
                }else {
                    b++;
                }
            }else{
                b--;
            }
        }
        System.out.println("Draw");
    }
}




