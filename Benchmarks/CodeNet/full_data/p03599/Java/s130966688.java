import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt() * 100;
    int B = sc.nextInt() * 100;
    int C = sc.nextInt();
    int D = sc.nextInt();
    int E = sc.nextInt();
    int F = sc.nextInt();

    sc.close();

    int maxWater = 1;
    int maxSuger = 0;

    // 水の量を全探索
    for (int i = 0; i <= F; i++) {
      for (int j = 0; j <= F - i; j++) {

        if (F < (A * i + B * j)) {
          continue;
        }

        int water = A * i + B * j;
        
        // 砂糖の量を全探索
        for (int k = 0; k <= F; k++) {
          for (int l = 0; l <= F - k; l++) {

            if(F < (C * k + D * l)) {
              continue;
            }

            int suger = C * k + D * l;

            if (F < (water + suger)) {
              continue;
            }

            if ((water * E) < (suger * 100)) {
              continue;
            }

            if ((double) suger / (suger + water) > (double) maxSuger / (maxSuger + maxWater)) {
              maxWater = water;
              maxSuger = suger;
            }

          }
        }

      }

    }

    System.out.println((maxWater + maxSuger) + " " + maxSuger);

  }

}