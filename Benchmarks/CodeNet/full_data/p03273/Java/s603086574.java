import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] a = new int[h][w];
    int[] gyou = new int[h];
    int[] retu = new int[w];
    for(int i = 0;i<h;i++){
      String ss = sc.next();
      for(int j = 0;j<w;j++){
        // System.out.println("i= "+i+" j= "+j);
        String s = ss.substring(j,j+1);
        if(s.equals("#")){
          a[i][j]=1;
          gyou[i] = 1;
          retu[j] = 1;
        }
      }
    }
    for(int i = 0;i<h;i++){
      for(int j = 0;j<w;j++){
        if(gyou[i] == 0 || retu[j] == 0){
          a[i][j] = -1;
        }
      }
    }
    for(int i = 0;i<h;i++){
      boolean ch = false;
      for(int j = 0;j<w;j++){

        if(a[i][j] == 0){
          System.out.print(".");
          ch = true;
        }else if(a[i][j] == 1){
          System.out.print("#");
          ch = true;
        }
      }
      if(ch)System.out.println("");
    }

  }
}
