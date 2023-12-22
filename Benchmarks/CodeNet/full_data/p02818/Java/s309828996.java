import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A =sc.nextInt();
    int B=sc.nextInt();
    int K =sc.nextInt();
    int L =Math.max(A-K,0);
    int R =B-L;
    System.out.println( L +""+R )
  }
}