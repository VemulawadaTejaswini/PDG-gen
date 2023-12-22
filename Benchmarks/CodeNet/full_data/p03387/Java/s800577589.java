

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        ArrayList <Integer> n = new ArrayList<>();

        n.add(A);
        n.add(B);
        n.add(C);

        Collections.sort(n);

        int num [] = new int [3];
        num [0] = n.get(0);
        num[1] = n.get(1);
        num [2] = n.get(2);


        boolean M = false;
        int count = 0;
        while (num[1]<num[2])
        {
            num[1]++;
            num[0]++;
            count++;
        }

        while (num[0]<num[1])
        {
                num[0]+=2;
                count++;
                    }

        if(num[0]-num[1]==1)
        {
            count++;
        }

        System.out.println(count);



    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            st = null;
            try {
                return br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}
