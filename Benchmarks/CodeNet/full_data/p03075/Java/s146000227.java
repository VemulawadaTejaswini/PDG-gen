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
//    Scanner scanner = new Scanner(System.in);

//    int A = scanner.nextInt();
//    int B = scanner.nextInt();



    if(get()){
        System.out.println("Yay!");
      }else{
        System.out.println(":(");
    }

  }

  public static boolean get(){
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    int D = scanner.nextInt();
    int E = scanner.nextInt();
    int K = scanner.nextInt();


    if(B - A > K)return false;
    if(C - A > K)return false;
    if(D - A > K)return false;
    if(E - A > K)return false;
    if(C - B > K)return false;
    if(D - B > K)return false;
    if(E - B > K)return false;
    if(D - C > K)return false;
    if(E - C > K)return false;
    if(E - D > K)return false;





    return true;
  }

}
