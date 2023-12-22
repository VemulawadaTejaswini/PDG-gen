import java.util.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);
      int n, d, x, i=0, choco = 0;

      n = Integer.parseInt(scan.next());
      d = Integer.parseInt(scan.next());
      x = Integer.parseInt(scan.next());

      int a[] = new int[n];

      while(i<n){
        a[i] = Integer.parseInt(scan.next());
        a[i] = (d-1)/a[i];
        i = ++i;
      }

      i = 0;

      while(i<n){
        choco = choco + a[i];
        i = ++i;
      }

      System.out.println(x + n + choco);

    }
    catch (Exception e) {

    }
  }
}
