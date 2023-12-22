
import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    long A = s.nextLong();
    long B = s.nextLong();
    long K = s.nextLong();

    if(A < K){
      K = K - A;
      A = 0;
      B = B - K;
    }else if(A >= K){
      A = A - K;
    }
    System.out.print(A +" ");
    System.out.println(B);
  }
}
