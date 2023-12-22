import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[m];
    int[] b = new int[m];
    int[] start = new int[m];
    int[] end = new int[m];
    int scount = 0;
    int ecount = 0;
    for(int i = 0;i<m;i++){
      a[i] = sc.nextInt();
      if(a[i] == 1){
        start[scount] = i;
        scount++;
      }
      b[i] = sc.nextInt();
      if(b[i] == n){
        end[ecount] = i;
        ecount++;
      }
    }
    boolean ans = false;
    unti:for(int i = 0;i<scount;i++){
      int aa = start[i];
      for(int j = 0;j<ecount;j++){
        int bb = end[j];
        if(b[aa] == a[bb]){
          ans = true;
          break unti;
        }
      }
    }
    if(ans){
      System.out.println("POSSIBLE");
    }else{
      System.out.println("IMPOSSIBLE");
    }
  }
}
