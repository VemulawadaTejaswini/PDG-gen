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

    String s = scanner.next();
    int N = s.length();
    int[][] map = new int[s.length() + 1][s.length() + 1];


    for (int j = 0; j < 100000; j++) {


      int i = 0;
      while(s.length() > i + 1){
        if(s.charAt(i) == s.charAt(i + 1)){
          s = getS(s, i);
//          System.out.println(s);

        }
        i++;
      }


    }


    System.out.println(N - s.length());

  }

  static public String getS(String s, int i){
    if(s.length() > i + 2){
      return s.substring(0, Math.max(i - 1, 0)) + s.substring(i + 1, s.length());
    }

    if(s.length() == 2)return "";


    return s.substring(0,Math.max(0,i - 1));

  }
}
