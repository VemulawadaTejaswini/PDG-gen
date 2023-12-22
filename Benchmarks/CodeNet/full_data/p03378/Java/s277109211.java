import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int x = sc.nextInt();

      int[] pos = new int[n+1];
      for(int i = 0; i < m; i++)
        pos[sc.nextInt()] = 1;
      int leftCost = 0;
      for(int i = x-1; i > 0; i--)
        leftCost += pos[i];
      int rightCost = 0;
      for(int i = x+1; i < n; i++)
        rightCost += pos[i];

      System.out.println(Math.min(leftCost, rightCost));
  }
}