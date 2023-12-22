import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        double maxConcentration = 0;
        int maxSuger = 0;
        int maxWeight = 0;
        for(int i = 0; i * a * 100 <= f; i++) {
            for(int j = 0; j * b * 100 <= f - (i * a * 100); j++) {
                int water = i * a * 100 + j * b * 100;
                for(int k = 0; k * c <= f - water; k++) {
                    for(int l = 0; l * d <= f - (water + c * k); l++) {
                        int suger = c * k + d * l;
                        int concentration;
                        int baseConcentration = (100 * e) / (100 + e);
                        if(water + suger == 0) {
                            concentration = 0;
                        } else {
                            concentration = (100 * suger) / (water + suger);
                        }
                        if(concentration <= baseConcentration && concentration > maxConcentration && water != 0) {
                            maxConcentration = concentration;
                            maxSuger = suger;
                            maxWeight = water + suger;
                        }
                    }
                }
            }
        }
        System.out.println(maxWeight + " " + maxSuger);
    }
}
