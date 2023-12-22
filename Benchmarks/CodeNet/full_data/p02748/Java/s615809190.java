import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();
        int a[] = new int[A];
        int b[] = new int[B];
        int xyc[][] = new int[M][3];
        for (int i = 0; i < A; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < B; i++)
            b[i] = sc.nextInt();
        for (int i = 0; i < M; i++) {
            xyc[i][0] = sc.nextInt();
            xyc[i][1] = sc.nextInt();
            xyc[i][2] = sc.nextInt();
        }
        int ans = 0;
        int tmp = 0;
        for (int i = 0; i < M; i++) {
            tmp = a[xyc[i][0] - 1] + b[xyc[i][1] - 1] - xyc[i][2];
            if (i == 0)
                ans = tmp;
            if (ans > tmp)
                ans = tmp;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        tmp = a[0] + b[0];
        if (ans > tmp)
            ans = tmp;
        System.out.println(ans);

    }
}