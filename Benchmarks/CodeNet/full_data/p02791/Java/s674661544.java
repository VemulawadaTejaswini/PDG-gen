import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] p = new int[n];
      int i,j;
      for(i=0;i<n;i++){
        p[i] = sc.nextInt();
      }
      int count = 0;
      int total = 0;
      for(i=0;i<n;i++,count=0){
        for(j=0;j<i;j++){
          if(p[i]<=p[j]){
            count++;
          }
          }
          if(count==i){
            total++;
        }
      }
      System.out.println(total);
      

      
    }
}
