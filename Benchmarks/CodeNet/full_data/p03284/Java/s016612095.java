import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    if(N <= K){
      int ans = N % K;
      System.out.println(ans);
    }else{
      System.out.println(1);
    }
  }
}
