import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static Set<Integer> makeSet(int a, int b, int f) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= 3000; i++) {
            for (int j = 0; j <= 3000; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                int x = a * i + b * j;
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

        Set<Integer> setWater = makeSet(100 * a, 100 * b, f);
        Set<Integer> setSuger = makeSet(c, d, f);

        int water = 1;
        int suger = 0;
        for (Integer w : setWater) {
            for (Integer s : setSuger) {
                if (w + s > f) {
                    continue;
                }
                if (100 * s / w <= e
                        && 100 * s / (w + s) > 100 * suger / (water + suger)) {
                    water = w;
                    suger = s;
                }
            }
        }
        System.out.println((water + suger) + " " + suger);
    }
}