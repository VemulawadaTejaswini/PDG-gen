import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] T = new int[n];
        int[] A = new int[n];
        long maxT = 0, maxA = 0;
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
            A[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if(T[i-1]>T[i]||A[i-1]>A[i]){
                long k=max((T[i-1]+T[i]-1)/T[i],(A[i-1]+A[i]-1)/A[i]);
                T[i]*=k;
                A[i]*=k;
            }
        }
        out.println(A[n-1]+T[n-1]);
    }
}