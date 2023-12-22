import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    boolean res = false;
    double i;
    for(i = 0; i <= 10000; ++i) {
      if( (int) (i * 0.08) == a && (int) (i * 0.1) == b) {
        res = true;
        break;
      }
    }
    if(res) System.out.println((int) i); 
    else System.out.println(-1);
  }
}