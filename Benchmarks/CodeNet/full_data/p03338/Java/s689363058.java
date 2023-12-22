

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int N = in.nextInt();
        String S = in.nextLine();

        int count;
        int best = 0;

        for (int i = 1; i < N; i++)
        {
            count = 0;
            String substring1 = S.substring(0,i);
            String substring2 = S.substring(i,N);
            HashSet <Character> one =new HashSet<>();
            HashSet <Character> two =new HashSet<>();
            for (int j = 0; j<substring1.length();j++)
            {
                one.add(substring1.charAt(j));
            }
            for(int j=0; j<substring2.length(); j++)
            {
                two.add(substring2.charAt(j));
            }
            for (Character c : one) {
                if (two.contains(c)) {
                    count ++;
                }
            }
            best = Math.max(count,best);

        }
        System.out.println(best);
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
