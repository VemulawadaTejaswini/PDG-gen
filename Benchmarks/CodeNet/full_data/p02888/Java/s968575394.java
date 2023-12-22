import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer[] sticks = new Integer[n];
    Arrays.setAll(sticks, i -> sc.nextInt());
    Arrays.sort(sticks, Collections.reverseOrder());
    int count = 0;
    for (int i = 0; i < n - 2; i++)
      for (int j = i + 1; j < n - 1; j++)
        for (int k = j + 1; k < n; k++)
          if (sticks[i] - sticks[j] < sticks[k])
            count++;
    	  else
            break;
    System.out.println(count);
  }
}