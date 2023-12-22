import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan;

    private static void start() {
        scan = new Scanner(java.lang.System.in);
    }

    private static void finish() {
    }

    static class T {
        long x;
        long s;

        public T(long x, long s) {
            this.x = x;
            this.s = s;
        }
    }

    public static void main(String[] args) {
        start();

        int n = scan.nextInt();
        List<T> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(new T(scan.nextLong(), scan.nextLong()));
        }
        li.sort((o1, o2) -> {
            if (o1.x == o2.x) return 0;
            return (o1.x < o2.x) ? -1 : 1;
        });

        long maxProfit = 0;
        long currProfit = 0;
        long l = 0;
        for (int i = 0; i < n; i++) {
            if (currProfit + li.get(i).s - (li.get(i).x - l) < li.get(i).s) {
                l = li.get(i).x;
                currProfit = li.get(i).s;
            } else {
                currProfit = currProfit + li.get(i).s - (li.get(i).x - l);
                l = li.get(i).x;
            }
//            System.out.println(currProfit + " *");
            maxProfit = Math.max(maxProfit, currProfit);
        }
        System.out.println(maxProfit);
        finish();
    }
}
