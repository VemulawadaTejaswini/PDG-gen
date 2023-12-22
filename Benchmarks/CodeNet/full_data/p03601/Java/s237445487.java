import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        sc.close();

        double sugar_max = (e * f) / (100 + e);
        int sugar_c_max = (int)Math.floor(sugar_max / c);
        int sugar_d_max = (int)Math.floor(sugar_max / d);
        int water_a_max = (int)Math.floor(f / (100 * a));
        int water_b_max = (int)Math.floor(f / (100 * b));
        int sugar = 0;
        int water = 0;
        double con = 0;
        double con_max = (double)e / ((double)e + (double)100);
        for (int i = 0; i <= water_b_max; i++) {
            for (int j = 0; j <= water_a_max; j++) {
                double water_weight = 100 * b * i + 100 * a * j;
                if (water_weight > f) break;

                for (int m = 0; m <= sugar_d_max; m++) {
                    double sugar_weight = m * d;
                    if (water_weight + sugar_weight > f) break;

                    for (int n = 0; n <= sugar_c_max; n++) {
                        sugar_weight = m * d + n * c;
                        if (water_weight + sugar_weight > f) break;
                        double con_temp = sugar_weight / (sugar_weight + water_weight);
                        if (con_temp > con_max) break;
                        if (con_temp >= con) {
                            con = con_temp;
                            sugar = (int)sugar_weight;
                            water = (int)water_weight;
                        }
                    }
                }
            }
        }
        System.out.println((sugar + water) + " " + sugar);
    }
}
