
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;
    static int N;
    static int M;
    static ArrayList<Key> keys;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        long sum = 0;
        keys = new ArrayList<Key>();
        int[] w = new int[N];
        for (int i = 0; i < M; i++) {
            int value = sc.nextInt();
            int size = sc.nextInt();
            Key key = new Key(value);
            sum += value;
            for (int k = 0; k < size; k++) {
                int t = sc.nextInt() - 1;
                w[t]++;
                key.accept.add(t);
            }
            keys.add(key);
        }
        for (int i = 0; i < N; i++) {
            if (w[i] <= 0) {
                System.out.println(-1);
                return;
            }
        }
        keys.sort(Comparator.comparing(Key::getCostperformance).reversed());
        stans = sum;
        stw = w;
        System.out.println(solve(new int[M], stans));
    }

    static int[] stw;
    static long stans;

    private static long solve(int[] fix, long tempAns) {

        int[] w = stw.clone();
        long sum = stans;
        for (int i = 0; i < M; i++) {
            if (fix[i] == -1) {
                Key key = keys.get(i);
                sum -= key.value;
                for (int num : key.accept) {
                    w[num]--;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (w[i] <= 0) {
                return tempAns;
            }
        }

        for (int i = 0; i < keys.size(); i++) {
            if (fix[i] != 0)
                continue;
            Key key = keys.get(i);
            boolean rem = true;
            for (int num : key.accept) {
                if (w[num] <= 1)
                    rem = false;
            }
            if (rem) {
                sum -= key.value;
                for (int num : key.accept) {
                    w[num]--;
                }
            } else {
                if (tempAns < sum) {
                    return tempAns;// end
                }
                int[] nex = fix.clone();
                nex[i] = -1;
                tempAns = solve(nex, tempAns);
                nex[i] = 1;
                tempAns = solve(nex, tempAns);
                return tempAns;// branch
            }
        }
        if (sum < tempAns) {
            tempAns = sum;
            return sum;// update
        }
        return tempAns;// end
    }

}

class Key {
    ArrayList<Integer> accept = new ArrayList<Integer>();
    int value;

    Key(int value) {
        this.value = value;
    }

    public double getCostperformance() {
        return (double) accept.size() / value;
    }

}