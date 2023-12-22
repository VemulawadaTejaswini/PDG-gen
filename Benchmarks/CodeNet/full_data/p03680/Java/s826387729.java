import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      int i;
      for(i=0;i<n;i++){
        a[i] = sc.nextInt();
      }
      int ans = 0;
      int total = 0;
      for(i=0;i<n;i++){
        if(a[i]==2){
          total++;
          ans = 1;
          break;
        }else{
          total++;
        }
      }
      if(ans==1){
        System.out.println(-1);
      }else{
        System.out.println(total);
      }
        
  }
}
