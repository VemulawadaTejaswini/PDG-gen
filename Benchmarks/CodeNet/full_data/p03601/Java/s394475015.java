import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class sugarWater2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();

        Set<Integer> waterSet = new HashSet<>();
        Set<Integer> sugarSet = new HashSet<>();
        createSugar(sugarSet, C, D, F);
        createWater(waterSet, A, B, F);

        double maxRatio = 0;
        int resultSugar = 0;
        int resultWater = 0;

        for (int water : waterSet) {
            for (int sugar : sugarSet) {
                if ((water + sugar) <= F
                        && ((double)sugar * 100 / water) <= E
                        && ((double)(100 * sugar) / (water + sugar) > maxRatio))  {
                    maxRatio = (double)(100 * sugar) / (water + sugar);
                    resultSugar = sugar;
                    resultWater = water;
                }
            }
        }

        System.out.println(resultSugar + resultWater + " " + resultSugar);


    }

    private static void createWater (Set<Integer> waterSet, int A, int B, int F) {
        for (int i = 0; i < F / A  + 1; i++) {
            for (int j = 0; j < F / B + 1; j++) {
                int water = A * 100 * i + B * 100 * j;
                if (water <= F) waterSet.add(water);
            }
        }
    }

    private static void createSugar(Set<Integer> sugarSet, int C, int D, int F) {
         for (int i = 0; i < F / C  + 1; i++) {
            for (int j = 0; j < F / D + 1; j++) {
                int water = C * i + D * j;
                if (water <= F) sugarSet.add(water);
            }
        }
    }

}