import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] p = new int[m];
      String[] s = new String[m];
      int i;
      int ac = 0;
      int wa = 0;
      int[] pro = new int[n];
      for(i=0;i<n;i++){
        pro[i] = 0;
      }
      for(i=0;i<m;i++){
        p[i] = sc.nextInt();
        s[i] = sc.next();
      }
      i = 0;
      while(i<m){
        if(pro[p[i]-1]==1){
          i++;
          continue;
        }
        if(s[i].equals("AC")){
          ac += 1;
          pro[p[i]-1]=1;
          i++;
        }else{
          wa += 1;
          i++;
        }
      }
      System.out.println(ac+" "+wa);
  }
}
