//package AtCoder.C114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);

    static List<List<Integer>> digitIndex = new ArrayList<>();

    static int binsearchnext (int digit, int minind) {
        int ll = 0; int ul = digitIndex.get(digit).size()-1;
        int ans = -1;
        while(ll<=ul) {
            int mid = (ll+ul)/2;
            if (digitIndex.get(digit).get(mid) >= minind) {
                ans = digitIndex.get(digit).get(mid); ul=mid-1;
            } else {
                ll=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = in.NI();
        for (int i=0;i<10;i++) digitIndex.add(new ArrayList<>());

        String q = in.next();
        for (int i=0;i<q.length();i++) {
            digitIndex.get(q.charAt(i)-'0').add(i);
        }

        int ans = 0;
        for (int i=0;i<1000;i++) {
            int ti = i;
            int d3 = ti%10;
            ti/=10;
            int d2 = ti%10;
            ti/=10;
            int d1 = ti%10;
            int startind = 0;
            int i1 = binsearchnext(d1, startind);
            if (i1==-1) continue;
            startind = i1+1;
            int i2 = binsearchnext(d2, startind);
            if(i2==-1) continue;
            startind = i2+1;
            int i3 = binsearchnext(d3, startind);
            if (i3==-1) continue;

            //out.printf("%d %d %d\n", d1,d2,d3);
            ans++;
        }

        out.println(ans);
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
