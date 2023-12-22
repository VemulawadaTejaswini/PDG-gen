import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final long INF = 1_000_000_000_000_000_000L;
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        int n = pint();
        long[] v = new long[2];
        for(int i=0;i<n;i++) {
            long[] a = longarr();
            if(i == 0) {
                v = a;
            } else {
                v = c(v, a);
            }
        }
        out(v[0]+v[1]);
    }

    private long[] c(long[] v, long[] a) {
        long min = 1;
        long max = (INF / Math.max(a[0], a[1])) + 1;
        while(max - min > 1) {
            long mid = (min+max)/2;
            long z1 = a[0] * mid;
            long z2 = a[1] * mid;
            if(z1 >= v[0] && z2 >= v[1]) {
                max = mid;
            } else {
                min = mid+1;
            }
        }
        for(long k=-3;k<=3;k++) {
            long u = min + k;
            if(u >= 1) {
                long z1 = a[0] * u;
                long z2 = a[1] * u;
                if(z1 >= v[0] && z2 >= v[1]) {
                    return new long[] { z1, z2 };
                }
            }
        }
        return new long[2];
    }

    private int pint() throws IOException {
        return pint(rd.readLine());
    }

    private int pint(String s) {
        return Integer.parseInt(s);
    }

    private long[] longarr() throws IOException {
        return longarr(rd.readLine());
    }

    private long[] longarr(String s) {
        String[] q = split(s);
        int n = q.length;
        long[] a = new long[n];
        for(int i=0;i<n;i++) {
            a[i] = Long.parseLong(q[i]);
        }
        return a;
    }

    public String[] split(String s) {
        if(s == null) {
            return new String[0];
        }
        int n = s.length();
        int start = -1;
        int end = 0;
        int sp = 0;
        boolean lastWhitespace = true;
        for(int i=0;i<n;i++) {
            char c = s.charAt(i);
            if(isWhitespace(c)) {
                lastWhitespace = true;
            } else {
                if(lastWhitespace) {
                    sp++;
                }
                if(start == -1) {
                    start = i;
                }
                end = i;
                lastWhitespace = false;
            }
        }
        if(start == -1) {
            return new String[0];
        }
        String[] res = new String[sp];
        int last = start;
        int x = 0;
        lastWhitespace = true;
        for(int i=start;i<=end;i++) {
            char c = s.charAt(i);
            boolean w = isWhitespace(c);
            if(w && !lastWhitespace) {
                res[x++] = s.substring(last,i);
            } else if(!w && lastWhitespace) {
                last = i;
            }
            lastWhitespace = w;
        }
        res[x] = s.substring(last,end+1);
        return res;
    }

    private boolean isWhitespace(char c) {
        return c==' ' || c=='\t';
    }

    private static void out(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}
