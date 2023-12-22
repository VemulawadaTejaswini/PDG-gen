import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long K = sc.nextLong();
    
    if(A >= K){
      A = A - K;
    } else {
      B = B - (K - A);
      A = 0;
      B = B > 0 ? B : 0;
    }
    
    System.out.println(A + " " + B);
  }
}
