import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = in.readLine().split(" ");
      int h = Integer.parseInt(lines[0]);
      int w = Integer.parseInt(lines[1]);

      char[][] table = new char[h][w];
      String line;
      for(int i=0; i<h; i++) {
        line = in.readLine();
        for(int j=0,k=0; j<w; j++, k+=2) {
          table[i][j] = (char)Character.getNumericValue(line.charAt(k));
        }
      }

      int n = 0;
      StringBuilder buf = new StringBuilder();
      for(int i=0; i<h-1; i++) {
        for(int j=0; j<w; j++) {
          if((table[i][j] & 1) == 1) {
            table[i][j]--;
            table[i+1][j]++;
            n++;
            buf.append(i+1).append(" ").append(j+1).append(" ")
               .append(i+2).append(" ").append(j+1).append("\n");
          }
        }
      }

      for(int j=0; j<w-1; j++) {
        if((table[h-1][j] & 1) == 1) {
          table[h-1][j]--;
          table[h-1][j+1]++;
          n++;
          buf.append(h).append(" ").append(j+1).append(" ")
             .append(h).append(" ").append(j+2).append("\n");
        }
      }
      StringBuilder ans = new StringBuilder();
      ans.append(n).append("\n").append(buf);

      System.out.print(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}