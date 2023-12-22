import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n+1];
    int[] b = new int[n];
    int bsum = 0;
    int x = 0;
    int cnt = 0;
    for(;cnt<=n;cnt++){
      a[cnt] = sc.nextInt();
    }
    for(cnt = 0;cnt<n;cnt++){
      b[cnt] = sc.nextInt();
      bsum += b[cnt];
    }
    for(cnt = 0;cnt<n;cnt++){
      if(a[cnt]>=b[cnt]){
        b[cnt] = 0;
      }else{
        b[cnt] = b[cnt]-a[cnt];
        if(a[cnt+1]>=b[cnt]){
          a[cnt+1] -= b[cnt];
          b[cnt] = 0;
        }else{
          b[cnt] -= a[cnt+1];
          a[cnt+1] = 0;
        }
      }
      x += b[cnt];
    }
    System.out.println(bsum-x);
  } 
}