import java.util.Scanner;
import java.util.Arrays;

public class Main{
  
  public void _main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    int[][] ab = new int[M][2];
    for (int i = 0; i < M; i++){
      ab[i] = new int[]{sc.nextInt(), sc.nextInt()};
    }

    Arrays.sort(ab, (x, y) -> Integer.compare(y[0], x[0]));

    int ans = 0;
    int prev = Integer.MAX_VALUE;
    for (int i = 0; i < M; i++){
      if (!(prev < ab[i][1])){
        prev = ab[i][0];
        ans++;
      }
    }
     System.out.println(ans);
     sc.close();
  }

  public static void main(String[] args){
    new Main()._main(args);
  }

}
