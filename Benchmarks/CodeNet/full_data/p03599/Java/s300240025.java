import java.util.*;

class Main {

    private static int A, B, C, D, E, F;
    private static int ansSugarAmount, ansWaterAmount;
    private static double maxDensity = 0.0;
    private static int[][] cache = new int[F][F];

    private static void dfs(int sugarAmount, int waterAmount) {
        if (sugarAmount + waterAmount > F || cache[sugarAmount][waterAmount] == 1) {
            return;
        }

        double density = densityPercent(sugarAmount, waterAmount);
        double densityLimit = ((double) E / ((double)E + 100.0)) * 100.0;
        if (maxDensity <= density && density <= densityLimit) {
            maxDensity = density;
            ansSugarAmount = sugarAmount;
            ansWaterAmount = waterAmount;
        }

        cache[sugarAmount][waterAmount] = 1;

        // add A
        dfs(sugarAmount, waterAmount + A);
        // add B
        dfs(sugarAmount, waterAmount + B);
        // add C
        dfs(sugarAmount + C, waterAmount);
        // add D
        dfs(sugarAmount + D, waterAmount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt() * 100; // 水
        B = sc.nextInt() * 100; // 水
        C = sc.nextInt(); // 砂糖
        D = sc.nextInt(); // 砂糖
        E = sc.nextInt(); //100g煮溶ける
        F = sc.nextInt(); //ビーカーの最大容量

        cache = new int[F+1][F+1];

        dfs(0, 0);
        System.out.println((ansSugarAmount + ansWaterAmount) + " " + ansSugarAmount);
    }

    private static double densityPercent(int sugarAmount, int waterAmount) {
        double sum = (double)sugarAmount + (double)waterAmount;
        double sugar = (double)sugarAmount;
        return ((sugar / sum) * 100.0);
    }
}