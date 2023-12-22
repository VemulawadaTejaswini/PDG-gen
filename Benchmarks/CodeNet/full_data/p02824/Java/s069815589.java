import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {

    static final int MOD = 1000000007;
    static final long INF = 1l << 62;

    static int N;
    static long M;
    static long V;
    static int P;
    static ArrayList<Integer> A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();
        P = sc.nextInt();
        A = sc.nextIntList(N);
        Collections.sort(A, Comparator.reverseOrder());
        System.err.println(Arrays.toString(A.toArray()));
        System.out.println(binarySearch());
    }

    static boolean isAdapt(int index, ArrayList<Integer> list) {
        long tMax = (long) A.get(index) + M;
        int ranking = binarySearchLeft(tMax, A) + 1;
        System.err.println(A.get(index) + " [" + index + "] tMax:" + tMax);
        long vote = 0;
        for (int i = 0; i < N; i++) {
            if (i < P - 1) {
                vote += M;
            } else if (i < ranking) {

            } else {
                vote += tMax - A.get(i);
            }
        }
        System.err.println(String.format("rank %d vote %d", ranking, vote));
        if (tMax < A.get(P - 1)) {
            System.err.println("false1");
            return false;
        }
        // if (ranking <= P) {
        //     System.err.println("true2");
        //     return true;
        // }
        if (vote > M * V) {
            System.err.println("true3");
            return true;
        } else {
            System.err.println("false4");
            return false;
        }
    }

    static int binarySearch() {
        int left = -1;
        int right = A.size();
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (!isAdapt(mid, A))
                right = mid;
            else
                left = mid;
        }
        return right;
    }

    static boolean isOK(int index, long key, ArrayList<Integer> list) {
        if (list.get(index) < key)
            return true;
        else
            return false;
    }

    // 汎用的な二分探索のテンプレ
    static int binarySearchRight(long key, ArrayList<Integer> list) {
        int left = -1; // 「index = 0」が条件を満たすこともあるので、初期値は -1
        int right = (int) list.size(); // 「index = a.size()-1」が条件を満たさないこともあるので、初期値は a.size()
        /* どんな二分探索でもここの書き方を変えずにできる！ */
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (isOK(mid, key, list))
                right = mid;
            else
                left = mid;
        }
        /* left は条件を満たさない最大の値、right は条件を満たす最小の値になっている */
        return right;
    }

    // 汎用的な二分探索のテンプレ
    static int binarySearchLeft(long key, ArrayList<Integer> list) {
        int left = -1; // 「index = 0」が条件を満たすこともあるので、初期値は -1
        int right = (int) list.size(); // 「index = a.size()-1」が条件を満たさないこともあるので、初期値は a.size()
        /* どんな二分探索でもここの書き方を変えずにできる！ */
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (isOK(mid, key, list))
                right = mid;
            else
                left = mid;
        }
        /* left は条件を満たさない最大の値、right は条件を満たす最小の値になっている */
        return left;
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public ArrayList<Integer> nextIntList(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++)
            a.add(nextInt());
        return a;
    }

    public ArrayList<Long> nextLongList(int n) {
        ArrayList<Long> a = new ArrayList<Long>(n);
        for (int i = 0; i < n; i++)
            a.add(nextLong());
        return a;
    }
}