import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static Set<Double> makeSet(int a, int b, int f) {
        Set<Double> set = new HashSet<>();
        for (int i = 0; i <= 3000; i++) {
            for (int j = 0; j <= 3000; j++) {
                double x = a * i + b * j;
                if (x > f) {
                    break;
                }
                set.add(x);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        Set<Double> setWater = makeSet(100 * a, 100 * b, f);
        Set<Double> setSuger = makeSet(c, d, f);

        double water = 1;
        double suger = 0;
        for (Double w : setWater) {
            for (Double s : setSuger) {
                if (w + s > f || w == 0) {
                    continue;
                }
                if (100 * s / w <= e
                        && 100 * s / (w + s) > 100 * suger / (water + suger)) {
                    water = w;
                    suger = s;
                }
            }
        }
        System.out.println((int) (water + suger) + " " + (int) suger);
    }
}