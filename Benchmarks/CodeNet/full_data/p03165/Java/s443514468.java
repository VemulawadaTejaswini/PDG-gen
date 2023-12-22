import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] a = scanner.nextLine().toCharArray();
        char[] b = scanner.nextLine().toCharArray();
        int[][] dp = new int[a.length][b.length];
        boolean flag = false;
        Map<Pair<Integer, Integer>, Pair<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(a[i] == b[0] || flag) {
                if(flag) {
                    map.put(new Pair<>(i, 0), new Pair<>(i - 1, 0));
                }
                flag =true;
                dp[i][0] = 1;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if(a[0] == b[i] || flag) {
                if(flag) {
                    map.put(new Pair<>(0, i), new Pair<>(0, i - 1));
                }
                flag =true;
                dp[0][i] = 1;
            }
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < b.length; j++) {
                if(a[i] == b[j]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    map.put(new Pair<>(i, j), new Pair<>(i - 1, j - 1));
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    if(dp[i-1][j] >= dp[i][j-1]) {
                        map.put(new Pair<>(i, j), new Pair<>(i - 1, j));
                    } else {
                        map.put(new Pair<>(i, j), new Pair<>(i, j - 1));
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = a.length - 1, j = b.length - 1;
        while(i >= 0 && j >= 0) {
            if(a[i] == b[j]) {
                sb.insert(0, a[i]);
            }
            Pair<Integer, Integer> pair = map.get(new Pair<>(i, j));
            if(pair == null) {
                break;
            }
            i = pair.getKey();
            j = pair.getValue();
        }
        System.out.println(sb);
    }

    static class Pair<K, V> {
        K a;
        V b;
        @Override
        public int hashCode() {
            return a.hashCode() + b.hashCode();
        }

        public K getKey() {
            return a;
        }
        public V getValue() {
            return b;
        }

        public Pair(K a, V b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if(o == this) {
                return true;
            }
            if(o instanceof Pair) {
                Pair other = (Pair)o;
                return a.equals(other.a) && b.equals(other.b);
            }
            return false;
        }
    }

}
