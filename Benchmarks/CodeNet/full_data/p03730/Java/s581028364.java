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
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        while (true) {
            int p = a;
            int q = b;
            a = Math.max(p, q);
            b = Math.min(p, q);
            if (c == a - b) {
                System.out.println("YES");
                return;
            } else if (c > a - b) {
                System.out.println("NO");
                return;
            }
            a = a - b;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
