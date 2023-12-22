
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = sc.nextInt();

        // 配列の順番は関係ない。左からKづつ操作していく回数と同じ
        // （実際は、1が含まれるK順列から、左右に適用していく）
        out.println((int)(Math.ceil((double)(N-1)/(K-1))));
    }
}
