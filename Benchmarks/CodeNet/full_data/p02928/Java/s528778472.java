import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    long K2 = K*(K+1)/2;
    int mod = 1000000007;
    int[] num = new int[N];
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(sc.next());
    }
    
    long ans = 0;
    for(int i = 0; i < N; i++){
      long n1 = 0;
      long n2 = 0;
      for(int j = 0; j < N; j++){
        if(num[i] > num[j]){
          n1++;
          if(i > j){
            n2++;
          }
        }
      }
      ans += n1 * K2;
      ans -= n2 * K;
      ans %= mod;
    } 
    System.out.println(ans);
  }
}