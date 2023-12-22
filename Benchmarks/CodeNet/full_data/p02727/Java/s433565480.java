import java.util.*;
public class Main {
    static final long MODVAL = 998244353L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int p[] = new int[A];
        long ppp[] = new long[A+1];
        int q[] = new int[B];
        long qqq[] = new long[B+1];
        int r[] = new int[C];
        long rrr[] = new long[C+1];
        for(int i=0; i<A; i++) {
            p[i] = sc.nextInt();
        }
        for(int i=0; i<B; i++) {
            q[i] = sc.nextInt();
        }
        for(int i=0; i<C; i++) {
            r[i] = sc.nextInt();
        }
        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);
        ppp[0] = 0L;
        for(int i=1; i<=A; i++) {
            ppp[i] = ppp[i-1] + p[A-i];
        }
        qqq[0] = 0L;
        for(int i=1; i<=B; i++) {
            qqq[i] = qqq[i-1] + q[B-i];
        }
        rrr[0] = 0L;
        for(int i=1; i<=C; i++) {
            rrr[i] = rrr[i-1] + r[C-i];
        }

        long result = 0L;
        for(int red=0; red<C; red++) {
            for(int green=0; green<C-red; green++) {
                if(X-red<0) continue;
                if(Y-green<0) continue;
                long tmp = ppp[X-red] + qqq[Y-green] + rrr[red+green];
                if(tmp>result) result=tmp;
            }
        }
        System.out.println(result);
    }
}
