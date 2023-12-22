import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int train = N * A;
    int taxi = B;
    
    if(N > 20 || N < 1 || A > 50 || A < 1 || B > 20 || B < 1 ){
      return;
    }
    
    if(train >= taxi){
      System.out.println(train);
    }else{
      System.out.println(taxi);
    }
  }
}