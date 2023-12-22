import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int t = sc.nextInt();

      int minCost = Integer.MAX_VALUE;
      for(int i = 0; i < n; i++) {
        int cost = sc.nextInt();
        int time = sc.nextInt();
        if(time <= t)
          minCost = Math.min(minCost, cost);
      }
      System.out.println(minCost == Integer.MAX_VALUE ? "TLE" : minCost);
  }
}