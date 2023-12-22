import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int fiveHundred = sc.nextInt();
    int oneHundred = sc.nextInt();
    int fifty = sc.nextInt();
    int totalYen = sc.nextInt();
    int[] coins = new int[51];
    int count = 0;
    for (int i = 0; i <= 50; i++) {
      coins[i] = i;
    }
    for (int j = 0; j <= fiveHundred; j++) {
      for (int k = 0; k <= oneHundred; k++) {
        for (int l = 0; l <= fifty; l++) {
          if (500 * j + 100 * k + 50 * l == totalYen) {
            count++;
          }
        }
      } 
    }
    System.out.println(count);
  }
}