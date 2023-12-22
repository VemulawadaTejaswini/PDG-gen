import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        int t = pint();
        for(int i=0;i<t;i++) {
            out(solve());
        }
    }

    private String solve() throws IOException {
        long[] q = longarr();
        long a = q[0];
        long b = q[1];
        long c = q[2];
        long d = q[3];

        boolean res = solve(a,b,c,d);

        return res?"Yes":"No";
    }

    private boolean solve(long a, long b, long c, long d) {
        boolean res = false;
        if(b <= a) {
            if(c >= a-b) {
                res = p(a-b,b,c,d);
            } else {
                long diff = a-c;
                long e = diff % b;
                if(e == 0) {
                    res = p(c,b,c,d);
                } else {
                    long s = c - (b-e);
                    if(s >= 0) {
                        res = p(s,b,c,d);
                    }
                }
            }
        }
        return res;
    }

    private boolean p(long s, long b, long c, long d) {
        long e = d % b;
        if(d >= b && e == 0) {
            return true;
        }
        if(d > b) {
            Set<Long> visited = new HashSet<>();
            long cur = s;
            while(cur >= 0 && visited.add(cur)) {
                if (cur + e <= c) {
                    long f = (c - cur) % e;
                    cur = c + e - f - b;
                } else {
                    cur = cur + e - b;
                }
            }
            return cur >= 0;
        }
        return false;
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

    private String[] split(String s) {
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
