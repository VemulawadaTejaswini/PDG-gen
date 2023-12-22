import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int n = scnr.nextInt();
      int m = scnr.nextInt();
      int[] likedFoods = new int[m];
      for (int i = 0; i < n; i++) {
        int k = scnr.nextInt();
        for (int j = 0; j < k; j++) {
          int food = scnr.nextInt();
          likedFoods[food-1]++;
        }
      }
      int result = 0;
      for (int i = 0; i < m; i++) {
        if (likedFoods[i] == n) result++;
      }
      System.out.println(result);
    }
}