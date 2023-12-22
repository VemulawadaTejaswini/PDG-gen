import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    boolean ok = true;
    int i = 0;
    int j = 0;
    while (ok) {
      i += a;
      j++;
      // System.out.println(j + " " + i);
      if (b <= i) {
        break;
      } else {
        i--;
      }
    }
    
    System.out.println(j);
  }
}
