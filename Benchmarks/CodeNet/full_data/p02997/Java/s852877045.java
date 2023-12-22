import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();

      if(k > n - 2) {
        System.out.println(-1);
        return;
      }
      System.out.println(n);
      for(int i = 1; i < n; i++) {
        System.out.println(i + " " + (i+1));
      }
      System.out.println(1+ " " + (n - (k - 1)));
  }
}