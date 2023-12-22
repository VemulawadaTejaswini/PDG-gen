import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    sc.nextLine();
    String[][] arr = new String[H][W];
    for(int i = 0; i < H; i++) {
      String line = sc.nextLine();
      for(int j = 0; j < W; j++) {
        arr[i][j] = line.charAt(j) + "";
      }
    }
    
    if(objective(arr, H, W))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
  
  public static boolean objective(String[][] arr, int H, int W) {
    for(int i = 0; i < H; i++) {
      for(int j = 0; j < W; j++) {
        if(arr[i][j].equals("#")) {
          boolean up = i != 0 && arr[i-1][j].equals("#");
          boolean left = j != 0 && arr[i][j-1].equals("#");
          boolean right = j != W-1 && arr[i][j+1].equals("#");
          boolean down = i != H-1 && arr[i+1][j].equals("#");
          if(!(up || left || right || down))
            return false;
        }
      }
    }
    return true;
  }
}
