import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n_half = n/2;

    int[] d = new int[n];

    for(int i=0; i<n; i++){
      d[i] = sc.nextInt();
    }
    //配列のソート
    Arrays.sort(d);


    int small_diff = d[n_half-1];
    int big_diff = d[n_half];
    int ans = d[n_half]-d[n_half-1];

    System.out.println(ans);


  }
}