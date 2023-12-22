import java.util.Arrays;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    for(int i=0; i<n; ++i) x[i] = sc.nextInt();

    Arrays.sort(x);
    int x_min = x[0];
    int x_max = x[n-1];

    //nが最大でも100なので全探索でやる
    int move_min = Integer.MAX_VALUE;
    for(int j=x_min; j<=x_max; ++j) {
      int move_sum = 0;
      for(int i=0; i<n; ++i) {
        move_sum += (x[i] - j) * (x[i] - j);
      }
      if(move_sum <= move_min) {
        move_min = move_sum;
      }
    }
    System.out.println(move_min);
  }
}