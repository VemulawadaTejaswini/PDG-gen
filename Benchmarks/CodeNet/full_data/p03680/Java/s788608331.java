import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt() - 1;
            a[i] = num;
        }
        int p = 0;
        int np;
        int cnt = 0;
        while (true) {
            cnt++;
            np = a[p];
            if (np == -1) {
                System.out.println(-1);
                return;
            } else if (np == 1) {
                System.out.println(cnt);
                return;
            }
            a[p] = -1;
            p = np;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
