import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        final int N = in.i();
        int[] P = in.ii(N);
        int[] q = new int[N + 1];
        for(int i = 0; i < N; i++) {
            q[P[i]] = i + 1;
        }

        long ans = 0;
        int[] l = new int[N + 2];
        int[] r = new int[N + 2];
        for(int i = 0; i < N + 1; i++){
            l[i + 1] = i;
            r[i] = i + 1;
        }
        r[N + 1] = N + 1;

        for(int i = 0; i < N; ){
            int v = q[++i];
            int l1 = l[v];
            int r1 = r[v];
            long l2 = l[l1];
            long r2 = r[r1];
            ans += i * ((v - l1) * (r2 - r1) + (r1 - v) * (l1 - l2));
            l[r1] = l1;
            r[l1] = r1;
        }
        out.println(ans);
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        int i() {
            return Integer.parseInt(s());
        }

        long l() {
            return Long.parseLong(s());
        }

        int[] ii(final int N) {
            int[] a = new int[N];
            int i = 0;
            String s = s();
            for (int j = 0; j < a.length; j++) {
                boolean minus = s.charAt(i) == '-';
                i += minus ? 1 : 0;
                int k = 0;
                while (true) {
                    try {
                        int h = s.charAt(i++) - '0';
                        if (h < 0 || 9 < h) break;
                        k = 10 * k + h;
                    } catch (Exception e) { break; }
                }
                a[j] = minus ? -k : k;
            }
            return a;
        }

        long[] ll(final int N) {
            long[] a = new long[N];
            int i = 0;
            String s = s();
            for (int j = 0; j < a.length; j++) {
                boolean minus = s.charAt(i) == '-';
                i += minus ? 1 : 0;
                long k = 0;
                while (true) {
                    try {
                        int h = s.charAt(i++) - '0';
                        if (h < 0 || 9 < h) break;
                        k = 10 * k + h;
                    } catch (Exception e) { break; }
                }
                a[j] = minus ? -k : k;
            }
            return a;
        }
    }
}
