import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner S = new Scanner(System.in);
    int N = S.nextInt();
    int L = S.nextInt();
    int sum = N*(L - 1) + N*(N+1)/2;
    if( (L <= 0) & (0 <= L+N-1)){
      System.out.println(sum);
    }
    if( 0 < L ){
      System.out.println(sum - L);
    }
    if( L+N-1 < 0 ){
      System.out.println(sum - L-N+1);
    }
  }
}