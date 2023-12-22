import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Object o = run();
        if (o != null)
            System.out.println(o);
    }

    static Object run() {
        try (Scanner sc = new Scanner(System.in);) {
            int result = 0;
            // String s = sc.next();
            // String ? = sc.next();

            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            // ArrayList<Integer> ? = (ArrayList<Integer>) ChenAtCoderUtil.nScan(sc, n);
            // ArrayList<Integer> ? = (ArrayList<Integer>) ChenAtCoderUtil.nScan(sc, m);
            // LinkedList<Integer> ? = (LinkedList<Integer>) ChenAtCoderUtil.nScan(sc, n);
            // LinkedList<Integer> ? = (LinkedList<Integer>) ChenAtCoderUtil.nScan(sc, m);

            // Pair<ArrayList<Integer>, ArrayList<Integer>> pair = ChenAtCoderUtil.nScanPair(sc, m);
            // ArrayList<Integer> ? = pair.getKey();
            // ArrayList<Integer> ? = pair.getValue();

            // for (int i = 0; i < ?; i++){
            //
            // }
            if (a * n < b) {
                result = a * n;
            } else {
                result = b;
            }
            return result;
        }
    }
}

class ChenNumberUtil {
    static Collection<Integer> getDivisors(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                al.add(i);
                if (n / i != i)
                    al.add(n / i);
            }
        }
        Collections.sort(al);
        return al;
    }
}

class ChenAtCoderUtil {
    static Collection<Integer> nScan(Scanner sc, int n) {
        Collection<Integer>al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        return al;
    }

    static Pair<ArrayList<Integer>, ArrayList<Integer>> nScanPair(Scanner sc, int n) {
        Pair<ArrayList<Integer>, ArrayList<Integer>> al = new Pair<>(new ArrayList<>(), new ArrayList<>());
        for (int i = 0; i < n; i++) {
            al.getKey().add(sc.nextInt());
            al.getValue().add(sc.nextInt());
        }
        return al;
    }
}

class Pair<K, V> implements Entry<K, V>, java.io.Serializable {
    private static final long serialVersionUID = -8499721149061103585L;

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key   = key;
        this.value = value;
    }

    public Pair(Entry<? extends K, ? extends V> entry) {
        this.key   = entry.getKey();
        this.value = entry.getValue();
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public K setKey(K key) {
        K oldKey = this.key;
        this.key = key;
        return oldKey;
    }

    public V setValue(V value) {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Map.Entry))
            return false;
        Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
        return eq(key, e.getKey()) && eq(value, e.getValue());
    }

    public int hashCode() {
        return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }

    public String toString() {
        return key + "=" + value;
    }

    private static boolean eq(Object o1, Object o2) {
        return o1 == null ? o2 == null : o1.equals(o2);
    }
}