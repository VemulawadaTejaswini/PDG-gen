import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] s = new char[h+2][w+2];
    String[] S = new String[h];
    for (int i = 0; i<w;i++){
      S[i] = sc.next();
      for(int j=0;j<w;j++) {
        s[i+1][j+1]=S[i].charAt(j);
      }
    }
    sc.close();
    
    int[] pointX = new int[]{0,0,1,-1};
    int[] pointY = new int[]{1,-1,0,0};
    boolean judge = true;
    for (int i = 1;i < h+1;i++){
      if (!judge){break;}
      for (int j = 1;j < w+1;j++){
        if (s[i][j] == '#'){
          boolean islink = false;
          for (int k = 0;k<4;k++){
            int targetX = j + pointX[k];
            int targetY = i + pointY[k];
            if (s[targetY][targetX] == '#'){
              islink = true;
              break;
            }
          }
          if (!islink){
            judge = false;
            break;
          }
        }
      }
    }
    String ans = judge ? "Yes":"No";
    System.out.println(ans);
  }
}