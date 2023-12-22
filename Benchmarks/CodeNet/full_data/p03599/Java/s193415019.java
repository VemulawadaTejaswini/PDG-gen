import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() * 100;
        int b = sc.nextInt() * 100;
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        Set<Integer> waterSets = new HashSet<>();
        for (int i = 0; i < f / a; i++) {
            for (int j = 0; j < f / b; j++) {
                if (i * a + j * b > f) {
                    continue;
                }
                waterSets.add(i * a + j * b);
            }
        }

        Set<Integer> sugerSets = new HashSet<>();
        for (int i = 0; i < f / c; i++) {
            for (int j = 0; j < f / d; j++) {
                if (i * c + j * d > f) {
                    continue;
                }
                sugerSets.add(i * c + d * b);
            }
        }
        double ratio = 0.f;
        int resultWater = 0, resultSuger = 0;
        for (int w : waterSets) {
            int suger = sugerSets.stream()
                    .filter(n -> n <= w * e)
                    .mapToInt(n -> n)
                    .max()
                    .getAsInt();
            double cr = suger / (w + suger);
            if (ratio < cr) {
                resultWater = w;
                resultSuger = suger;
            }
        }
        System.out.println(resultWater + " " + resultSuger);
    }
}