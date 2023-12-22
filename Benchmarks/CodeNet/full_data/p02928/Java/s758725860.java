import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
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
          if(i < j){
            n1++;
          }else if(i > j){
            n2++;
          }
        }
      }
      ans += n1 * (K*(K+1)/2);
      ans %= mod;
      ans += n2 * (K*(K-1)/2);
      ans %= mod;
    } 
    System.out.println(ans);
  }
}