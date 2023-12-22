import java.util.*;
import java.math.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int[] ary = new int[N];
    int[] A = new int[N - 1];
    int kyori = 0;
    for(int i = 0; i < N; i++){
      ary[i] = i + 1;
    }
    for(int i = 0; i < A.length; i++){
      for(int j = i + 1; j < N; j++){
        kyori = ary[j] - ary[i];        
        if(ary[j] >= Y && 2 >= ary[i]){
          kyori -= Y - X - 1;
        }
        A[kyori - 1]++;
      }
    }
    for(int out : A){
      System.out.println(out);
    }
  }
}