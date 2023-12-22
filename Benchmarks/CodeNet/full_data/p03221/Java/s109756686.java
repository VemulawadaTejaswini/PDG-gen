import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] p = new int[m];
        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        ArrayList<MM> mk = new ArrayList<>();
        HashMap<Integer, Integer> mm = new HashMap<>();
        for (int i = 0; i < m; i++) {
            mk.add(new MM(i, p[i], y[i]));
        }
        Collections.sort(mk);
        String[] out = new String[m];

        for (int i = 0; i < m; i++) {
            MM pk = mk.get(i);
            if (mm.containsKey(pk.p)) {
                out[pk.id] = String.format("%06d%06d", pk.p, mm.get(pk.p) + 1);
                mm.put(pk.p, mm.get(pk.p) + 1);
            } else {
                out[pk.id] = String.format("%06d%06d", pk.p, 1);
                mm.put(pk.p, 1);
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.println(out[i]);
        }

    }

    static class MM implements Comparable<MM> {
        int id;
        int p;
        int y;

        MM(int a, int b, int c) {
            id = a;
            p = b;
            y = c;
        }

        @Override
        public int compareTo(MM o) {
            if (this.p == o.p)
                return this.y - o.y;
            return this.p - o.p;
        }
    }

}
