import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int[][] m = new int[H][W];
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        m[i][j] = sc.nextInt();
      }
    }

    List<String> list = new ArrayList<>();
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (m[i][j]%2 == 1) {
          m[i][j]--;
          if (j < W-1) {
            m[i][j]--;
            m[i][j+1]++;
            list.add((i+1)+" "+(j+1)+" "+(i+1)+" "+(j+2));
          } else if (i < H-1) {
            m[i][j]--;
            m[i+1][j]++;
            list.add((i+1)+" "+(j+1)+" "+(i+2)+" "+(j+1));
          }
        }
      }
    }
    
    System.out.println(list.size());
    StringBuilder ans = new StringBuilder();
    for (String s : list) {
      ans.append(s).append('\n');
    }
    System.out.print(ans);
  }
}