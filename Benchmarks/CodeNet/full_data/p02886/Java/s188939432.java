import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int[] d = new int[n];

      for (int i = 0;  i < n  ; i ++ ) {
          d[i] = scanner.nextInt();
      }

      int r_int = 0;

      for (int i = 0;  i < n - 1 ; i ++ ) {
          for (int j = i+1;  j < n ; j ++ ) {
             r_int = r_int + (d[i] * d[j]);
          }
      }
      System.out.println(r_int);

      return;
    }
  }