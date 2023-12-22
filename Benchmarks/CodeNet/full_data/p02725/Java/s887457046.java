import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] sub = new int[n];
    int dis = 0;
    int max_dis = 0;

    for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }

    for(int j=0; j<n; j++){
      if(j<n-1){
        sub[j] = a[j+1]-a[j];
        dis += sub[j];
      }else if(j==n-1){
        sub[n-1] = k - a[n-1]+a[0];
        dis += sub[n-1];
      }

      if(j>1){
        max_dis = Math.max(sub[j],sub[j-1]);
      }

    }
    System.out.println(dis - max_dis);





  }
}