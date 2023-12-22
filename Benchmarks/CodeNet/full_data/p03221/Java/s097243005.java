import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet[] sets = new TreeSet[n];
        for(int i = 0; i < n; i++) {
            TreeSet<Integer> set = new TreeSet<>();
            sets[i] = set;
        }
        ArrayList<Pair> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int y = sc.nextInt();
            TreeSet<Integer> set = sets[p-1];
            set.add(y);
            list.add(new Pair(p, y));
        }
        for(Pair pair: list) {
            int p = pair.p;
            int y = pair.y;
            TreeSet<Integer> set = sets[p-1];
            System.out.println(String.format("%06d", p) + String.format("%06d", set.headSet(y).size()+1));
        }
    }

    static class Pair {
        int p;
        int y;
        Pair(int p, int y) {
            this.p = p;
            this.y = y;
        }
    }
}
