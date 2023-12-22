import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Pair> pairs = new ArrayList<Pair>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int p = sc.nextInt();
            Pair pa = new Pair(s, p, i + 1);
            pairs.add(pa);
        }
        Collections.sort(pairs);
        for (int i = 0; i < n; i++) {
            int ans = pairs.get(i).pos;
            System.out.println(ans);
        }
        sc.close();
    }
}

class Pair implements Comparable {
    String key;
    int value;
    int pos;

    Pair(String key, int value, int pos) {
        this.key = key;
        this.value = value;
        this.pos = pos;
    }

    @Override
    public int compareTo(Object other) {
        Pair otherPair = (Pair) other;
        if (this.key.equals(otherPair.key))
            return this.value - this.value;
        return this.key.compareTo(otherPair.key);
    }
}