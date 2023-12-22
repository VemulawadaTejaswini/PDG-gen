import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    for (int i=X; ; i++) {
      boolean b = false;
      for (int j=2; j<=X/2; j++) {
        if (i%j == 0) {
          b = true;
          break;
        }
      }
      if (!b) {
        System.out.println(i);
        break;
      }
    }
  }
}
//