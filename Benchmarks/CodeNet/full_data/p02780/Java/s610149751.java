import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    
    int[] nums = new int[N];
    for(int i = 0; i < N; i++){
      nums[i] = Integer.parseInt(sc.next());
    }
    
    double[] p = new double[1001];
    for(int i = 1; i < 1001; i++){
      p[i] = (i+1)/2.0;
    }
    
    double max = 0;
    double now = 0;
    for(int i = 0; i < N; i++){
      if(i < K){
        now += p[nums[i]];
      }else{
        now += p[nums[i]];
        now -= p[nums[i-K]];
      }
      max = Math.max(max, now);
    }
    System.out.println(max);
  }
}