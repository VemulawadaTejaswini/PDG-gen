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

    public static void main(String args[]) throws Exception {
        Fast in = new Fast();
        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i <n; i++) {
            a[i]=in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i]=in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int pt1=0,pt2=0;
        while(pt1<=n-1){
            if(pt2==n && pt1!=n){
                System.out.println("no");
                return;
            }
            if(a[pt1]<=b[pt2]){
                pt2++;
                pt1++;
            }else{
                pt2++;
            }
        }
        System.out.println("yes");
    }
}