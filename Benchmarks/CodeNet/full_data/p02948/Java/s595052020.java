import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Pair> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new Pair(a, b));
        }
        list.sort((x, y) -> {
            if (x.b == y.b) {
                return y.a - x.a;
            } else {
                return y.b - x.b;
            }
        });
        long count = 0;
        for(Pair p: list) {
            int getDays = p.a;
            int payment = p.b;
            if (getDays <= m) {
                count += payment;
                m--;
            }
        }
        System.out.println(count);
    }

    public static class Pair {
        int a;
        int b;
        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
