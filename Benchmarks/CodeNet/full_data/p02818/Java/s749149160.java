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
      if(B >= K){
        B = B - K;
      }else if (B < K){
        B = 0;
      }
        
    }else if(A >= K){
      A = A - K;
    }
    System.out.print(A +" ");
    System.out.println(B);
  }
}
