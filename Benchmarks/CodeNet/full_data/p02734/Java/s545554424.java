import java.util.*;
import java.io.*;

public class Main{
  static int N, K;
  static long P = 998244353;
  static long[] sum;
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    
    String[] S = sc.nextLine().split(" ");
    N = Integer.parseInt(S[0]);
    K = Integer.parseInt(S[1]);
    S = sc.nextLine().split(" ");
    sum = new long[N];
    for(int i = 0; i < N; i++){
      long n = Long.parseLong(S[i]);
      sum[i] += n;
      if(i != 0){
        sum[i] += sum[i-1];
      }
    }
    long ans = 0;
    for(int i = 0; i < N; i++){
      for(int j = i; j < N; j++){
        ans += func(i, j);
        ans %= P;
      }
    }
    System.out.println(ans);
  }
  
  static long func(int a, int b){
    long count = 0;
    for(int j = a; j <= b; j++){
      for(int i = j; i <= b; i++){
        long s = a == 0 ? sum[i] : sum[i]-sum[a-1];
        if(s == K){
          count++;
        }
      }
    }
    return count;
  }
}