import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pair> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(new Pair(sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(list, new ComparatorB());
        boolean ng = false;
        long time = 0;
        for (int i = 0; i < n; i++) {
            time += list.get(i).a;
            if (list.get(i).b < time) {
                ng = true;
                break;
            }
        }
        if (ng) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}

class Pair {
    public long a;
    public long b;
    public Pair(long a, long b) {
        this.a = a;
        this.b = b;
    }
}

class ComparatorB implements Comparator<Pair> {
    @Override
    public int compare(Pair p1, Pair p2) {
        if (p1.b == p2.b) {
            return 0;
        } else if (p1.b > p2.b) {
            return 1;
        } else {
            return -1;
        }
    }
}
