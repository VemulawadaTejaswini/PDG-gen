import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    if(A+B == 0) {
      System.out.println(0);
      return;
    }
    long time = N / (A + B);
    if(time > 1) {
      if(N - (A+B)*time - A >= 0){
        System.out.println(A*(time+1));
      }else{
        System.out.println((A * time) + (N - (A+B)*time));
      }
    }else if (A >= N){
      System.out.println(N);
    }else{
      System.out.println(A);
    }
  }
}