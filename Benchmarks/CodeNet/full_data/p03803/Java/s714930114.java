import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    if(A==1){
      A+=13;
    }
    if(B==1){
      B+=13;
    }
    if(A>B){
      System.out.println("Alice");
    }else if(B>A){
      System.out.println("Bob");
    }else{
      System.out.println("Draw");
    }
  }
}