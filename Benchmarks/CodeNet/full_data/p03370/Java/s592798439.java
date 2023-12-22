import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int min = Integer.MAX_VALUE;
      for(int i = 0; i < n; i++) {
        int num = sc.nextInt();
        min = Math.min(min, num);
        x -= num;
      }
      
      System.out.println(n + x / min);
  }
}