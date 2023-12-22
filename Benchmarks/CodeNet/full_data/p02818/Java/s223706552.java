import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A =sc.nextInt();
    int B=sc.nextInt();
    int K =sc.nextInt();
    int L =Math.max(A-K,0);
    int R =Math.max(B-L,0);
    System.out.println( L +" "+R );
  }
}