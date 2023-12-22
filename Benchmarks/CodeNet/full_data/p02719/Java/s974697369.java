import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long K = sc.nextLong();
    if(N < K){
      long A = K -N;
      if(A >= N){
        System.out.println(N); 
      }else{
        System.out.println(A); 
      }
    }else{
      long B = N % K;
      long A = K - B;
      if(A >= B){
        System.out.println(B); 
      }else{
        System.out.println(A); 
      }
    }
    return;
  }
}

