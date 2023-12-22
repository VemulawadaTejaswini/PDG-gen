import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int ans = 0,times = 0,now = 1;
    for(int i = 0;i<n;i++){
      times++;
      now--;
      now = a[now];
      if(now == 2){
        ans = 1;
        break;
      }
    }
    if(ans == 1){
      System.out.println(times);
    }else{
      System.out.println(-1);
    }
  }
}
