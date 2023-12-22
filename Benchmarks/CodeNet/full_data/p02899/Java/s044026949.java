import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int a1;
      int[][] a2 = new int[n][2];
      int a3_1;
      int a3_2;

      for (int i = 0;  i < n  ; i ++ ) {
          a1 = scanner.nextInt();
          a2[i][0] = i + 1;
          a2[i][1] = a1;
      }

      for (int i = 0;  i < n - 1  ; i ++ ) {
          for (int j = n - 1;  j > i  ; j -- ) {
              if (a2[j][1] < a2[j - 1][1]){
                  a3_1 = a2[j][0];
                  a3_2 = a2[j][1];
                  a2[j][0] = a2[j - 1][0];
                  a2[j][1] = a2[j - 1][1];
                  a2[j - 1][0] = a3_1;
                  a2[j - 1][1] = a3_2;
              }
          }
      }

      for (int i = 0;  i < n ; i ++ ) {
         System.out.print(a2[i][0]);
         System.out.print(" ");
      }

      return;
    }
  }

