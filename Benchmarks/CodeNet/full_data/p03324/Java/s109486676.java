import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int N = sc.nextInt();
    int d;
    
    if(D==0) {
      if(N==100) {
        d = 101;
      } else {
        d = N;
      }
    } else if(D==1) {
      if(N==100) {
        d=10100;
      } else {
        d = 100 * N;
      }
    } else {
      if(N==100) {
        d = 1010000;
      } else {
        d = 10000 * N;
      }
    }
    System.out.println(d);
  }
}