import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final int kinds = 3;
    int N = sc.nextInt();
    int[][] arrays = new int[N][kinds];
    for(int i = 0; i < N; i++){
      for(int j = 0; j < kinds; j++){
        arrays[i][j] = sc.nextInt();
      }
    }
    System.out.println(solve(arrays));
  }
  
  public static long solve(int[][] as){
    int N = as.length;
    for(int i = 1; i < as.length; i++){
      int[] tmps = Arrays.copyOf(as[i], as[i].length);
      for(int j = 0; j < as[i].length; j++){
        as[i][j] = tmps[j] + Math.max(as[i-1][(j+1) % 3], as[i-1][(j+2) % 3]);
      }
    }
    return Math.max(as[N-1][0], Math.max(as[N-1][1], as[N-1][2]));
  }
}