import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Pair> list = new ArrayList<Pair>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new Pair(a, b));
        }
        Collections.sort(list);
        int ans = 0;
        int x = 0;
        for (int i = 0; i < list.size(); i++) {
            Pair p = list.get(i);
            //System.out.println(">>>"+p.a+","+p.b);
            if (p.a >= x) {
                x = p.b;
                ans++;
            }
        }
        System.out.println(ans);
    }

    class Pair implements Comparable<Pair> {
        int a;
        int b;
        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public int compareTo(Pair p) {
            return this.b - p.b;
        }
    }
}
