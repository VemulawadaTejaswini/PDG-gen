import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] h = new int[n];
      for(int i=0;i<n;i++){
        h[i] = sc.nextInt();
      }
      long minx = 1000000001;
      Arrays.sort(h);
      for(int i=0;i<n-(k-1);i++){
        if(h[i+(k-1)]-h[i]<minx){
          minx = h[i+(k-1)]-h[i];
        }
      }
      System.out.println(minx);
    }
}
