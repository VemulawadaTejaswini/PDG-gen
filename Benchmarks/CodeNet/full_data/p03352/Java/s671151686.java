import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int X = sc.nextInt();

    sc.close();

    int max = 1;

    for (int i = 1; i < X; i++) {

      for (int j = 2; j < X; j++) {
        double k = Math.pow(i, j);
        if ((int)k <= X) {
          max = Math.max(max, (int)k);
        } else {
          break;
        }
      }

    }
    
    System.out.println(max);
    
  }

}