import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    double A = Math.log(N) / Math.log(K);
    double B = Math.ceil( A );
    System.out.println( B );
  }
}