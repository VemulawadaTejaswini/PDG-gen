import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] w = new int[n];
    int bef = 0;
    int aft = 0;
    for(int i = 0;i<n;i++){
      w[i] = sc.nextInt();
      bef += w[i];
    }
    int dis = bef;
    for(int i = n-1;i>1;i--){
      bef -= w[i];
      aft += w[i];
      dis = Math.min(dis,Math.abs(bef - aft));
    }
    System.out.println(dis);
  }
}
