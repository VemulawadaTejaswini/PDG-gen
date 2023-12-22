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
    HashMap<Long, Long> map = new HashMap<Long, Long>();

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        long H = sc.nextLong();
        map.put(1l, 1l);
        System.out.println(solve(H));
    }

    long solve(long h) {
        if (map.containsKey(h)) {
            return map.get(h);
        } else {
            long cnt = solve(h / 2l) * 2l + 1;
            map.put(h, cnt);
            return cnt;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
