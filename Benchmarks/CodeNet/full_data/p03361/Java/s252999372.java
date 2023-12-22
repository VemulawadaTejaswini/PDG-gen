import java.io.*;
import java.util.*;



class Main{
  public static void main(String[] args){
    int[] dx = {-1, 0,0,1};
    int[] dy = { 0,-1,1,0};

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();

    char[][] original = new char[100][100];
    for (int i = 0; i < h; i++) {
      String s = sc.next();
      for (int j = 0; j < w; j++) {
        original[i][j] = s.charAt(j);
      }
    }

    boolean canpaint = true;
    String bomb = "#";
    char[] charBomb = bomb.toCharArray();
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if(original[i][j] == charBomb[0]){
          if(original[i-1][j]!=charBomb[0] && original[i+1][j]!=charBomb[0] && original[i][j-1]!=charBomb[0] && original[i][j+1]!=charBomb[0]){
            canpaint  = false;
            return;
          }
        }
      }
    }
    
  

    if(canpaint){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
