import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
       
    int[][] val = new int[N][3];
    int ax = 0, ay = 0, ah = 0;
    for(int i = 0; i < N; i++){
      val[i][0] = Integer.parseInt(sc.next());
      val[i][1] = Integer.parseInt(sc.next());
      val[i][2] = Integer.parseInt(sc.next());
      if(val[i][2] != 0){
        ax = val[i][0];
        ay = val[i][1];
        ah = val[i][2];
      }
    }
    
    for(int i = 0; i <= 100; i++){
      f:for(int j = 0; j <= 100; j++){
        int H = ah + Math.abs(ax-i) + Math.abs(ay-j);
        for(int k = 0; k < N; k++){
          int x = val[k][0], y = val[k][1], h = val[k][2];
          int M = h + Math.abs(x-i) + Math.abs(y-j);
          if(M == H){
            continue;
          }else{
            continue f;
          }
        }
        System.out.println(i+" "+j+" "+H);
        return;
      }
    }
  }
}