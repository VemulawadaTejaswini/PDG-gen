import java.util.*;

public class Main {
    static class Triple {
        int r, g, b;
        Triple(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        public boolean equals(Object o) {
            Triple other = (Triple)o;
            return this.r == other.r && this.g == other.g && this.b == other.b;
        }

        public int hashCode() {
            return this.r ^ this.g ^ this.b;
        }

        public Triple withR(int x) {
            return new Triple(r + x, g, b);
        }
        public Triple withG(int x) {
            return new Triple(r, g + x, b);
        }
        public Triple withB(int x) {
            return new Triple(r, g, b + x);
        }

        public boolean triangle() {
            return (r < g + b) && (g < r + b) && (b < r + g);
        }

        public boolean willTriangle(int x) {
            return (r < g + b + x) && (g < r + b + x) && (b < r + g + x);
        }
    }

    static final int MOD = 998244353;
    static final int SHIFT = 1024;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] rest = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        rest[N - 1] = a[N - 1];
        for (int i = a.length - 1; i > 0; i--) {
            rest[i - 1] = rest[i] + a[i];
        }

        HashMap<Triple, Integer> map = new HashMap<Triple, Integer>();
        map.put(new Triple(0, 0, 0), 1);
        for (int i = 0; i < N; i++) {
            int ai = a[i];
            int ri = rest[i];

            HashMap<Triple, Integer> nextMap = new HashMap<Triple, Integer>();
            for (HashMap.Entry<Triple, Integer> entry : map.entrySet()) {
                Triple triple = entry.getKey();
                int value = entry.getValue();

                Triple key1 = triple.withR(ai);
                if (key1.willTriangle(ri)) {
                    if (nextMap.containsKey(key1)) {
                        nextMap.put(key1, (nextMap.get(key1) + value) % MOD);
                    } else {
                        nextMap.put(key1, value);
                    }
                }

                Triple key2 = triple.withG(ai);
                if (key2.willTriangle(ri)) {
                    if (nextMap.containsKey(key2)) {
                        nextMap.put(key2, (nextMap.get(key2) + value) % MOD);
                    } else {
                        nextMap.put(key2, value);
                    }
                }

                Triple key3 = triple.withB(ai);
                if (key3.willTriangle(ri)) {
                    if (nextMap.containsKey(key3)) {
                        nextMap.put(key3, (nextMap.get(key3) + value) % MOD);
                    } else {
                        nextMap.put(key3, value);
                    }
                }
            }
            map = nextMap;
        }
        int sum = 0;
        for (HashMap.Entry<Triple, Integer> entry : map.entrySet()) {
            Triple key = entry.getKey();
            if (key.triangle()) {
                int value = entry.getValue();
                sum = (sum + value) % MOD;
            }
        }
        System.out.println(sum);
    }
}