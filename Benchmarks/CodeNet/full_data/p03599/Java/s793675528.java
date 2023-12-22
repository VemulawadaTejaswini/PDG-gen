import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        Set<Integer> wSet = new HashSet<>();
        Set<Integer> sSet = new HashSet<>();
        for (int i = 0 ; i <= 30/a ; i++) {
            for (int j = 0; j <= 30/b; j++) {
                int w = 100 * a * i + 100 * b * j;
                wSet.add(w);
            }
        }
        for (int i = 0 ; i <= f / c ; i++) {
            for (int j = 0 ; j <= f / d ; j++) {
                int s = c * i + d * j;
                sSet.add(s);
            }
        }
        double maxConcentration = 0;
        int suger = 0;
        int water = 0;
        for (Integer w : wSet) {
            for (Integer s : sSet) {
                if (w + s <= f && w * e / 100 - s >= 0) {
                    double concentration = (double) s / (double) (w + s);
                    if (concentration >= maxConcentration) {
                        maxConcentration = concentration;
                        suger = s;
                        water = w;

                    }
                }
            }
        }
        System.out.println(water + suger + " " + suger);

    }

}