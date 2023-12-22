import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    boolean ok = true;
    int i = a;
    int j = 1;
    while (ok) {
      if (b <= i) {
        break;
      } else {
        if (j == 1) i--;
        i += a - 1;
        j++;
      }
    }
    
    System.out.println(j);
  }
}
