import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

  static int N;
  static int K;
  static long Q;
  static int A;
  static int B;
  static long C;
  static double min = 9999999;
  static long ans = 0;




  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();

    int B = scanner.nextInt();

    int K = scanner.nextInt();

    int cnt = 0;

    for (int i = 1; i < 101; i++) {
      if(A % i == 0 && B % i == 0){
        cnt++;
        if(cnt == K){
          System.out.println(i);
        }
      }
    }




  }

  static public boolean retAns(){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();








    return true;
  }

}
