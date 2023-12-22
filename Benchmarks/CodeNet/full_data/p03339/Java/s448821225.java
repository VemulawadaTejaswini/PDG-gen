import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());
      String line = in.readLine();

      int[] d = new int[n];
      for(int i=0,p=0; i<n; i++) {
        if(line.charAt(i) == 'E')
          d[i] = ++p;
        else
          d[i] = p;
      }

      int maxE = d[n-1];
      int ans = maxE - d[0];
      for(int i=1; i<n; i++) {
        ans = Math.min(ans, i-d[i-1] + maxE-d[i]);
      }

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}