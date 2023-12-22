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
        int[] q = intarr();
        int n = q[0];
        int k = q[1];

        long[] a = new long[n];
        long[] b = new long[n];
        for(int i=0;i<n;i++) {
            q = intarr();
            a[i] = q[0];
            b[i] = q[1];
        }

        long res = solve(a,b,k);

        out(res);
    }

    private long solve(long[] a, long[] b, long k) {
        int n = a.length;
        long best = 0;
        for(int i=0;i<n;i++) {
            if((a[i] | k) <= k) {
                best += b[i];
            }
        }
        long mask = 1;
        for(int i=0;i<=30;i++) {
            long sum = 0;
            long or = 0;
            for(int j=0;j<n;j++) {
                long pre = a[j] & (~mask);
                if(((pre | k) <= k) && (((1<<i) & a[j]) == 0)) {
                    sum += b[j];
                    or |= a[j];
                }
            }
            if(or <= k) {
                best = max(best, sum);
            }
            mask = (mask<<1)+1;
        }
        return best;
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
