import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = in.readLine().split(" ");
      int h = Integer.parseInt(lines[0]);
      int w = Integer.parseInt(lines[1]);
      boolean[][] mat = new boolean[h][w];

      String line;
      for(int y=0; y<h; y++) {
        line = in.readLine();
        for(int x=0; x<w; x++) {
          mat[y][x] = line.charAt(x) == '#' ? true : false;
        }
      }

      int[] rx = {0,0,-1,1};
      int[] ry = {-1,1,0,0};
      boolean result = true;
      boolean isPossible = false;
      for(int y=0; result && y<h; y++) {
        for(int x=0; result && x<w; x++) {
          if(mat[y][x]) {
            for(int i=0; !isPossible && i<4; i++) {
              if(y+ry[i] > -1 && y+ry[i] < h && x+rx[i] > -1 && x+rx[i] < w)
                if(mat[y+ry[i]][x+rx[i]]) isPossible = true;
            }
            if(isPossible) isPossible = false;
            else {
              result = false;
              // System.out.println( y + " " + x);
            }
          }
        }
      }

      String ans = result ? "Yes" : "No";
      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}