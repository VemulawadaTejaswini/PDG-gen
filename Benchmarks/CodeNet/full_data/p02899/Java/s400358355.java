import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Pair> list = new ArrayList<Pair>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.add(new Pair(a, (i + 1)));
        }
        Collections.sort(list);
        int cnt = 0;
        for (Pair p : list) {
            System.out.print(p.value);
            cnt++;
            if (cnt != n) {
                System.out.print(" ");
            }
        }

    }
}

class Pair implements Comparable<Pair> {
    // key , value 昇順ソート
    int key;
    int value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Pair other) {
        if (this.key == other.key) {
            return this.value - other.value;
        }
        return this.key - other.key;
    }
}
