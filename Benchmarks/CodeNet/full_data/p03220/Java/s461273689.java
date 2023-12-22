import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();
    int[] h = new int[n];
    double[] res = new double[n];
    double min;
    int ans;
    h[0] = sc.nextInt();
    res[0] = t - h[0]*0.006;
    min = a-Math.abs(res[0]);
    ans = 0;
    for(int i=1;i<n;i++){
      h[i] = sc.nextInt();
      res[i] = t - h[i]*0.006;
      if(a-Math.abs(res[i])<ans){
        min = a-Math.abs(res[i]);
        ans=i;
      }
    }
    System.out.println(ans+1);
    
  }
}