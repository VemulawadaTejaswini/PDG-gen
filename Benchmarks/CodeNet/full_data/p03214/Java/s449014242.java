import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for(int i=0; i<N; i++){
      a[i] = sc.nextInt();
    }
    int sum = 0;
    for(int i=0; i<N; i++){
      sum += a[i];
    }
    
    double avg = sum/N;
    double[] d = new double[N];
    for (int i = 0; i < N; i++) {
      d[i] = Math.abs(avg-a[i]);
    } 
    double min = Double.MAX_VALUE;
    int ans = 0;
    for (int i = 0; i < N; i++) {
      if( d[i] < min ) {
        ans = i;
        min = d[i];
      }
    }
    System.out.println(ans);
  }
}
   