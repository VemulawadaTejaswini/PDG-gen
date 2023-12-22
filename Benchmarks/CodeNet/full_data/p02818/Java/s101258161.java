
import java.util.Scanner;

class main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int A = s.nextInt();
    int B = s.nextInt();
    int K = s.nextInt();

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
