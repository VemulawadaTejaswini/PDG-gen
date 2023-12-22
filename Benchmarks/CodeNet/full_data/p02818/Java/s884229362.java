import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long K = sc.nextLong();
    
    if(K <= A){
      A = A - K;
    }else if(A < K && K <= A + B){
      B = B - (K -A);
      A = 0;
    }else if(A + B <= K){
      A = 0;
      B = 0;
    }
    System.out.println(A + " " + B);
}
}
