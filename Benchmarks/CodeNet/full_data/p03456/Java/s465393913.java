import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String a = sc.next();
    String b = sc.next();

    sc.close();

    int ab = Integer.valueOf(a + b);
    
    String result = "No";

    int c = 1;
    int d = 1;

    while (d <= ab) {
      if (d == ab){
        result = "Yes";
        break;
      }
      c++;
      d = c * c;
    }

    System.out.println(result);

  }

}