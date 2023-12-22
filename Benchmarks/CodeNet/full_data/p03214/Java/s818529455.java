import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] f = new int[N];
    int sum = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      f[i] = n;
      sum += n;
    }
    
    int ave = sum/N;
    int ans = 0;
    int min = 100000;
    for(int i = 0; i < N; i++){
      int n = Math.abs(ave - f[i]);
      if(n < min){
        ans = i;
        min = n;
      }
    }
    System.out.println(ans);
  }
}