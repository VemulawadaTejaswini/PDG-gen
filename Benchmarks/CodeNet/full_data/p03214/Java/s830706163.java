import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for(int i=0; i<N; i++){
      a[i] = sc.nextInt();
    }
    //System.out.println(a[0]);
    int sum = 0;
    for(int i=0; i<N; i++){
      sum += a[i];
    }
    //System.out.println(sum);
    int ans = 999;
    int avg = sum/N;
    int min = 999;
    for (int i = 0; i < N ; i++) {
      int sa = Math.abs(a[i] - avg);
      if (min > sa) {
        ans = i;
        min = sa;
      }
    }
    System.out.println(ans);
  }
}
   