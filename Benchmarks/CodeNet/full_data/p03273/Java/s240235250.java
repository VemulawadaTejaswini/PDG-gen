import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int H = Integer.parseInt(S[0]);
    int W = Integer.parseInt(S[1]);
    
    boolean[] h = new boolean[H];
    boolean[] w = new boolean[W];
    char[][] field = new char[H][W];
    for(int i = 0; i < H; i++){
      String T = sc.nextLine();
      for(int j = 0; j < W; j++){
        field[i][j] = T.charAt(j);
        if(field[i][j] == '#'){
          h[i] = true;
          w[j] = true;
        }
      }
    }
    
    for(int i = 0; i < H; i++){
      boolean f = false;
      for(int j = 0; j < W; j++){
        if(h[i] && w[j]){
          f = true;
          System.out.print(field[i][j]);
        }
      }
      if(f){
        System.out.println("");
      }
    }
  }
}