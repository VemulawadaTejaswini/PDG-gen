import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  // wrong answer
  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());
      String line = in.readLine();

      int[] aW = new int[n+1];
      int[] aE = new int[n+1];
      for(int i=1, cw=0, ce=0; i<=n; i++) {
        if(line.charAt(i-1) == 'W')
          cw++;
        else
          ce++;
        
        aW[i] = cw;
        aE[i] = ce;
      }

      int maxE = aE[n];
      int ans = n;
      for(int i=1; i<=n; i++) {
        ans = Math.min(ans, aW[i-1] + (maxE - aE[i]));
        // System.out.println(i + ":" + aW[i-1] + "+" + (maxE - aE[i]));
      }
      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}