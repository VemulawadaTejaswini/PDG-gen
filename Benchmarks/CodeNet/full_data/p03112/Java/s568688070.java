import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int q = sc.nextInt();

        TreeSet<Long> shrines = new TreeSet<>();
        TreeSet<Long> temples = new TreeSet<>();

        for (int i = 0; i < s; i++) {
            shrines.add(sc.nextLong());
        }

        for (int i = 0; i < t; i++) {
            temples.add(sc.nextLong());
        }

        for (int i = 0; i < q; i++) {
            long query = sc.nextLong();
            Long fl1 = shrines.floor(query);
            Long cl1 = shrines.ceiling(query);
            Long fl2 = temples.floor(query);
            Long cl2 = temples.ceiling(query);

            long min = Long.MAX_VALUE;
            min = Math.min(min, getClosest(query, fl1, fl2));
            min = Math.min(min, getClosest(query, cl1, cl2));
            min = Math.min(min, getClosest(query, fl1, cl2));
            min = Math.min(min, getClosest(query, cl1, fl2));
            System.out.println(min);
        }
    }

    private static long getClosest(long query, Long p1, Long p2) {
        if (p1 != null && p2 != null) {
            long diff1 = Math.abs(query - p1);
            long diff2 = Math.abs(query - p2);
            long diffBetweenPoints = Math.abs(p1-p2);
            return diff1 < diff2 ? diff1 + diffBetweenPoints : diff2 + diffBetweenPoints;
        }
        return Long.MAX_VALUE;
    }
}
