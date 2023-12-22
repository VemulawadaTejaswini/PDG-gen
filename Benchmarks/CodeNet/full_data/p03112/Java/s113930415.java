import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = sc.nextInt();
        long[] s = new long[a+2];
        long[] t = new long[b+2];
        s[0] = (long) -Math.pow(10, 12);
        t[0] = (long) -Math.pow(10, 12);
        s[a+1] = (long) Math.pow(10, 12);
        t[b+1] = (long) Math.pow(10, 12);
        for (int i = 1; i <= a; i++) s[i] = sc.nextLong();
        for (int i = 1; i <= b; i++) t[i] = sc.nextLong();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            long p = sc.nextLong();
            int sidx = bs(s, p);
            int tidx = bs(t,p);
            long d = Long.MAX_VALUE;
            d = Math.min(d, Math.abs(p - s[sidx]) + Math.abs(s[sidx] - t[tidx]));
            d = Math.min(d, Math.abs(p - s[sidx]) + Math.abs(s[sidx] - t[tidx+1]));
            d = Math.min(d, Math.abs(p - s[sidx+1]) + Math.abs(s[sidx+1] - t[tidx]));
            d = Math.min(d, Math.abs(p - s[sidx+1]) + Math.abs(s[sidx+1] - t[tidx+1]));
            d = Math.min(d, Math.abs(p - t[tidx]) + Math.abs(t[tidx] - s[sidx]));
            d = Math.min(d, Math.abs(p - t[tidx]) + Math.abs(t[tidx] - s[sidx+1]));
            d = Math.min(d, Math.abs(p - t[tidx+1]) + Math.abs(t[tidx+1] - s[sidx]));
            d = Math.min(d, Math.abs(p - t[tidx+1]) + Math.abs(t[tidx+1] - s[sidx+1]));
            sb.append(d).append("\n");
        }

        System.out.println(sb.toString());
        sc.close();
    }

    private static int bs(long[] t, long p) {
        int L = 0;
        int R = t.length;
        int m =0;
        while(R - L > 1){
            m = (L + R) /2;
            if(t[m] == p) break;
            else if(t[m] > p) R = m;
            else L = m;
        }
        return L;
    }

}
