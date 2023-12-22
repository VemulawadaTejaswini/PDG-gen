import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<Dish> list = new ArrayList();
        long total_point = 0;
        for (int i = 0; i < N; i++) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            Dish d = new Dish(i, a, b);
            list.add(d);
            total_point += b;
        }
        list.sort(new DishComparator());
        int limit = N / 2;
        if (N % 2 == 1) {
            limit += 1;
        }
        long answer = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 1) {
                continue;
            }
            Dish dish = list.get(i);
            answer += dish.A + dish.B;
        }
        System.out.println(answer - total_point);
    }
    class DishComparator implements Comparator<Dish> {
        @Override
        public int compare(Dish o1, Dish o2) {
            long p1 = o1.A + o1.B;
            long p2 = o2.A + o2.B;
            if (p1 != p2) {
                return -Long.compare(p1, p2);
            }
            return Integer.compare(o1.id, o2.id);
        }
    }
    class Dish {
        int id;
        long A;
        long B;
        Dish(int id, long A, long B) {
            this.id = id;
            this.A = A;
            this.B = B;
        }
    }
}
