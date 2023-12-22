import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int H = Integer.parseInt(S[0]);
    int W = Integer.parseInt(S[1]);
    
    char[][] field = new char[H][W];
    int white = 0;
    Queue<Integer> qx = new ArrayDeque<>();
    Queue<Integer> qy = new ArrayDeque<>();
    for(int i = 0; i < H; i++){
      String T = sc.nextLine();
      for(int j = 0; j < W; j++){
        field[i][j] = T.charAt(j);
        if(field[i][j] == '.'){
          white++;
        }else{
          qx.add(i);
          qy.add(j);
        }
      }
    }
    
    int[] sx = {0,0,1,-1};
    int[] sy = {1,-1,0,0};
    int ans = 0;
    
    while(white > 0){
      int count = 0;
      int n = qx.size();
      for(int i = 0; i < n; i++){
        int a = qx.poll();
        int b = qy.poll();
        for(int j = 0; j < 4; j++){
          int A = a+sx[j];
          int B = b+sy[j];
          if(A >= 0 && A < H && B >= 0 && B < W){
            if(field[A][B] == '.'){
              field[A][B] = '#';
              qx.add(A);
              qy.add(B);
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