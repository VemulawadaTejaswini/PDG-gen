import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    long[] T = new long[N];
    long ans = 1;
    for (int i = 0; i< N; i++){
      T[i] = scanner.nextLong();
    }
    if (N == 1){
      System.out.println(T[0]);
    } else if (N >= 2){
      ans = getLCM(T[0], T[1]);
      for (int i = 2 ; i < N; i++){
        ans = getLCM(T[i], ans);
      }
      System.out.println(ans);
      }
  }
  public static long getGCM(long a, long b){
    if(a < b) return getGCM(b, a);
    if(b == 0) return a;
    return getGCM(b, a % b);
  }
  public static long getLCM(long a, long b){
    return a * b / getGCM(a, b);
  }
}
