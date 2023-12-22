import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.*;

public class Main {
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        int[] hwd = intarr();
        int h = hwd[0];
        int w = hwd[1];
        int d = hwd[2];

        int n = h*w;

        int[][] coords = new int[n + 5][2];
        int[][] a = new int[h][];
        for(int i=0;i<h;i++) {
            a[i] = intarr();
            for(int j=0;j<w;j++) {
                coords[a[i][j]][0] = i;
                coords[a[i][j]][1] = j;
            }
        }

        long[] s = new long[n+5];
        for(int i=1;i<=d;i++) {
            int u = i;
            while(u <= n) {
                int p = u;
                u += d;
                if(u <= n) {
                    long x1 = coords[p][0];
                    long y1 = coords[p][1];
                    long x2 = coords[u][0];
                    long y2 = coords[u][1];
                    long dist = abs(x1 - x2) + abs(y1 - y2);
                    s[u] = s[u-d] + dist;
                }
            }
        }

        int q = pint();
        StringBuilder buf = new StringBuilder();
        for(int i=0;i<q;i++) {
            if(i > 0) {
                buf.append('\n');
            }
            int[] lr = intarr();
            int l = lr[0];
            int r = lr[1];
            if(l == r) {
                buf.append(0);
            } else {
                buf.append(s[r] - s[l]);
            }
        }
        out(buf);
    }

    private int pint() throws IOException {
        return pint(rd.readLine());
    }

    private int pint(String s) {
        return Integer.parseInt(s);
    }

    private int[] intarr() throws IOException {
        return intarr(rd.readLine());
    }

    private int[] intarr(String s) {
        String[] q = split(s);
        int n = q.length;
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(q[i]);
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
