
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();

        int[] aArry = new int[n];

        for (int i = 0;i<n;i++) {
            aArry[i] = sc.nextInt();
        }

        int left = 0;
        int right = aArry.length-1;

        Arrays.sort(aArry);

        LinkedList<String> res = new LinkedList<>();

        while (left != right) {
            if ((right-left)%2 == 0) {
                // ki
                res.addLast(aArry[left]+" "+aArry[right]);
                aArry[left] = aArry[left]-aArry[right];
                right--;
            } else {
                // gu
                res.addLast(aArry[right]+" "+aArry[left]);
                aArry[right] = aArry[right]-aArry[left];
                left++;
            }
        }

        out.println(aArry[left]);
        for (String t : res) {
            out.println(t);
        }
        out.flush();
    }

    static class FastReader {
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
}