import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Int[] I = new Int[N];
        for (int i = 0; i < N; i++) {
            I[i] = new Int(sc.nextLong(), sc.nextLong()+1);
        }
        Arrays.sort(I);
        Int[] X = new Int[N+1];
        X[0] = new Int(-1, Long.MAX_VALUE);
        for (int i = 0; i < N; i++) {
            X[i+1] = X[i].merge(I[i]);
        }
        Int[] Y = new Int[N+1];
        Y[N] = new Int(-1, Long.MAX_VALUE);
        for (int i = N-1; i >= 0; i--) {
            Y[i] = Y[i+1].merge(I[i]);
        }
        
        long res = 0;
        for (int i = 0; i < N; i++) {
            if (i < N-1) {
                res = Math.max(res, X[i+1].size() + Y[i+1].size());
            }
            res = Math.max(res, X[i].merge(Y[i+1]).size() + I[i].size());
        }
        System.out.println(res);
    }
    
}


class Int implements Comparable<Int> {
    long L, R;
    Int(long l, long r) {
        L = l; R = r;
    }
    
    Int merge(Int I) {
        return new Int(Math.max(L, I.L), Math.min(R, I.R));
    }
    
    long size() {
        return Math.max(R-L, 0);
    }

    @Override
    public int compareTo(Int t) {
        int res = Long.compare(L, t.L);
        if (res != 0) return res;
        return Long.compare(R, t.R);
    }
}