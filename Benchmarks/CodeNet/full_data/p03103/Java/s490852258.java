import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long ans = 0;
        long cnt = 0;
        List<Pair> pairs = new ArrayList<Pair>();
        for (int i = 0; i < n; i++) {
            pairs.add(new Pair(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(pairs);
        for (int i = 0; i < n; i++) {
            long num = pairs.get(i).to;
            long value = pairs.get(i).from;
            if (m >= cnt + num) {
                ans += value * num;
                cnt += num;
            } else {
                ans += value * (m - cnt);
                break;
            }
            if (m == cnt) {
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}

class Pair implements Comparable {
    int from;
    int to;

    Pair(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public int compareTo(Object other) {
        Pair otherPair = (Pair) other;
        return this.from - otherPair.from;
    }
}