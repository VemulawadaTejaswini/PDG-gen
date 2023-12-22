import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Long> shrines = new TreeSet<>();
        TreeSet<Long> temples = new TreeSet<>();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = sc.nextInt();

        for (int i = 0; i < a; i++) {
            shrines.add(sc.nextLong());
        }

        for (int i = 0; i < b; i++) {
            temples.add(sc.nextLong());
        }

        for (int i = 0; i < q; i++) {
            long x = sc.nextLong();
            long min = Long.MAX_VALUE;

            for (int first = 0; first < 2; first++) {
                for (int sides = 0; sides < 4; sides++) {
                    TreeSet<Long> firstVisit = first == 0 ? shrines : temples;
                    TreeSet<Long> secondVisit = first == 0 ? temples : shrines;

                    Long f = null;
                    Long s = null;
                    if (sides == 0) {
                        f = firstVisit.floor(x);
                        if (f != null) {
                            s = secondVisit.floor(f);
                        }
                    } else if (sides == 1) {
                        f = firstVisit.ceiling(x);
                        if (f != null) {
                            s = secondVisit.ceiling(f);
                        }
                    } else if (sides == 2) {
                        f = firstVisit.floor(x);
                        if (f != null) {
                            s = secondVisit.ceiling(f);
                        }
                    } else {
                        f = firstVisit.ceiling(x);
                        if (f != null) {
                            s = secondVisit.floor(f);
                        }
                    }

                    if (f != null && s != null) {
                        min = Math.min(min, Math.abs(x - f) + Math.abs(s - f));
                    }
                }
            }

            System.out.println(min);
        }
    }
}