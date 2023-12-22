import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    long initial = (long) Math.pow(10,n-1);
    boolean [] a = new boolean[]{true,true,true};
    long [] g = new long[3];
    for (int i=0; i<m; i++){
      int b = scan.nextInt();
      if (a[b-1] == false){
        long gg = scan.nextInt();
        if (gg != g[b-1]){
          System.out.println(-1);
          return;
        }
        continue;
      }
      else{
        a[b-1] = false;
      }
      long c = scan.nextInt();
      g[b-1] = c;
      if (b == 1){
        if (c==0){
          System.out.println(-1);
          return;
        }
        c-=1;
      }
      double power = Math.pow(10,n-b);
      long p = (long) power;
      c = c*p;
      initial += c;
    }
    System.out.println(initial);
  }
}
