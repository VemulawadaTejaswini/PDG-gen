import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        long[] T = new long[n];
        long[] A = new long[n];
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
            A[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if(A[i-1]>A[i]||T[i-1]>T[i]) {
                long k = max(ceil(A[i - 1], A[i]), ceil(T[i - 1], T[i]));
                //out.println(k);
                A[i] *= k;
                T[i] *= k;
            }
        }
        out.println(A[n-1]+T[n-1]);
    }
    static long ceil(long a,long b){
        return a%b==0?a/b:a/b+1;
    }
}