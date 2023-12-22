import java.util.*;
import java.math.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int K = 0;
    int[] G = new int[N];
    int[] Kcount = new int[N - 1];
    for(int i = 0; i < N; i++){
      G[i] = i + 1;
    }
    for(int i = 0; i < Kcount.length; i++){
      for(int j = i + 1; j < N; j++){
        K = G[j] - G[i];        
        if(Y <= G[j] && G[i] <= X){
          K -= Y - X - 1;
        }else if(G[j] < Y && X < G[j] && G[i] <= X){
          if(Y - G[j] < G[j] - X){
            K = (Y - G[i]) - (Y - X - 1) + Y - G[j];
          } 
        }else if(X < G[i] && G[j] <= Y){
           int tmp = 0;
           if(G[j] < Y){
             tmp = (G[i] - X + 1) + Y - G[j]; 
           }else{
             tmp = (G[i] - X + 1) + G[j] - Y;
           }
           if(tmp < K){
             K = tmp;
           }
        }
        Kcount[K - 1]++;
      }
    }
    for(int out : Kcount){
      System.out.println(out);
    }
  }
}