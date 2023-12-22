import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int sum = 0;
    for(int i = 0; i < N; i++){
      a[i] = sc.nextInt();
      sum += a[i];
    }
    long x = Math.round(sum / (double)N);
    
    long ans = 0;
    for(int i = 0; i < N; i++){
      ans += (a[i] - x) * (a[i] - x);
    }
    System.out.println(ans);
  }
}