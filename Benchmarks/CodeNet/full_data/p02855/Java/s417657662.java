import java.util.*;

public class Main{
  static int H, W, K;
  static char[][] cake;
  static int[][] ans;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    H = Integer.parseInt(S[0]);
    W = Integer.parseInt(S[1]);
    K = Integer.parseInt(S[2]);
    cake = new char[H][W];
    ans = new int[H][W];
    int count = 1;
    for(int i = 0; i < H; i++){
      String T = sc.nextLine();
      for(int j = 0; j < W; j++){
        cake[i][j] = T.charAt(j);
        if(cake[i][j] == '#'){
          ans[i][j] = count;
          count++;
        }
      }
    }
    
    boolean[] check = new boolean[H];
    int s = 0;
    for(int i = 0; i < H; i++){
      boolean flag = false;
      for(int j = 0; j < W; j++){
        if(cake[i][j] == '#'){
          func(i, j-1, ans[i][j]);
          func(i, j+1, ans[i][j]);
          flag = true;
          s = i;
        }
      }
      if(!flag){
        check[i] = true;
      }
    }
    
    for(int i = 0; i < H; i++){
      if(check[i]){
        ans[i] = ans[s];
      }
    }
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        if(j == W-1){
          System.out.println(ans[i][j]);
        }else{
          System.out.print(ans[i][j]+" ");
        }
      }
    }
  }
  public static void func(int h, int w, int num){
    if(w < 0 || w >= W){
      return;
    }
    if(ans[h][w] > 0){
      return;
    }
    ans[h][w] = num;
    
    func(h, w-1, num);
    func(h, w+1, num);
  }
}