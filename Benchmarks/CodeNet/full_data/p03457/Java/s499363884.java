import java.util.*;
import java.io.*;
class Main{
  public static void main(String[] args){
    Integer t[] = new Integer[110000];
    Integer x[] = new Integer[110000];
    Integer y[] = new Integer[110000];
    boolean can = true;
    t[0] = x[0] = y[0] = 0;

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for (int i = 0; i < N-1; i++) {
      t[i+1] = sc.nextInt();
      x[i+1] = sc.nextInt();
      y[i+1] = sc.nextInt();
    }
    for (int i = 0; i < N-2; i++) {
      int dt = t[i+1] - t[i];
      int dist =  Math.abs(x[i+1] - x[i]) + Math.abs(y[i+1] - y[i]) ;
      // System.out.println(can + " "  + i);
      if( (dist <= dt) && (dt%2 == dist%2) ){
        can = true;
      }else{
        can = false;
        break;
      }
      // if(!can)break;
    }
    if(!can) {
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
  }
}
