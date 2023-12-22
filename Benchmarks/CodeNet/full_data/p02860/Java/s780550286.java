import java.util.*;
import static java.lang.System.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    String mae = S.substring(0,(N/2));
    String ato = S.substring(N/2);
    out.print(mae);
    out.print(ato);
    if (N % 2 == 0) {
      if (mae.equals(ato)) {
        out.print("Yes");
      } else {
        out.print("No");
      }
    } else {
      out.print("No");
    }
  }
}