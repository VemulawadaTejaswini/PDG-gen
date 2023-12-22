import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int X = Integer.parseInt(S[1]);
    
    String[] T = sc.nextLine().split(" ");
    int[] num = new int[N];
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(T[i]);
    }

    long ans = Math.abs(X - num[0]);
    for(int i = 1; i < N; i++){
      long n = Math.abs(X - num[i]);
      ans = gcd(ans, n);
    }
    
    System.out.println(ans);
  }
  
  public static long gcd(long m, long n) {
    if(m < n){
      return gcd(n, m);
    }
    
    if(n == 0){
      return m;
    }
    
    return gcd(n, m % n);
  }
}