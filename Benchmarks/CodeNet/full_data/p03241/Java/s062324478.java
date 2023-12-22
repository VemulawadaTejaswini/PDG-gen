import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();

      int avg = m / n;

      int maxD = 1;
      for(int i = 1; i + i <= m; i++) {
        if(m % i == 0 && i <= avg)
          maxD = i;
      }
      System.out.println(maxD);
  }
}