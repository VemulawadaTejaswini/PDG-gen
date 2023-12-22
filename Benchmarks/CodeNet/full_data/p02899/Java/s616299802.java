import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int a;
      String[] d = new String[n];
      String out_no = "";

      for (int i = 0;  i < n  ; i ++ ) {
          a = scanner.nextInt();
          d[a - 1] = Integer.toString(i + 1);
      }

      out_no = d[0];
      
      for (int i = 1;  i < n ; i ++ ) {
         out_no = out_no + " " + d[i];
      }

      System.out.println(out_no);

      return;
    }
  }