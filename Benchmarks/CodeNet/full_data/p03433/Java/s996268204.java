import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N, A, b;
    N = sc.nextInt();
    A = sc.nextInt();
    
    b = N % 500;
    
    if (b <= A){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }  
  }
}
