import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    String[][] picture = new String[H][W];
    for(int i = 0; i < H; i++) {
      for(int j = 0; j < W; j++) {
        picture[i][j] = sc.next();
      }
    }
    String[][] output = new String[2 * H][W];
    for(int i = 0; i < 2 * H; i++) {
      for(int j = 0; j < W; j++) {
        output[i][j] = picture[(i + 2) / 2 - 1][j];
      }
    }
    for(int i = 0; i < 2 * H; i++) {
      for(int j = 0; j < W; j++) {
        System.out.print(output[i][j]);
      }
      if(i != (2 * H - 1)) System.out.println("");
    }
  }
}