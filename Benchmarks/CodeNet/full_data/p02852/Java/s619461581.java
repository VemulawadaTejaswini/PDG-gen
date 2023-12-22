//package AtCoder.C114;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class Main {

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);

    public static void main(String[] args) {
        int n = in.NI() + 1; int m = in.NI();
        String que = in.next();

        if (que.charAt(n-1) == '1') {
            out.println(-1); out.close(); return;
        }

        int[] presum = new int[n];
        for (int i=0;i<n;i++) {
            presum[i] = (que.charAt(i)-'0');
        }

        for (int i=1;i<n;i++) presum[i]+=presum[i-1];

        int pos = n-1;

        List<Integer> answers = new ArrayList<>();

        while(pos>0) {
            int target = Integer.max(pos - m, 0);

            int subtractsum = target==0? 0: presum[target-1];

            int ans = -1;
            int ll = target; int ul = pos;
            while(ll<=ul) {
                int mid = (ll+ul)/2;
                if (presum[mid] - subtractsum == mid-target+1) {
                    ll = mid+1; continue;
                } else {
                    ans = mid;
                    ul = mid-1;
                }
            }

            if (ans == -1 || ans == pos) {
                out.println(-1); out.close(); return;
            }

            answers.add(pos-ans);
            pos = ans;
        }

        for (int i=answers.size()-1;i>=0;i--) {
            out.printf("%d ", answers.get(i));
        }

        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NI() {
            return Integer.parseInt(next());
        }

        public long NL() {
            return Long.parseLong(next());
        }

    }

}
