import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[][] c = new int[3][3];
    int[] r = new int[3];
    boolean flag = true;

    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        c[i][j] = scan.nextInt();
      }
    }

    outside:for(int i = 0; i < 3; i++){
      int a = 101;
      for(int j = 0; j < 3; j++){
        a = Math.min(c[i][j], a);
      }
      if(i == 0){
        for(int j = 0; j < 3; j++){
          r[j] = c[i][j] - a;
        }
      }
      if(i > 0){
        for(int j = 0; j < 3; j++){
          if(r[j] != c[i][j]-a){
            flag = false;
            System.out.println("No");
            break outside;
          }
        }
      }
    }

    if(flag == true){System.out.println("Yes");}
  }
}
