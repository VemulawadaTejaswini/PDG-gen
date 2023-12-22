import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    double A = Math.log(N) / Math.log(K);
    for(int n = 0;n <= A ;n++){
      if(A < n+1 ){System.out.println( n+1 );};
    };
  }
}