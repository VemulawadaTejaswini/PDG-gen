import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Item implements Comparable<Item> {
    int cost;
    int index;

    public Item(int cost, int index) {
        this.cost = cost;
        this.index = index;
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.cost, other.cost);
    }

}

class Solver {

    private String buildKey(int x, int y) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.append(",");
        sb.append(y);
        return sb.toString();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();

        List<Item> a = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            a.add(new Item(sc.nextInt(), i));
        }
        List<Item> as = new ArrayList<>(a);
        Collections.sort(as);

        ArrayList<Item> b = new ArrayList<>();
        for (int i = 0; i < B; i++) {
            b.add(new Item(sc.nextInt(), i));
        }
        ArrayList<Item> bs = new ArrayList<>(b);
        Collections.sort(bs);

        Map<String, Integer> m = new HashMap<String, Integer>();
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = sc.nextInt();
           String key = buildKey(x, y);
            if (m.containsKey(key)) {
                int v = m.get(key);
                m.put(key, Math.max(v, c));
            } else {
                m.put(key, c);
            }
        }


        int minCost = as.get(0).cost + bs.get(0).cost;
        String minKey = buildKey(as.get(0).index, bs.get(0).index);
        if (m.containsKey(minKey)) {
            minCost = as.get(0).cost + bs.get(0).cost  - m.get(minKey);
        }

        for (Map.Entry e : m.entrySet()) {
            String k = (String) e.getKey();
            if (m.containsKey(k)) {
                String[] keys = k.split(",");
                int key1 = Integer.parseInt(keys[0]);
                int key2 = Integer.parseInt(keys[1]);
                int c1 = a.get(key1 - 1).cost;
                int c2 = b.get(key2 - 1).cost;
                minCost = Math.min(c1 + c2 - m.get(k), minCost);
            }
        }
        System.out.println(minCost);
        

        return;
    }

}
