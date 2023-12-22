//package BeginnerContest145;

import java.util.*;
import java.io.*;

public class Main {
    static TreeSet<String> perm;

    public static void perms(String s, int i){
        perm.add(s);
        for(int x = i; x<s.length(); x++){
            char[] swap = s.toCharArray();
            char a = swap[i];
            char b = swap[x];
            swap[x] = a;
            swap[i] = b;
            perms(new String(swap), i+1);
        }
    }
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        perm = new TreeSet<>();
        int n = sc.nextInt();
        StringBuilder s = new StringBuilder();
        for(int i = 1; i<=n; i++){
            s.append(String.valueOf(i));
        }
        String k = s.toString();
        perms(k, 0);
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        double total = 0;
        for(String p : perm){
            double t = 0;
            //pw.println(p);
            for(int i = 0; i<n-1; i++){
                int t1 = Integer.parseInt(p.substring(i,i+1));
                int t2 = Integer.parseInt(p.substring(i+1, i+2));
                t1--;
                t2--;
                t += Math.sqrt((x[t1] - x[t2])*(x[t1] - x[t2]) + (y[t1] - y[t2])*(y[t1] - y[t2]));
            }
            //pw.println(t);
            total+=t;
        }
        pw.println(total / perm.size());
        pw.close();



    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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
}