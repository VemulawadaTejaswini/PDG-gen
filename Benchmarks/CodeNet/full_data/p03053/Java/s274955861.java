import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int H = Integer.parseInt(S[0]);
    int W = Integer.parseInt(S[1]);
    
    char[][] field = new char[H][W];
    boolean[][] check = new boolean[H][W];
    int white = 0;
    for(int i = 0; i < H; i++){
      String T = sc.nextLine();
      for(int j = 0; j < W; j++){
        field[i][j] = T.charAt(j);
        check[i][j] = true;
        if(field[i][j] == '.'){
          white++;
        }
      }
    }
    
    Queue<Integer> qx = new ArrayDeque<>();
    Queue<Integer> qy = new ArrayDeque<>();
    int[] sx = {0,0,1,-1};
    int[] sy = {1,-1,0,0};
    int ans = 0;
    while(white > 0){
      int count = 0;
      for(int i = 0; i < H; i++){
        for(int j = 0; j < W; j++){
          if(field[i][j] == '#' && check[i][j]){
            qx.add(i);
            qy.add(j);
            check[i][j] = false;
          }
        }
      }
      
      if(qx.isEmpty()){
        break;
      }
      
      while(!qx.isEmpty()){
        int a = qx.poll();
        int b = qy.poll();
        for(int i = 0; i < 4; i++){
          if(a+sx[i] >= 0 && a+sx[i] < H && b+sy[i] >= 0 && b+sy[i] < W){
            if(field[a+sx[i]][b+sy[i]] == '.'){
              field[a+sx[i]][b+sy[i]] = '#';
              count++;
            }
          }
        }
      }
      ans++;
      white -= count;
    }
    System.out.println(ans);
  }
}