import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    long[] val = new long[N];
    long sum = 0;
    for(int i = 0; i < N; i++){
      val[i] = Integer.parseInt(sc.next());
      sum += val[i];
    }
    
    long ans = Long.MAX_VALUE;
    long now = 0;
    for(int i = 0; i < N-1; i++){
      now += val[i];
      long dis = Math.abs(sum-now*2);
      if(dis < ans){
        ans = dis;
      }
    }
    System.out.println(ans);
  }
}