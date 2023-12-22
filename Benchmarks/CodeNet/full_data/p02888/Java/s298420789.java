import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] sticks = new int[n];
    Arrays.setAll(sticks, i -> sc.nextInt());
    int count = 0;
    for (int i = 0; i < n - 2; i++)
      for (int j = i + 1; j < n - 1; j++)
        for (int k = j + 1; k < n; k++)
          if (sticks[i] < sticks[j] + sticks[k] && sticks[j] < sticks[k] + sticks[i] && sticks[k] < sticks[i] + sticks[j])
            count++;
    System.out.println(count);
  }
}